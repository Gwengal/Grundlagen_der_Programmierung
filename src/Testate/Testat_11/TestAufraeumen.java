package Testate.Testat_11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestAufraeumen {
    public static void main(String[] args) {
        Termin[] meinKalendar = new Termin[10];
        meinKalendar[2] = new Termin(new Datum(12, 5), "Zahnarzt");
        meinKalendar[3] = new Termin(new Datum(1, 31), "Geburtstag");
        meinKalendar[8] = new Termin(new Datum(10, 1), "Hochschule");
        meinKalendar[7] = new Termin(new Datum(12, 24), "Urlaub");
        meinKalendar[9] = new Termin(new Datum(1, 8), "Lernen");

        System.out.println("Vor dem Aufräumen: \n");
        Array.print(meinKalendar);

        System.out.println("Nach dem Aufräumen: \n");
        Array.aufraumen(meinKalendar);
        Array.print(meinKalendar);

        System.out.println("Nach dem Sortieren: \n");
        Array.sort(meinKalendar);
        Array.print(meinKalendar);
    }
}

interface Komprimierbar {
    public boolean loeschen();

    public boolean isBigger(Komprimierbar oKomp);
}

class Array {
    /**
     * Übergebenes Array aufräumen
     * 
     * @param aKomp
     */
    public static void aufraumen(Komprimierbar[] aKomp) {
        // --| Deklaration |--
        int i = 0;

        /*
         * 1. Objekte die laut der Methode loeschen()
         * nicht mehr benötigt werden, werden hier auf
         * NULL gesetzt.
         * 2. Objekte die noch benötigt werden, werden an
         * die erste freie Stelle im Array sortiert
         */
        for (int j = 0; j < aKomp.length; j++) {
            if (aKomp[j] == null) {
                continue;
            }

            if (aKomp[j].loeschen()) {
                aKomp[j] = null;
            } else {
                aKomp[i++] = aKomp[j];
                aKomp[j] = null;
            }
        }
    }

    /**
     * Übergebenes Array sortieren
     * 
     * @param aKomp
     */
    public static void sort(Komprimierbar[] aKomp) {
        // --| Deklaration |--
        boolean bSort = true;
        Komprimierbar oBuffer;

        // --| Bubble-Sort durchführen |--
        while (bSort) {
            bSort = false;

            for (int i = 1; i < aKomp.length; i++) {

                if (aKomp[i - 1] != null && aKomp[i] != null && aKomp[i - 1].isBigger(aKomp[i])) {
                    oBuffer = aKomp[i - 1];
                    aKomp[i - 1] = aKomp[i];
                    aKomp[i] = oBuffer;

                    bSort = true;
                }
            }
        }
    }

    /**
     * Übergebenes Array ausgeben
     * 
     * @param aKomp
     */
    public static void print(Komprimierbar[] aKomp) {
        Array.print("frei", aKomp);
    }

    /**
     * Übergebenes Array ausgeben
     * 
     * @param sNull
     * @param aKomp
     */
    public static void print(String sNull, Komprimierbar[] aKomp) {
        for (Komprimierbar oKomp : aKomp) {
            if (oKomp == null) {
                System.out.println(sNull);
                continue;
            }

            System.out.println(oKomp);
        }

        for (int i = 0; i < 30; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }
}

class Datum {
    // Attribute
    public static GregorianCalendar oGc = new GregorianCalendar();
    private int _iYear,
            _iMonth,
            _iDay;

    /**
     * Konstruktor
     * 
     * @param iYear
     * @param iMonth
     * @param iDay
     */
    public Datum(int iYear, int iMonth, int iDay) {
        this.setYear(iYear);
        this.setMonth(iMonth);
        this.setDay(iDay);
    }

    /**
     * Konstruktor
     * 
     * @param iMonth
     * @param iDay
     */
    public Datum(int iMonth, int iDay) {
        this(Datum.oGc.get(Calendar.YEAR), iMonth, iDay);
    }

    // Getter
    /**
     * Getter für this._iYear
     * 
     * @return
     */
    public int getYear() {
        return this._iYear;
    }

    /**
     * Getter für this._iMonth
     * 
     * @return
     */
    public int getMonth() {
        return this._iMonth;
    }

    /**
     * Getter für this._iDay
     * 
     * @return
     */
    public int getDay() {
        return this._iDay;
    }

    // Setter
    /**
     * Setter für this._iYear
     * 
     * @param i
     */
    public void setYear(int i) {
        this._iYear = i;
    }

    /**
     * Setter für this._iMonth
     * 
     * @param i
     */
    public void setMonth(int i) {
        this._iMonth = i;
    }

    /**
     * Setter für this._iDay
     * 
     * @param i
     */
    public void setDay(int i) {
        this._iDay = i;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d", this.getDay(), this.getMonth(), this.getYear());
    }

    /**
     * Vergleicht ob das aktuelle Datum kleiner als das übergebene Datum ist
     * 
     * @param oCompare
     * @return
     */
    public boolean compare(Datum oCompare) {
        if (this.getYear() < oCompare.getYear()
                || (this.getYear() == oCompare.getYear() && this.getMonth() < oCompare.getMonth())
                || (this.getYear() == oCompare.getYear() && this.getMonth() == oCompare.getMonth()
                        && this.getDay() < oCompare.getDay())) {
            return true;
        }

        return false;
    }
}

class Termin implements Komprimierbar {
    // Attribute
    private String _sBez;
    private Datum _oDatum;

    /**
     * Konsturktor
     * 
     * @param oDatum
     * @param sBez
     */
    public Termin(Datum oDatum, String sBez) {
        this.setDatum(oDatum);
        this.setBez(sBez);
    }

    /**
     * Getter für this._sBez
     * 
     * @return
     */
    public String getBez() {
        return this._sBez;
    }

    /**
     * Getter für this._oDatum
     * 
     * @return
     */
    public Datum getDatum() {
        return this._oDatum;
    }

    /**
     * Setter für this._sBez
     * 
     * @param sBez
     */
    public void setBez(String sBez) {
        this._sBez = sBez;
    }

    /**
     * Setter für this._oDatum
     * 
     * @param oDatum
     */
    public void setDatum(Datum oDatum) {
        this._oDatum = oDatum;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s", this.getDatum(), this.getBez());
    }

    @Override
    public boolean loeschen() {
        Datum oDatum = new Datum(Datum.oGc.get(Calendar.YEAR), (Datum.oGc.get(Calendar.MONTH) + 1),
                Datum.oGc.get(Calendar.DAY_OF_MONTH));

        return this.getDatum().compare(oDatum);
    }

    @Override
    public boolean isBigger(Komprimierbar oKomp) {
        Termin oTermin = (Termin) oKomp;

        return !this.getDatum().compare(oTermin.getDatum());
    }

}