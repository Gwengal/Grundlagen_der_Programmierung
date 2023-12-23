package Uebungen.Uebung_2;

import java.util.Scanner;

public class GroessereZahl {
    public static void main(String[] args) {
        int iInput1, iInput2;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie Zahl eins: ");
        iInput1 = oScanner.nextInt();

        System.out.print("Erfassen Sie Zahl zwei: ");
        iInput2 = oScanner.nextInt();
        oScanner.close();

        System.out.printf("Die größere Zahl ist %d", (iInput1 >= iInput2 ? iInput1 : iInput2));        
    }
}
