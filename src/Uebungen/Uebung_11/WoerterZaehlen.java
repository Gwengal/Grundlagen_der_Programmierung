package Uebungen.Uebung_11;

import java.util.Scanner;

public class WoerterZaehlen {
    public static void main(String[] args) {
        String sInput;
        Scanner oScan = new Scanner(System.in);
        System.out.print("Erfassen Sie einen Text: ");
        sInput = oScan.nextLine();
        oScan.close();

        System.out.printf("Text [%s] enthält %d Wörter.\n", sInput, sInput.split(" ").length);        
    }
}
