package Uebungen.Uebung_2;

import java.util.Scanner;

public class Rechnen {
    public static void main(String[] args) {
        int iInput1, iInput2, iOperation;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie Zahl eins: ");
        iInput1 = oScanner.nextInt();

        System.out.print("Erfassen Sie Zahl zwei: ");
        iInput2 = oScanner.nextInt();

        System.out.print("Addition = 0, andernfalls Multiplikation: ");
        iOperation = oScanner.nextInt();
        oScanner.close();

        if (iOperation == 0) {
            System.out.printf("Ergebnis aus Addition von %d und %d = %d", iInput1, iInput2, (iInput1 + iInput2));
        }
        else{
            System.out.printf("Ergebnis aus Multiplikation von %d und %d = %d", iInput1, iInput2, (iInput1 * iInput2));
        }
    }
}
