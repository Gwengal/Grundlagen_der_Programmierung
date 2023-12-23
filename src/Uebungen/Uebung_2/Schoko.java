package Uebungen.Uebung_2;

import java.util.Scanner;

public class Schoko {
    public static void main(String[] args) {
        int iAmount;
        float fCosts = 0.79F, fSum, fDisc = 0F;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie die Anzahl der Tafeln Schokolade: ");
        iAmount = oScanner.nextInt();
        oScanner.close();

        if (iAmount == 0) {
            System.out.printf("Ihre Anzahl beträgt %d Tafeln Schokolade.", iAmount);
            return;
        }

        fSum = fCosts * iAmount;

        // 10 % Rabatt
        if (iAmount >= 5 && iAmount < 10) {
            fDisc = fSum * 10 / 100;
            System.out.printf("%d Prozent Rabatt: %.3f EUR\n", 10, fDisc);
        // 20 % Rabatt
        } else if (iAmount >= 10) {
            fDisc = fSum * 20 / 100;
            System.out.printf("%d Prozent Rabatt: %.3f EUR\n", 20, fDisc);
        }

        System.out.printf("Gesamtbetrag beläuft sich auf %.3f EUR.", (fSum - fDisc));
    }
}
