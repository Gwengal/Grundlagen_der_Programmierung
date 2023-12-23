package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe7 {
    public static void main(String[] args) {
        int iMax, iSum = 0;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iMax = oScanner.nextInt();
        oScanner.close();

        for (int i = 0; i < iMax; i++) {
            iSum += (i+1);
        }

        System.out.printf("Summe der Zahlenfolge von 1 bis %d = %d", iMax, iSum);
    }
}
