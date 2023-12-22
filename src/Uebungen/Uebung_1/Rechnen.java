package Uebungen.Uebung_1;

import java.util.Scanner;

public class Rechnen {
    public static void main(String[] args) {
        // --| Deklaration |--
        int iX, iY, iResult = 0;
        String sOperation = "";
        Scanner oScan = new Scanner(System.in);

        System.out.print("Erfassen Sie die erste Zahl: ");
        iX = oScan.nextInt();

        System.out.print("Erfassen Sie die zweite Zahl: ");
        iY = oScan.nextInt();

        oScan.close();

        /*
         * Besonderheiten:
         * - 7 und 3 -> Division liefert nicht den Restwert. Nur die "Vorkommazahl"
         * - 2 und 0 -> Division durch 0 nicht möglich!
         */
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    sOperation = "Summe";
                    iResult = iX + iY;
                    break;
                case 1:
                    sOperation = "Differenz";
                    iResult = iX - iY;
                    break;
                case 2:
                    sOperation = "Produkt";
                    iResult = iX * iY;
                    break;
                case 3:
                    sOperation = "Division";
                    try {
                        iResult = iX / iY;
                    } catch (ArithmeticException eError) {
                        System.out.printf("Division durch %d nicht erlaubt!\n", iY);
                        continue;
                    }

                    break;
            }

            System.out.printf("Ergebnis (%s) aus %d und %d = %d \n", sOperation, iX, iY, iResult);
        }
    }
}
