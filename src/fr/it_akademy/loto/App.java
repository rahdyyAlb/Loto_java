package fr.it_akademy.loto;

import java.util.List;
import java.util.ArrayList;
import fr.it_akademy.loto.business.Departement;
import fr.it_akademy.loto.business.Joueur;
import fr.it_akademy.loto.business.Region;
import fr.it_akademy.loto.business.Ville;
import java.time.LocalDate;
import java.util.Random;

public class App {
    private static List<String> prenoms = new ArrayList<>();
    private static List<Joueur> joueurs = new ArrayList<>();
    private static List<Ville> villes = new ArrayList<>();
    private static List<Departement> departements = new ArrayList<>();
    private static List<Region> regions = new ArrayList<>();

    public static void main(String[] args) {

        ajouterPrenoms();
        afficherPrenoms();

        ajouterJoueurs();
        afficherJoueurs();

        ajouterVilles();
        afficherVilles();

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
    private static void afficherPrenoms(){
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
        joueurs.add(0, new Joueur( prenomHsd));
        joueurs.add(new Joueur("Mathieu"));
        joueurs.add(new Joueur("Rahdy","Ali bacari","0610859518",LocalDate.of(1994,3,28)));
        joueurs.add(2, new Joueur( "Coraline"));
        joueurs.add(1, new Joueur("Eloi"));
        joueurs.add(new Joueur("Alex"));
    }

    private static void afficherJoueurs(){
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
        villes.add( new Ville("78009"));
        villes.add (new Ville("69100"));
        villes.add (new Ville("69001"));
        villes.add (new Ville("63003"));
        villes.add (new Ville("59001"));
        villes.add (new Ville("42002"));

    }

    private static void afficherVilles(){
        for (Ville ville : villes) {

            System.out.println(ville);
        }

    }

}