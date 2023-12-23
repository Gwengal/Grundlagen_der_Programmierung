package Uebungen.Uebung_3.Aufgaben_verschachtelte_Schleifen;

import java.util.Scanner;

public class Aufgabe13 {
    public static void main(String[] args) {
        int iMax;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iMax = oScanner.nextInt();
        oScanner.close();

        for (int i = 1; i <= iMax; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
