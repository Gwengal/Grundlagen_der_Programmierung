package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        int iNum;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iNum = oScanner.nextInt();
        oScanner.close();

        for (int i = 0; i < iNum; i++) {
            System.out.print("A");
        }
    }
}
