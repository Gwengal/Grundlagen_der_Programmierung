package Uebungen.Uebung_10;

public class Datum {
    private int _iDay;
    private int _iMonth;
    private int _iYear;

    public Datum(int iDay, int iMonth, int iYear) {
        this.setDay(iDay);
        this.setMonth(iMonth);
        this.setYear(iYear);
    }

    public int getDay() {
        return this._iDay;
    }

    public int getMonth() {
        return this._iMonth;
    }

    public int getYear() {
        return this._iYear;
    }

    public void setDay(int i) {
        this._iDay = i;
    }

    public void setMonth(int i) {
        this._iMonth = i;
    }

    public void setYear(int i) {
        this._iYear = i;
    }
}
