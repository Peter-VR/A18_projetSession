package models;

import java.util.Objects;

public class Lot {

    //Attributes
    private String desription;
    private int nb_droits_passage;
    private int nb_service;
    private int superficie;
    private String date_mesure;

    //Constructors
    public Lot() {
    }

    public Lot(String desription, int nb_droits_passage, int nb_service, int superficie, String date_mesure) {
        this.desription = desription;
        this.nb_droits_passage = nb_droits_passage;
        this.nb_service = nb_service;
        this.superficie = superficie;
        this.date_mesure = date_mesure;
    }

    //Getter and Setter
    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public int getNb_droits_passage() {
        return nb_droits_passage;
    }

    public void setNb_droits_passage(int nb_droits_passage) {
        this.nb_droits_passage = nb_droits_passage;
    }

    public int getNb_service() {
        return nb_service;
    }

    public void setNb_service(int nb_service) {
        this.nb_service = nb_service;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getDate_mesure() {
        return date_mesure;
    }

    public void setDate_mesure(String date_mesure) {
        this.date_mesure = date_mesure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lot lot = (Lot) o;
        return nb_droits_passage == lot.nb_droits_passage && nb_service == lot.nb_service && superficie == lot.superficie && Objects.equals(desription, lot.desription) && Objects.equals(date_mesure, lot.date_mesure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desription, nb_droits_passage, nb_service, superficie, date_mesure);
    }

    @Override
    public String toString() {
        return "Lot{" +
                "desription='" + desription + '\'' +
                ", nb_droits_passage=" + nb_droits_passage +
                ", nb_service=" + nb_service +
                ", superficie=" + superficie +
                ", date_mesure='" + date_mesure + '\'' +
                '}';
    }
}
