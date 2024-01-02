package Uebungen.Uebung_8;

import java.util.Random;

public class RechteckListe {
    public static void main(String[] args){
        int iSum = 0,
            iCountQuad = 0;
        Random oRandom = new Random();
        Rechteck[] aObjects = new Rechteck[1000];
        for (int i = 0; i < aObjects.length; i++) {
            aObjects[i] = new Rechteck(oRandom.nextInt(1, 11), oRandom.nextInt(1, 11));
            iSum += aObjects[i].getFlaeche();

            iCountQuad = (aObjects[i].istQuadrat() ? (iCountQuad+1) : iCountQuad);
        }

        System.out.printf("Durchschnittsflächeninhalt: %d\n", (iSum/aObjects.length));
        System.out.printf("Von %d Rechtecken sind %d Quadrate\n", aObjects.length, iCountQuad);
    }
}
