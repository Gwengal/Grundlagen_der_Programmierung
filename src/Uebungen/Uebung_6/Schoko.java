package Uebungen.Uebung_6;

import java.util.Scanner;

public class Schoko {
    public static void main(String[] args) {
        int iNumb,
            iDisc = 0;
        double dCost = 0.79,
               dDiscount;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Anzahl ein: ");
        iNumb = oScanner.nextInt();
        oScanner.close();

        if (iNumb == 0) {
            System.out.println("Error! Menge muss > 0 sein.");
            return;
        }

        if (iNumb > 5 && iNumb < 10) {
            iDisc = 10;
        }else if(iNumb >= 10){
            iDisc = 20;
        }

        dCost *= iNumb;
        dDiscount = dCost * iDisc / 100;

        System.out.printf("Sie haben %d Schokoladen gekauft. \n", iNumb);
        System.out.printf("Preis ohne Rabatt: %.2f Euro \n", dCost);
        System.out.printf("%d Prozent Rabatt: %.2f Euro \n", iDisc, dDiscount);
        System.out.printf("Preis zu zahlen: %.2f Euro \n", (dCost-dDiscount));
    }
}
