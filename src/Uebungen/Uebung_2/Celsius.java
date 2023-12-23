package Uebungen.Uebung_2;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        float fF, fC;
        Scanner oScan = new Scanner(System.in);

        System.out.print("Erfassen Sie die Temperatur in Fahrenheit: ");
        fF = oScan.nextFloat();
        oScan.close();

        fC = 5F/9 * (fF - 32);
        
        System.out.printf("%.2f °F entsprechen %.2f °C", fF, fC);
    }
}
