package models;

import java.util.Objects;

public class Lot {

    //Attributes
    private String desription;
    private int nbDroitsPassage;
    private int nbService;
    private int superficie;
    private String dateMesure;

    //Constructors
    public Lot() {
    }

    public Lot(String desription, int nbDroitsPassage, int nbService, int superficie, String dateMesure) {
        this.desription = desription;
        this.nbDroitsPassage = nbDroitsPassage;
        this.nbService = nbService;
        this.superficie = superficie;
        this.dateMesure = dateMesure;
    }

    //Getter and Setter
    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public int getNbDroitsPassage() {
        return nbDroitsPassage;
    }

    public void setNbDroitsPassage(int nbDroitsPassage) {
        this.nbDroitsPassage = nbDroitsPassage;
    }

    public int getNbService() {
        return nbService;
    }

    public void setNbService(int nbService) {
        this.nbService = nbService;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getDateMesure() {
        return dateMesure;
    }

    public void setDateMesure(String dateMesure) {
        this.dateMesure = dateMesure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lot lot = (Lot) o;
        return nbDroitsPassage == lot.nbDroitsPassage && nbService == lot.nbService && superficie == lot.superficie && Objects.equals(desription, lot.desription) && Objects.equals(dateMesure, lot.dateMesure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desription, nbDroitsPassage, nbService, superficie, dateMesure);
    }

    @Override
    public String toString() {
        return "Lot{" +
                "desription='" + desription + '\'' +
                ", nb_droits_passage=" + nbDroitsPassage +
                ", nb_service=" + nbService +
                ", superficie=" + superficie +
                ", date_mesure='" + dateMesure + '\'' +
                '}';
    }
}
