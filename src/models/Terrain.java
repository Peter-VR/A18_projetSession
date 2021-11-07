package models;

import java.util.ArrayList;
import java.util.Objects;

public class Terrain {

    //Attributes
    private int typeTerrain;
    private double prixM2Min;
    private double prixM2Max;
    private ArrayList<Lot> lots;

    //Constructors
    public Terrain() {
    }

    public Terrain(int typeTerrain, double prixM2Min, double prixM2Max, ArrayList<Lot> lots) {
        this.typeTerrain = typeTerrain;
        this.prixM2Min = prixM2Min;
        this.prixM2Max = prixM2Max;
        this.lots = lots;
    }

    //Getter and Setter
    public int getTypeTerrain() {
        return typeTerrain;
    }

    public void setTypeTerrain(int typeTerrain) {
        this.typeTerrain = typeTerrain;
    }

    public double getPrixM2Min() {
        return prixM2Min;
    }

    public void setPrixM2Min(double prixM2Min) {
        this.prixM2Min = prixM2Min;
    }

    public double getPrixM2Max() {
        return prixM2Max;
    }

    public void setPrixM2Max(double prixM2Max) {
        this.prixM2Max = prixM2Max;
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
        return typeTerrain == terrain.typeTerrain && Double.compare(terrain.prixM2Min, prixM2Min) == 0 && Double.compare(terrain.prixM2Max, prixM2Max) == 0 && Objects.equals(lots, terrain.lots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeTerrain, prixM2Min, prixM2Max, lots);
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "type_terrain=" + typeTerrain +
                ", prix_m2_min=" + prixM2Min +
                ", prix_m2_max=" + prixM2Max +
                ", lots=" + lots +
                '}';
    }
}
