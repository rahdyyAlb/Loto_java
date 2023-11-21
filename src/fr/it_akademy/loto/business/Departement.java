package fr.it_akademy.loto.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.it_akademy.loto.business.*;

public class Departement {
    private Long id;
    private String name;
    private String code;
    private static Long compteur = 0L;
    private Region region;

    public Departement() {
        id = ++compteur;
    }

    public Departement(String name) {
        this();
        this.name = name;
    }

    public Departement(String name, String code) {
        this(name);
        this.code = code;
    }

    public Departement(String name, String code, Region region) {
        this(name, code);
        this.region = region;
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
        Departement.compteur = compteur;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return Objects.equals(name, that.name) && Objects.equals(code, that.code) && Objects.equals(region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, region);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", region=" + region +
                '}';
    }
}
