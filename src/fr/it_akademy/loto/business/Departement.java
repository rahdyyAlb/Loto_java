package fr.it_akademy.loto.business;

import java.util.ArrayList;
import java.util.List;
import fr.it_akademy.loto.business.*;

public class Departement {
    private Long id;
    private String name;
    private int code;
    private static Long compteur = 0L;
    private List<Ville> villes = new ArrayList<>();
    public Departement() {
        id = ++compteur;
    }

    public Departement(String name) {
        this();
        this.name = name;
    }

    public Departement(String name, int code) {
        this(name);
        this.code = code;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Departement.compteur = compteur;
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                ", villes=" + villes +
                '}';
    }
}
