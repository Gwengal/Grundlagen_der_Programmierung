package Uebungen.Uebung_2;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        int iLeapYear;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie ein Jahr: ");
        iLeapYear = oScanner.nextInt();
        oScanner.close();

        if ((iLeapYear % 4 == 0 && iLeapYear % 100 != 0 ) || iLeapYear % 400 == 0) {
            System.out.printf("Schaltjahr %d ist ein Schaltjahr", iLeapYear);
            return;
        }

        System.out.printf("Schaltjahr %d ist kein Schaltjahr", iLeapYear);
    }
}
