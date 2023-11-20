package fr.it_akademy.loto.business;

public class Departement {
    private Long id;
    private String name;
    private static Long compteur = 0L;

    public Departement(){
        id = ++compteur;
    }

    public Departement(String name){
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
        Departement.compteur = compteur;
    }

    @Override
    public String toString() {
        return "Departement {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
