package Uebungen.Uebung_4;

import java.util.Scanner;

public class GGT {
    public static void main(String[] args) {
        int a, b;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie Zahl eins: ");
        a = oScanner.nextInt();
        System.out.print("Erfassen Sie Zahl zwei: ");
        b = oScanner.nextInt();
        oScanner.close();

        GGT.printStars(30);
        System.out.printf("GGT: %d\n", GGT.ggt(a, b));
        GGT.printStars(30);
    }

    /**
     * Größten gemeinsamen Teiler zweier Zahlen berechnen
     * 
     * @param x
     * @param y
     * @return
     */
    private static int ggt(int x, int y){
        int iZähler, iNenner, iRest = 1;

        if (x >= y) {
            iZähler = x;
            iNenner = y;
        }else{
            iZähler = y;
            iNenner = x;
        }

        while (true) {
            iRest = iZähler % iNenner;
            
            if (iRest == 0) {
                return iNenner;                
            }

            iZähler = iNenner;
            iNenner = iRest;
        }
    }

    /**
     * Sterne im Terminal ausgeben
     * 
     * @param i
     */
    private static void printStars(int i){
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
