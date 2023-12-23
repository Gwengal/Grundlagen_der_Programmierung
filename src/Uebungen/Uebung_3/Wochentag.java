package Uebungen.Uebung_3;

import java.util.Scanner;

public class Wochentag {
    public static void main(String[] args) {
        String[] aDate = Wochentag.getInput();

        int iDay = Integer.parseInt(aDate[0]),
                iMonth = Integer.parseInt(aDate[1]),
                iYear = Integer.parseInt(aDate[2]);

        System.out.printf("Datum %02d.%02d.%04d ist der %s.", iDay, iMonth, iYear,
                Wochentag.getWeekDay(iDay, iMonth, iYear));
    }

    /**
     * Ermittlung des Wochentages zu einem erfasstem Datum
     * 
     * @param iDay
     * @param iMonth
     * @param iYear
     * @return
     */
    private static String getWeekDay(int iDay, int iMonth, int iYear) {
        // --| Deklaration |--
        int iWeekDay;
        String sWeekDay = "";
        String[] aWeekDays = { "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag" };

        /*
         * Monatsformat bei Zeller'sche Kongruenzformel zur Berechnung des Wochentages:
         * - März = 3, April = 4, Mai = 5, ..., Dezember = 12, Januar = 13, Februar = 14
         * -> Damit Januar und Februar den Wert 13 und 14 erhalten wird der Wert 12 zu dem jeweiligen Monat 
         * *  dazuaddiert
         * -> Januar und Februar gehören dabei immer zum Vorjahr (deshalb iYear--)
         * 
         * -> Damit März, April, ..., Dezember jeweils den richtigen Wert erhalten wird
         * der Wert 2 vom Monat abgezogen
         */
        if (iMonth < 3) {
            iMonth += 12;
            iYear--;
        }

        // Berechnung des Indexes des Wochentages
        iWeekDay = (iDay + 2 * iMonth + (3 * iMonth + 3) / 5 + iYear + iYear/4 - iYear/100 + iYear/400 + 1) % 7;
        sWeekDay = aWeekDays[iWeekDay];

        return sWeekDay;
    }

    /**
     * Datum aus Terminal lesen
     * 
     * @return
     */
    private static String[] getInput() {
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie ein Datum im folgenden Format [dd.mm.yy]: ");
        String[] aDate = oScanner.nextLine().split("\\.");
        oScanner.close();

        return aDate;
    }

}
