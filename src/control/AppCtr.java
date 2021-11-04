package control;

import models.Lot;
import models.Terrain;

import java.util.ArrayList;

public class AppCtr {

    public static void main(String[] args) {

        System.out.println("A18 - Projet de session - Partie 1 \n" +
                "----------------------------------------------");

        //Create lots
        Lot lot1 = new Lot("lot 1", 4, 0, 465, "2015-10-14");
        Lot lot2 = new Lot("lot 2", 0, 1, 1082, "2015-12-15");
        Lot lot3 = new Lot("lot 3", 8, 3, 3333, "2013-06-20");
        //Create arraylist for the lots
        ArrayList<Lot> lots = new ArrayList<>();
        lots.add(lot1);
        lots.add(lot2);
        lots.add(lot3);

        //Create terrain
        Terrain terrain1 = new Terrain(2, 3.25, 7.00, lots);

        //Testing output string
        System.out.println(terrain1);
    }

}
