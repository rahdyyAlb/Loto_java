package fr.it_akademy.loto.business;

import fr.it_akademy.loto.business.*;

import java.util.ArrayList;
import java.util.List;

/**
 * cette classe represente une ville
 */
public class Ville {
    private Long id;
    private String codeInsee;
    private String codePostal;
    private String name;
    private Double longitude;
    private Double latitude;
    private String complement;
    private static Long compteur = 0L;
    private List<Joueur> joueurs = new ArrayList<>();
    private Departement departement;

    public Ville() {
        id = ++compteur;
    }

    public Ville(String codePostal) {
        this();
        this.codePostal = codePostal;
    }

    public Ville(String codePostal, String codeInsee) {
        this(codePostal);
        this.codeInsee = codeInsee;
    }

    public Ville(String codePostal, String codeInsee, String name, Double latitude, Double longitude) {
        this(codePostal, codeInsee);
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCodeInsee() {
        return codeInsee;
    }

    public void setCodeInsee(String codeInsee) {
        this.codeInsee = codeInsee;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Ville.compteur = compteur;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "id=" + id +
                ", codeInsee='" + codeInsee + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", complement='" + complement + '\'' +
                ", joueurs=" + joueurs +
                ", departement=" + departement +
                '}';
    }
}
