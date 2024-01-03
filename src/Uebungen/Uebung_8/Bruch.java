package Uebungen.Uebung_8;

public class Bruch {
    // --| Attribute |--
    private int _iZaehler;
    private int _iNenner;

    // --| Methoden |--
    /**
     * Konstruktor
     * 
     * @param iZaehler
     * @param iNenner
     */
    private Bruch(int iZaehler, int iNenner) {
        this.setZaehler(iZaehler);
        this.setNenner(iNenner);
    }

    public String toString() {
        return String.format("%d/%d", this.getZaehler(), this.getNenner());
    }

    /**
     * Getter für _iZaehler
     * 
     * @return
     */
    public int getZaehler() {
        return this._iZaehler;
    }

    /**
     * Getter für _iNenner
     * 
     * @return
     */
    public int getNenner() {
        return this._iNenner;
    }

    /**
     * Setter für _iZaehler
     * 
     * @param i
     */
    public void setZaehler(int i) {
        this._iZaehler = i;
    }

    /**
     * Setter für _iNenner
     * 
     * @param i
     */
    public void setNenner(int i) {
        this._iNenner = i;
    }

    // --| Funktionen |--
    /**
     * Addition zweier Brüche
     * 
     * @param oB1
     * @param oB2
     * @return
     */
    public static Bruch add(Bruch oB1, Bruch oB2) {
        int iZaehler = 0,
                iNenner = 0;

        iZaehler = (oB1.getZaehler() * oB2.getNenner()) + (oB2.getZaehler() * oB1.getNenner());
        iNenner = oB1.getNenner() * oB2.getNenner();

        return Bruch.init(iZaehler, iNenner);
    }

    /**
     * Subtraktion zweier Brüche
     * 
     * @param oB1
     * @param oB2
     * @return
     */
    public static Bruch sub(Bruch oB1, Bruch oB2) {
        int iZaehler = 0,
                iNenner = 0;

        iZaehler = (oB1.getZaehler() * oB2.getNenner()) - (oB2.getZaehler() * oB1.getNenner());
        iNenner = oB1.getNenner() * oB2.getNenner();

        return Bruch.init(iZaehler, iNenner);
    }

    /**
     * Multiplikation von Brüchen
     * 
     * @param oB1
     * @param oB2
     * @return
     */
    public static Bruch mult(Bruch oB1, Bruch oB2) {
        int iZaehler = 0,
                iNenner = 0;

        iZaehler = oB1.getZaehler() * oB2.getZaehler();
        iNenner = oB2.getNenner() * oB2.getNenner();

        return Bruch.init(iZaehler, iNenner);
    }

    /**
     * Division zweier Brüche
     * 
     * @param oB1
     * @param oB2
     * @return
     */
    public static Bruch div(Bruch oB1, Bruch oB2) {
        int iZaehler = 0,
                iNenner = 0;

        iZaehler = oB1.getZaehler() * oB2.getNenner();
        iNenner = oB2.getZaehler() * oB1.getNenner();

        return Bruch.init(iZaehler, iNenner);
    }

    /**
     * Init Bruch-Objekt
     * 
     * @param iZaehler
     * @param iNenner
     * @return
     */
    public static Bruch init(int iZaehler, int iNenner) {
        int iGGT = Bruch.ggt(iZaehler, iNenner);
        iZaehler /= iGGT;
        iNenner /= iGGT;

        if (iNenner < 0) {
            iNenner *= -1;
            iZaehler *= -1;
        }

        return new Bruch(iZaehler, iNenner);
    }

    /**
     * GGT von zwei übergebenen Zahlen ermitteln
     * 
     * @param iZaehler
     * @param iNenner
     * @return
     */
    private static int ggt(int iZaehler, int iNenner) {
        int iMax = 0,
                iMod = 0,
                iResult = 1;

        if (iZaehler >= iNenner) {
            iMax = iZaehler;
            iMod = iNenner;
        } else {
            iMax = iNenner;
            iMod = iZaehler;
        }

        iMax = (iMax < 0 ? iMax * -1 : iMax);
        iMod = (iMod < 0 ? iMod * -1 : iMod);

        while (true) {
            iResult = iMax % iMod;
            iMax = iMod;
            if (iResult == 0) {
                break;
            }
            iMod = iResult;
        }

        return iMod;
    }

}
