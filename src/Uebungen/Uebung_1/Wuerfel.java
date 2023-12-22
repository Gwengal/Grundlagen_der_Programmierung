package Uebungen.Uebung_1;

import java.util.Scanner;

public class Wuerfel {
    public static void main(String[] args) {
        // --| Deklaration |--
        float fA, fO, fV;
        Scanner oScan = new Scanner(System.in);

        System.out.print("Erfassen Sie die Kantenlänge des Würfels: ");
        fA = oScan.nextFloat();
        oScan.close();

        // O=6a^2
        fO = 6f * Wuerfel.pow(fA, 2);

        // V=a^3       
        fV = Wuerfel.pow(fA, 3);

        System.out.printf("-> Erfasste Kantenlänge %.3f \n-> Oberfläche %.3f \n-> Volumen %.3f\n", fA, fO, fV);
    }

    /**
     * Potenz einer Zahl berechnen
     * 
     * @param fBase
     * @param iExponent
     * @return
     */
    private static float pow(float fBase, int iExponent){
        float fResult = 1;
        
        for (int i = 0; i < iExponent; i++) {
            fResult = fResult * fBase;
        }
        
        return fResult;
    }
}
