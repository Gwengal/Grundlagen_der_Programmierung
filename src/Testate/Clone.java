package Testate;

public class Clone {
    public static void main(String[] args) {
        Datum d1 = new Datum(21, 12, 2017);
        try {
            Datum d2;
            d2 = (Datum) d1.clone();

            boolean programm = true;

            if (d1 == d2) {
                programm = false;
            }
            if (!(d1.equals(d2))) {
                programm = false;
            }

            System.out.println("my program is " + programm);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}

class Datum implements Cloneable {
    // --| Attribute |--
    private int _iDay,
            _iMonth,
            _iYear;

    /**
     * Konstruktor
     * 
     * @param iDay
     * @param iMonth
     * @param iYear
     */
    public Datum(int iDay, int iMonth, int iYear) {
        this.setDay(iDay);
        this.setMonth(iMonth);
        this.setYear(iYear);
    }

    /**
     * Getter für _iDay
     * 
     * @return
     */
    public int getDay() {
        return this._iDay;
    }

    /**
     * Getter für _iMonth
     * 
     * @return
     */
    public int getMonth() {
        return this._iMonth;
    }

    /**
     * Getter für _iYear
     * 
     * @return
     */
    public int getYear() {
        return this._iYear;
    }

    /**
     * Setter für _iDay
     * 
     * @param i
     */
    public void setDay(int i) {
        this._iDay = i;
    }

    /**
     * Setter für _iMonth
     * 
     * @param i
     */
    public void setMonth(int i) {
        this._iMonth = i;
    }

    /**
     * Setter für _iYear
     * 
     * @param i
     */
    public void setYear(int i) {
        this._iYear = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException(String
                    .format("%s \n--> Zum Objekt %s konnte keine tiefe Kopie erstellt werden!", e.getMessage(), this));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Datum oCheck = (Datum) obj;

        return this.getDay() == oCheck.getDay() && this.getMonth() == oCheck.getMonth()
                && this.getYear() == oCheck.getYear();
    }

    @Override
    public String toString() {
        return String.format("%s - %2d.%2d.%4d", super.toString(), this.getDay(), this.getMonth(), this.getYear());
    }
}
