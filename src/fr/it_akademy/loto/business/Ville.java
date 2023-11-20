package fr.it_akademy.loto.business;

/**
 * cette classe represente une ville
 */
public class Ville {
   private Long id ;
   private String codeInsee;
   private String codePostal;
   private Double longitude;
   private Double latitude;
   private String complement;
   private static Long compteur = 0L;

   public Ville(){
       id = ++compteur;
   }
    public Ville(String codePostal){
       this();
       this.codePostal=codePostal;
    }
    public Ville(String codePostal ,String codeInsee){
       this(codePostal);
       this.codeInsee=codeInsee;
    }
    public Ville(String codePostal ,String codeInsee, Double latitude, Double longitude){
       this(codePostal,codeInsee);
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

    @Override
    public String toString() {
        return "Ville {" +
                "id=" + id +
                ", codeInsee='" + codeInsee + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", complement='" + complement + '\'' +
                '}';
    }
}