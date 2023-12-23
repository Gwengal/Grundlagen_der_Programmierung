package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe4 {
    public static void main(String[] args) {
        int iMax;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie einen Wert: ");
        iMax = oScanner.nextInt();
        oScanner.close();

        for (int i = iMax; i > 0; i--) {
            System.out.print(i + " ");            
        }
    }
}
