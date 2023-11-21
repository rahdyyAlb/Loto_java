package fr.it_akademy.loto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

import fr.it_akademy.loto.business.Departement;
import fr.it_akademy.loto.business.Joueur;
import fr.it_akademy.loto.business.Region;
import fr.it_akademy.loto.business.Ville;

import java.time.LocalDate;

public class App {
    private static List<String> prenoms = new ArrayList<>();
    private static List<Joueur> joueurs = new ArrayList<>();
    private static List<Ville> villes = new ArrayList<>();
    private static Set<Departement> departements = new HashSet<>();
    private static Set<Region> regions = new HashSet<>();

    private static int[] grilleGagnante = grilleGenerator();

    public static void main(String[] args) {

        importerVilles();
        ajouterPrenoms();
        ajouterJoueurs(4);
        saisirGrille();
        afficherJoueurs();
        String stringG = Arrays.toString(grilleGagnante);
        System.out.println("Voici grille gagnant : " + stringG);
        System.out.println("Voici la liste des gagnants : " + determinerGagnant(grilleGagnante));

    }

    private static void saisirGrille() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, veuillez saisir votre prénom : ");
        String joueurNom = scanner.nextLine();

        Set<Integer> grilleUtilisateur = new HashSet<>();

        while (grilleUtilisateur.size() < 5) {
            System.out.println("Veuillez saisir un nombre entre 1 et 50 : ");

            if (scanner.hasNextInt()) {
                int nombre = scanner.nextInt();

                if (nombre >= 1 && nombre <= 50 && !grilleUtilisateur.contains(nombre)) {
                    grilleUtilisateur.add(nombre);
                } else {
                    System.out.println("Nombre invalide ou déjà saisi. Veuillez réessayer.");
                }
            } else {
                System.out.println("Entrée non valide. Veuillez saisir un nombre.");
                scanner.next();
            }
        }

        int[] grilleArray = grilleUtilisateur.stream().mapToInt(Integer::intValue).toArray();

        Joueur utilisateur = new Joueur(joueurNom);
        utilisateur.setGrille(grilleArray);
        joueurs.add(utilisateur);

        System.out.print("Le joueur " + joueurNom + " a été ajouté avec la grille suivante : [");
        for (int nombre : grilleArray) {
            System.out.print(nombre + " ");
        }
        System.out.println("]");
    }

    private static String determinerGagnant(int[] grilleGagnante) {
        for (Joueur joueur : joueurs) {
            if (compareGrilles(joueur.getGrille(), grilleGagnante)) {
                return joueur.toString();
            }
        }
        return "Aucun gagnant";
    }

    private static boolean compareGrilles(int[] grilleJoueur, int[] grilleGagnante) {
        for (int i = 0; i < grilleJoueur.length; i++) {
            if (grilleJoueur[i] != grilleGagnante[i]) {
                return false;
            }
        }
        return true;
    }


    private static void importerVilles() {

        try {
            URL url = new URL("https://www.data.gouv.fr/fr/datasets/r/dbe8a621-a9c4-4bc3-9cae-be1699c5ff25");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            String inputLine;
            in.readLine();
            while ((inputLine = in.readLine()) != null) {
                String[] resultat = inputLine.split(",");

                double latidute = 0;
                double longitude = 0;
                if (!resultat[5].equals("")) {
                    latidute = Double.parseDouble(resultat[5]);
                }
                if (!resultat[6].equals("")) {
                    longitude = Double.parseDouble(resultat[6]);
                }

                Ville ville = new Ville(resultat[2], resultat[0], resultat[1], latidute, longitude);
                villes.add(ville);

                Region region = null;
                if (resultat.length >= 14) {
                    region = new Region(resultat[14]);
                    Departement departement = new Departement(resultat[12], resultat[11], region);
                    departements.add(departement);
                    System.out.println(region);
                    regions.add(region);
                    ville.setDepartement(departement);
                }

            }

            in.close();


        } catch (MalformedURLException e) {
            System.out.println("URL incorrecte");
            // On décide d'arrêter l'application
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Problème réseau");
            // En cas de panne réseau, nous allons arriver ici
            System.exit(-1);
        }

        System.out.println("Nombre de villes : " + villes.size());
        System.out.println("Nombre de départements : " + departements.size());
        System.out.println("Nombre de régions : " + regions.size());

    }

    private static void ajouterPrenoms() {
        prenoms.add("Mathieu");
        prenoms.add("Rhady");
        prenoms.add("Alex");
        prenoms.add("Benamar");
        prenoms.add("PL");
        prenoms.add("Lucas");
        prenoms.add("Joseph");
        prenoms.add("Cédric");
        prenoms.add("Dasha");
        prenoms.add("Victorien");
        prenoms.add("Léa");
        prenoms.add(0, "Coraline");
        prenoms.add(1, "Eloi");
        prenoms.add("Alex");
    }

    private static void afficherPrenoms() {
        for (String premon : prenoms) {

            System.out.println(premon);
        }

    }

    private static void ajouterJoueurs(int nbrJoueur) {
        for (int i = 0; i < nbrJoueur; i++) {
            Random nbm = new Random();
            int positionHsd = prenoms.size();
            String prenomHsd = prenoms.get(nbm.nextInt(positionHsd));

            int[] grilleJoueur = grilleGenerator();
            Joueur joueur = new Joueur(prenomHsd);
            joueur.setGrille(grilleJoueur);
            joueurs.add(joueur);
        }
    }

    private static int[] grilleGenerator() {
        int[] grille = new int[5];
        Set<Integer> grilleJoueur = new HashSet<>();

        while (grilleJoueur.size() < 5) {
            int min = 1;
            int max = 50;
            Random nbm2 = new Random();
            int nrdm = nbm2.nextInt(max - min + 1) + min;
            grilleJoueur.add(nrdm);
        }

        int i = 0;
        for (Integer number : grilleJoueur) {
            grille[i++] = number;
        }

        return grille;
    }

    private static void afficherJoueurs() {
        for (Joueur joueur : joueurs) {

            System.out.println(joueur);
        }

    }

    private static void ajouterVilles() {
        villes.add(new Ville("69009"));
        villes.add(new Ville("69100"));
        villes.add(new Ville("13003"));
        villes.add(new Ville("13009"));
        villes.add(new Ville("75016"));
        villes.add(new Ville("78009"));
        villes.add(new Ville("69100"));
        villes.add(new Ville("69001"));
        villes.add(new Ville("63003"));
        villes.add(new Ville("59001"));
        villes.add(new Ville("42002"));

    }

    private static void afficherVilles() {
        for (Ville ville : villes) {

            System.out.println(ville);
        }

    }

}