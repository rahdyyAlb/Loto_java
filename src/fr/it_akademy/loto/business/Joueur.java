package fr.it_akademy.loto.business;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Cette classe représente le concept de Joueur
 */
public class Joueur {

    // Attributs : ce qui définit un joueur
    private Long id;
    private String prenom;
    private String nom;
    private String numeroDeTelephone;
    private LocalDate dateDeNaissance;
    private int grille[];
    // Le compteur sert à obtenir un id unique pour chaque joueur
    // Le compteur est commun à tous les objets
    // compteur est une variable de classe
    private static Long compteur = 0L;

    // Constructeur(s)
    // les constructeurs sont ici surchargés (overload)
    // un constructeur peut faire appel à un autre constructeur
    // (poupée russe)
    // default constructor
    // Constructeur sans paramètre
    public Joueur() {
        // D'abord on incrémente puis on affecte
        id = ++compteur;
    }

    public Joueur(String nom) {
        this();
        this.nom = nom;
    }

    public Joueur(String nom, LocalDate dateDeNaissance) {
        this(nom);
        this.dateDeNaissance = dateDeNaissance;
    }

    public Joueur(String prenom, String nom, String numeroDeTelephone, LocalDate dateDeNaissance) {
        this(nom, dateDeNaissance);
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public int[] getGrille() {
        return grille;
    }

    public void setGrille(int[] grille) {
        this.grille = grille;
    }

    // Méthode qui sert à afficher les joueurs en console


    @Override
    public String toString() {
        return "Joueur {" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", numeroDeTelephone='" + numeroDeTelephone + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", grille=" + Arrays.toString(grille) +
                '}';
    }
}