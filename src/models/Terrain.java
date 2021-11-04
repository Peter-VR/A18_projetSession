package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Terrain {

    //Attributes
    private int type_terrain;
    private double prix_m2_min;
    private double prix_m2_max;
    private ArrayList<Lot> lots;

    //Constructors
    public Terrain() {
    }

    public Terrain(int type_terrain, double prix_m2_min, double prix_m2_max, ArrayList<Lot> lots) {
        this.type_terrain = type_terrain;
        this.prix_m2_min = prix_m2_min;
        this.prix_m2_max = prix_m2_max;
        this.lots = lots;
    }

    //Getter and Setter
    public int getType_terrain() {
        return type_terrain;
    }

    public void setType_terrain(int type_terrain) {
        this.type_terrain = type_terrain;
    }

    public double getPrix_m2_min() {
        return prix_m2_min;
    }

    public void setPrix_m2_min(double prix_m2_min) {
        this.prix_m2_min = prix_m2_min;
    }

    public double getPrix_m2_max() {
        return prix_m2_max;
    }

    public void setPrix_m2_max(double prix_m2_max) {
        this.prix_m2_max = prix_m2_max;
    }

    public ArrayList<Lot> getLots() {
        return lots;
    }

    public void setLots(ArrayList<Lot> lots) {
        this.lots = lots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrain terrain = (Terrain) o;
        return type_terrain == terrain.type_terrain && Double.compare(terrain.prix_m2_min, prix_m2_min) == 0 && Double.compare(terrain.prix_m2_max, prix_m2_max) == 0 && Objects.equals(lots, terrain.lots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type_terrain, prix_m2_min, prix_m2_max, lots);
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "type_terrain=" + type_terrain +
                ", prix_m2_min=" + prix_m2_min +
                ", prix_m2_max=" + prix_m2_max +
                ", lots=" + lots +
                '}';
    }
}
