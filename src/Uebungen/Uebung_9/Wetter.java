package Uebungen.Uebung_9;

enum Jahreszeiten {
    WINTER,
    HERBST,
    SOMMER,
    FRUEHLING
}

public class Wetter {
    private Jahreszeiten _eJahreszeit;
    private boolean _bNiederschlag;

    /**
     * Konstruktor
     * 
     * @param eJahreszeit
     * @param bNiederschlag
     */
    public Wetter(Jahreszeiten eJahreszeit, boolean bNiederschlag) {
        this.setJahreszeiten(eJahreszeit);
        this.setNiederschlag(bNiederschlag);
    }

    /**
     * Getter für _eJahreszeit
     * 
     * @return
     */
    public Jahreszeiten getJahreszeit() {
        return this._eJahreszeit;
    }

    /**
     * Getter für _bNiederschlag
     * 
     * @return
     */
    public boolean getNiederschlag() {
        return this._bNiederschlag;
    }

    /**
     * Setter für _eJahreszeit
     * 
     * @param eJahreszeit
     */
    public void setJahreszeiten(Jahreszeiten eJahreszeit) {
        this._eJahreszeit = eJahreszeit;
    }

    /**
     * Setter für _bNiederschlag
     * 
     * @param bNiederschlag
     */
    public void setNiederschlag(boolean bNiederschlag) {
        this._bNiederschlag = bNiederschlag;
    }

    /**
     * Referenzbeschreibung überschreiben
     * 
     * @return
     */
    public String toString(){
        String sNiederschlag = "ist trocken.";

        if (this.getNiederschlag()) {
            sNiederschlag = "regnet!";
            if (this.getJahreszeit() == Jahreszeiten.WINTER) {
                sNiederschlag = "schneit!";
            }
        }

        return String.format("Wir haben %s und es %s", this.getJahreszeit(), sNiederschlag);
    }

    /**
     * Ausgabe des aktuellen Statuses
     */
    public void print(){
        this.printStars(25);
        System.out.println(this);
        this.printStars(25);
    }

    /**
     * Sternchen ausgeben
     * 
     * @param i
     */
    private void printStars(int i){
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
