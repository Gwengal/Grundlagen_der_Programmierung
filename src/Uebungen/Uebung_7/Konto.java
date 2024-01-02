package Uebungen.Uebung_7;

public class Konto {
    private String _sKontoInhaber;
    private float _fKontoStand;
    private long _lKontoNummer;

    /**
     * Konstruktor
     * 
     * @param sKontoInhaber
     * @param lKontoNummer
     */
    public Konto(String sKontoInhaber, long lKontoNummer) {
        this.setKontoInhaber(sKontoInhaber);
        this.setKontonNummer(lKontoNummer);
        this.setKontoStand(0.F);
    }

    // --| Getter |--
    public String getKontoInhaber() {
        return this._sKontoInhaber;
    }

    public float getKontoStand() {
        return this._fKontoStand;
    }

    public long getKontoNummer() {
        return this._lKontoNummer;
    }

    // --| Setter |--
    public void setKontoInhaber(String sKontoInhaber) {
        this._sKontoInhaber = sKontoInhaber;
    }

    public void setKontoStand(float fKontoStand) {
        this._fKontoStand = fKontoStand;
    }

    public void setKontonNummer(long lKontoNummer) {
        this._lKontoNummer = lKontoNummer;
    }

    /**
     * Betrag einzahlen
     * 
     * @param fInput
     */
    public void einzahlen(float fInput) {
        this.setKontoStand(this.getKontoStand() + fInput);
    }

    /**
     * Betrag abheben
     * 
     * @param fOut
     * @return
     */
    public float abheben(float fOut) {
        this.setKontoStand(this.getKontoStand() - fOut);
        return this.getKontoStand();
    }

    /**
     * Kontoauszug ausgeben
     */
    public void auszugDrucken(){
        this.printStars(25);
        System.out.printf("Kontohalter: %s\n", this.getKontoInhaber());
        System.out.printf("Kontonummer: %d\n", this.getKontoNummer());
        System.out.printf("Kontostand: %.2f Euro\n", this.getKontoStand());
        this.printStars(25);
    }

    /**
     * Sterne aus Msg ausgeben
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
