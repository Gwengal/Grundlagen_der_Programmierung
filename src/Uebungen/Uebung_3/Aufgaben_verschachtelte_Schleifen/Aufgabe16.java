package Uebungen.Uebung_3.Aufgaben_verschachtelte_Schleifen;

import java.util.Scanner;

public class Aufgabe16 {
    public static void main(String[] args) {
        int iMax,
                iSum;
        String sOutput;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie eine Zahl: ");
        iMax = oScanner.nextInt();
        oScanner.close();

        for (int i = 1; i <= iMax; i++) {
            iSum = 0;
            sOutput = "";
            for (int j = 1; j <= i; j++) {
                iSum += j;
                sOutput = String.format("%s%s%d", sOutput, (j == 1 ? "" : "+"), j);
                if (i == j) {
                    System.out.printf("%s = %d\n", sOutput, iSum);
                }
            }
        }
    }
}
