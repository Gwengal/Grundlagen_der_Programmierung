package Kapitel_07;

enum Typ{
    // --| Mögliche Werte |--
    RECHTS, LINKS;

    public String bedienungsAnleitung(){
        String sReturn = "";
        
        switch (this) {
            case RECHTS:
                sReturn = "Ziehe die Socke rechts an";
                break;
        
            case LINKS:
                sReturn = "Ziehe die Socke links an";
                break;
        }

        return sReturn;
    }

}

public class Socke {
    // --| Klassen-Attribute |--
    private static int _iAnzahl = 0;

    // --| Klassen-Methoden |--
    /**
     * Anzahl der Socken zurückgeben
     * 
     * @return
     */
    public static int getAnzahl() {
        return Socke._iAnzahl;
    }

    /**
     * Initialisierung einer Instanz zur Socke
     * 
     * @param sFarbe
     * @param bTrocken
     * @return
     */
    public static Socke init(String sFarbe, boolean bTrocken) {
        return new Socke(sFarbe, bTrocken, Typ.RECHTS);
    }

    /**
     * Initialisierung einer Instanz zur Socke
     * 
     * @param sFarbe
     * @return
     */
    public static Socke init(String sFarbe, Typ eTyp) {
        return new Socke(sFarbe, true, eTyp);
    }

    // --| Instanz-Konstanten |--
    private final Typ _eTyp;

    // --| Instanz-Attribute |--
    private String _sFarbe;
    private boolean _bTrocken;

    // --| Konstrukturen |--
    private Socke(Typ eTyp) {
        Socke._iAnzahl++;
        this._eTyp = eTyp;
    }

    /**
     * @param sFarbe
     * @param bTrocken
     */
    private Socke(String sFarbe, boolean bTrocken, Typ eTyp) {
        this(eTyp);
        this.setFarbe(sFarbe);
        this.setTrocken(bTrocken);
    }

    // --| Getter und Setter für Instanzvariablen |--
    /**
     * Rückgabe Trocken-Status
     * 
     * @return
     */
    public boolean getTrocken() {
        return _bTrocken;
    }

    /**
     * Setzen Trocken-Status
     * 
     * @param bTrocken
     */
    public void setTrocken(boolean bTrocken) {
        this._bTrocken = bTrocken;
    }

    /**
     * Rückgabe der Socken-Farbe
     * 
     * @return
     */
    public String getFarbe() {
        return _sFarbe;
    }

    /**
     * Setzen der Socken-Farbe
     * 
     * @param sFarbe
     */
    public void setFarbe(String sFarbe) {
        this._sFarbe = sFarbe;
    }

    /**
     * Typen zurückgeben
     * 
     * @return
     */
    public Typ getTyp(){
        return this._eTyp;
    }

    // --| Instanz-Methoden |--
    /**
     * Socke ausführen
     */
    public void waschen() {
        this.setFarbe("blass");
        this.setTrocken(false);
    }

    /**
     * Socke trocknen
     */
    public void trocken() {
        this.setTrocken(true);
    }

    /**
     * Ausgabe der Farbe und des Trocken-Status
     */
    public void print() {
        System.out.println("Stinki ist " + this.getFarbe() + " und ist " + (this.getTrocken() ? "trocken" : "nass"));
    }
}
