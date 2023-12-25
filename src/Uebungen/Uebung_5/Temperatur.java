package Uebungen.Uebung_5;

import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {
        int iHoechst = 0,
            iSum = 0;
        int[] aTemp = new int[7];
        Scanner oScanner = new Scanner(System.in);

        for (int i = 0; i < aTemp.length; i++) {
            System.out.printf("Tageshöchsttemperatur für Tag %d: ", i+1);
            aTemp[i] = Integer.parseInt(oScanner.nextLine());
        }
        oScanner.close();

        for (int i = 0; i < aTemp.length; i++) {
            iHoechst = (iHoechst < aTemp[i] ? aTemp[i] : iHoechst);
            iSum += aTemp[i];
        }

        System.out.printf("Wochenhöchsttemperatur: %d \nDurchschnittstemperatur: %f", iHoechst, (iSum/aTemp.length));
    }
}
