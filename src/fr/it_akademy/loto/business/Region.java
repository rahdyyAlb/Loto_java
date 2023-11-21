package fr.it_akademy.loto.business;

import fr.it_akademy.loto.business.*;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private Long id;
    private String name;

    private static Long compteur = 0L;
    private List<Departement> departements = new ArrayList<>();
    public Region(){
        id = ++compteur;
    }

    public Region(String name){
        this();
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Region.compteur = compteur;
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements = departements;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departements=" + departements +
                '}';
    }
}
