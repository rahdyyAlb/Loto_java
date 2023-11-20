package fr.it_akademy.loto;

import fr.it_akademy.loto.business.Departement;
import fr.it_akademy.loto.business.Joueur;
import fr.it_akademy.loto.business.Ville;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Joueur joueur1 = new Joueur("TOTO");
        joueur1.setPrenom("Sophie");
        System.out.println(joueur1);

        Joueur joueur2 = new Joueur("TITI", LocalDate.of(2000, 1, 1));
        System.out.println(joueur2);

        Joueur joueur3 = new Joueur();
        System.out.println(joueur3);

        Ville ville1 = new Ville();
        System.out.println(ville1);

        Ville ville2 = new Ville("69009");
        System.out.println(ville2);

        Ville ville3 = new Ville("69009","69123");
        System.out.println(ville3);

        Ville ville4 = new Ville("69008","69123",1.234,90.4843);
        System.out.println(ville4);

        Departement departement1 = new Departement();
        System.out.println(departement1);

        Departement departement2 = new Departement("Rhone");
        System.out.println(departement2);

    }

}