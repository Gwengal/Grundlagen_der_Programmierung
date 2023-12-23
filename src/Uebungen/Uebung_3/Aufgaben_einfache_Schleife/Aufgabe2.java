package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        int iMax;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie den MaxWert zu einer Auflistung: ");
        iMax = oScanner.nextInt();
        oScanner.close();
        for (int i = 0; i < iMax; i++) {
            System.out.print((i+1) + " ");
        }
    }
}
