package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe8 {
    public static void main(String[] args) {
        int iPow,
            iNumber = 2,
            iResult = 1;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iPow = oScanner.nextInt();
        oScanner.close();

        for (int i = 0; i < iPow; i++) {
            iResult *= iNumber; 
        }

        System.out.printf("2^%d = %d", iPow, iResult);
    }
}
