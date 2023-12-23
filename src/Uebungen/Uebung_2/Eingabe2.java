package Uebungen.Uebung_2;

import java.util.Scanner;

public class Eingabe2 {
    public static void main(String[] args) {
        int z;
        Scanner read = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Zahl ein, ");
        System.out.println("die durch drei teilbar ist.");
        System.out.println("Andere Zahlen werden nicht akzeptiert.\n");

        System.out.print("Ihre Zahl: ");
        z = read.nextInt();
        read.close();

        if (z % 3 != 0) {
            System.out.println("Die Zahl ist nicht durch drei teilbar!");
        }
        System.out.println("Ihre Eingabe: " + z);
        // Hier geht das Programm irgendwie weiter, aber das
        // interessiert uns an dieser Stelle nicht.
    }
}
