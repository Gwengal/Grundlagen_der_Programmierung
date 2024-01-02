package Uebungen.Uebung_7;

import java.util.Scanner;

public class Temperatur {
    /**
     * @param args
     */
    public static void main(String[] args) {
        float[] fTemp;
        Scanner oScan = new Scanner(System.in);

        fTemp = new float[(int) Temperatur.getInput("Anzahl der zu erfassenden Temperaturen erfassen: ", oScan)];
        for (int i = 0; i < fTemp.length; i++) {
            fTemp[i] = Temperatur.getInput("Temperatur erfassen: ", oScan);
        }

        System.out.printf("Max Wert der %d Temperaturen: %.2f\n", fTemp.length, Temperatur.getMax(fTemp));
        System.out.printf("Durchschnittswert der %d Temperaturen: %.2f\n", fTemp.length, Temperatur.getAvg(fTemp));
        
        System.out.printf("%d Temperaturen unsortiert: \n", fTemp.length);
        Temperatur.print(fTemp);

        System.out.printf("%d Temperaturen aufsteigend sortiert: \n", fTemp.length);
        Temperatur.sort(true, fTemp);
        Temperatur.print(fTemp);

        System.out.printf("%d Temperaturen absteigend sortiert: \n", fTemp.length);
        Temperatur.sort(false, fTemp);
        Temperatur.print(fTemp);
    }

    /**
     * Ausgabe des Arrays
     * 
     * @param fArray
     */
    private static void print(float[] fArray) {
        for (int i = 0; i < fArray.length; i++) {
            System.out.printf("%.2f %s", fArray[i], ((i + 1) == fArray.length ? "\n" : "; "));
        }
    }

    /**
     * Array mit BubbleSort sortieren
     * 
     * @param bAsc
     * @param fArray
     */
    private static void sort(boolean bAsc, float[] fArray) {
        boolean bSort = true;

        while (bSort) {
            float fTemp;
            bSort = false;

            for (int i = 1; i < fArray.length; i++) {
                // Aufsteigend sortieren
                if (bAsc) {
                    if (fArray[i - 1] > fArray[i]) {
                        fTemp = fArray[i];
                        fArray[i] = fArray[i - 1];
                        fArray[i - 1] = fTemp;
                        bSort = true;
                    }
                    // Absteigend sortieren
                } else {
                    if (fArray[i - 1] < fArray[i]) {
                        fTemp = fArray[i];
                        fArray[i] = fArray[i - 1];
                        fArray[i - 1] = fTemp;
                        bSort = true;
                    }
                }
            }
        }
    }

    /**
     * Durchschnittstemperatur berechnen und zurückgeben
     * 
     * @param fTemp
     * @return
     */
    private static float getAvg(float[] fTemp) {
        float fSum = 0;

        for (int i = 0; i < fTemp.length; i++) {
            fSum += fTemp[i];
        }

        return fSum / fTemp.length;
    }

    /**
     * Max-Wert der Temperaturen ermitteln
     * 
     * @param fArray
     * @return
     */
    private static float getMax(float[] fArray) {
        float fMax = 0;

        for (int i = 0; i < fArray.length; i++) {
            fMax = (fMax < fArray[i] ? fArray[i] : fMax);
        }

        return fMax;
    }

    /**
     * Anzahl der Temperaturen zurückgeben
     * 
     * @param oScan
     * @return
     */
    private static float getInput(String sUmsg, Scanner oScan) {
        System.out.print(sUmsg);
        return oScan.nextFloat();
    }
}
