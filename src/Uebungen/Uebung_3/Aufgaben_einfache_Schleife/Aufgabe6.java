package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        int iMax;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iMax = oScanner.nextInt();
        oScanner.close();

        System.out.printf("Zahlen aufsteigend von 1 bis %d: \n", iMax);
        for (int i = 0; i < iMax; i++) {
            System.out.print((i+1) + " ");
        }

        System.out.printf("\n\nZahlen absteigend von %d bis 1: \n", iMax);
        for (int i = iMax; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
