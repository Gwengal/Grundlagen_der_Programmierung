package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args) {
        int iMax;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iMax = oScanner.nextInt(); 
        oScanner.close();

        for (int i = 0; i < iMax; i++) {
            if ((i+1) % 2 == 0) {
                System.out.print((i+1) + " ");
            }
        }
    }
}
