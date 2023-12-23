package Uebungen.Uebung_2;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        int iInput;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie bitte eine Zahl: ");
        iInput = oScanner.nextInt();
        oScanner.close();

        System.out.printf("Zahl %d ist %s.", iInput, (iInput % 5 == 0 ? "durch 5 teilbar" : "nicht durch 5 teilbar"));
    }
}
