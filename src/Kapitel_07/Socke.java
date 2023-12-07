package Kapitel_07;

public class Socke {
    // --| Attribute |--
    public static int iAnzahl = 0;
    private String _sFarbe;
    private boolean _bTrocken;

    // --| Konstrukturen |--
    public Socke() {
        iAnzahl++;
    }
    /**
     * @param sFarbe
     * @param bTrocken
     */
    private Socke(String sFarbe, boolean bTrocken) {
        this();
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

    // --| Methoden |--
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
    public void print(){
        System.out.println("Stinki ist " + this.getFarbe() + " und ist " + (this.getTrocken() ? "trocken" : "nass"));
    }

    /**
     * Initialisierung einer Instanz zur Socke
     * 
     * @param sFarbe
     * @param bTrocken
     * @return
     */
    public static Socke init(String sFarbe, boolean bTrocken){
        return new Socke(sFarbe, bTrocken);
    }
    /**
     * Initialisierung einer Instanz zur Socke
     * 
     * @param sFarbe
     * @return
     */
    public static Socke init(String sFarbe){
        return new Socke(sFarbe, true);
    }
}
