package Uebungen.Uebung_3.Aufgaben_einfache_Schleife;

import java.util.Scanner;

public class Aufgabe9 {
    public static void main(String[] args) {
        int z1, z2;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen sie Zahl eins: ");
        z1 = oScanner.nextInt();

        System.out.print("Erfassen sie Zahl zwei: ");
        z2 = oScanner.nextInt();
        oScanner.close();

        for (int i = z1; i <= z2; i++) {
            System.out.printf("%d * %d = %d\n", i, i, (i*i));
        }
    }
}
