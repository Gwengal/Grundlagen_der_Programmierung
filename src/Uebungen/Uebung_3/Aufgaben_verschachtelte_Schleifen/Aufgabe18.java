package Uebungen.Uebung_3.Aufgaben_verschachtelte_Schleifen;

import java.util.Scanner;

public class Aufgabe18 {
    public static void main(String[] args) {
        int iMax,
            iFaktor = 1;
        double dEul = 1.0;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iMax = oScanner.nextInt();
        oScanner.close();

        for (int i = 1; i <= iMax; i++) {
            iFaktor *= i;
            dEul += 1.0/iFaktor;
        }

        System.out.printf("Eulersche Zahl für Genauigkeit %d = %f", iMax, dEul);
    }
}
