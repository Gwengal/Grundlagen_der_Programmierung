package Uebungen.Uebung_3.Aufgaben_verschachtelte_Schleifen;

import java.util.Scanner;

public class Aufgabe17 {
    public static void main(String[] args) {
        int x, n, b;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie die Zahl eins: ");
        x = oScanner.nextInt();

        System.out.print("Erfassen Sie die Zahl zwei: ");
        n = oScanner.nextInt();
        oScanner.close();

        for (int i = 1; i <= x; i++) {
            b = 1;
            for (int j = 0; j < n; j++) {
                b *= i;
            }          
            System.out.printf("%d^%d = %d\n", i, n, b);  
        }
    }
}
