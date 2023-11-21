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

    public static void main(String[] args) {

        importerVilles();

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

    private static void ajouterJoueurs() {
// ondeclare un ojb de type rdm
        Random nbm = new Random();
        //int nbrOfList = prenoms.lastIndexOf(prenoms);

        // on invoque la methode size sur la list des prenoms
        int positionHsd = prenoms.size();
        // on invoque la methode get sur la liste des prenoms en donnant en parametre un nbr en 0 et 14
        String prenomHsd = prenoms.get(nbm.nextInt(positionHsd));
        // on ajoute un nouveau joueur a la liste des joueurs , se joueur aura le prénom choisie aléatoirement
        joueurs.add(0, new Joueur(prenomHsd));
        joueurs.add(new Joueur("Mathieu"));
        joueurs.add(new Joueur("Rahdy", "Ali bacari", "0610859518", LocalDate.of(1994, 3, 28)));
        joueurs.add(2, new Joueur("Coraline"));
        joueurs.add(1, new Joueur("Eloi"));
        joueurs.add(new Joueur("Alex"));
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