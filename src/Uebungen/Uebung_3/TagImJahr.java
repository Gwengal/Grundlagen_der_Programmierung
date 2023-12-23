package Uebungen.Uebung_3;

import java.util.Scanner;

public class TagImJahr {
    public static void main(String[] args) {
        int iDay, iMonth, iYear, iDays = 0;
        int[] aDaysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] aInput = TagImJahr.getInput();

        iDay = Integer.parseInt(aInput[0]);
        iMonth = Integer.parseInt(aInput[1]);
        iYear = Integer.parseInt(aInput[2]);
        // Schaltjahr
        if ((iYear % 4 == 0 && iYear % 100 != 0) || iYear % 400 == 0) {
            aDaysInMonth[1] = 29;
        } 

        for (int i = 0; i < aInput.length; i++) {
            if (iMonth == (i + 1)) {
                iDays += iDay;
                break;
            }

            iDays += aDaysInMonth[i];
        }

        System.out.printf("Erfasstes Datum %02d.%02d.%04d ist der %d Tag im Jahr", iDay, iMonth, iYear, iDays);
    }

    /**
     * Datum aus dem Terminal auslesen
     * 
     * @return
     */
    private static String[] getInput() {
        String sInput;
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie ein Datum im Format [dd.mm.yyyy]: ");
        sInput = oScanner.nextLine();
        oScanner.close();

        return sInput.split("\\.");
    }
}
