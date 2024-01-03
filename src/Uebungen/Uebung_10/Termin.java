package Uebungen.Uebung_10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Termin implements Komprimierbar {
    private Datum _oDatum;
    private GregorianCalendar _oCal;
    private String _sBezeichnung;

    public Termin(String sBezeichnung, Datum oDatum) {
        this.setDatum(oDatum);
        this.setBezeichnung(sBezeichnung);

        this._oCal = new GregorianCalendar();
    }

    public Datum getDatum() {
        return this._oDatum;
    }

    public String getBezeichnung() {
        return this._sBezeichnung;
    }

    public void setDatum(Datum oDatum) {
        this._oDatum = oDatum;
    }

    public void setBezeichnung(String sBezeichnung) {
        this._sBezeichnung = sBezeichnung;
    }

    @Override
    public boolean loeschen() {
        int iYear = this._oCal.get(Calendar.YEAR);
        int iMonth = this._oCal.get(Calendar.MONTH) + 1;
        int iDay = this._oCal.get(Calendar.DAY_OF_MONTH);

        if (this.getDatum().getYear() < iYear
                || (this.getDatum().getYear() == iYear
                        && this.getDatum().getMonth() < iMonth)
                || (this.getDatum().getYear() == iYear
                        && this.getDatum().getMonth() == iMonth
                        && this.getDatum().getDay() < iDay)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%04d: %s", this.getDatum().getDay(), this.getDatum().getMonth(),
                this.getDatum().getYear(), this.getBezeichnung());
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean compare(Datum oDatum) {
        if (oDatum.getYear() < this.getDatum().getYear()
                || (oDatum.getYear() == this.getDatum().getYear()
                        && oDatum.getMonth() < this.getDatum().getMonth())
                || (oDatum.getYear() == this.getDatum().getYear()
                        && oDatum.getMonth() == this.getDatum().getMonth()
                        && oDatum.getDay() < this.getDatum().getDay())) {
            return true;
        }
        return false;
    }

    @Override
    public Datum get() {
        return this.getDatum();
    }
}
