package Kapitel_08;

public class Konto {
    private int _iNumber;
    private float _fStand;

    // --| Konstruktoren |--
    public Konto(int iNumber){
        this.setNumber(iNumber);
    }

    // --| Instanz-Methoden |--
    /**
     * Betrag einzahlen
     * 
     * @param fBetrag
     */
    public void einzahlen(float fBetrag){
        this.setStand(this.getStand() + fBetrag);
    }

    /**
     * Betrag auszahlen
     * 
     * @param fBetrag
     */
    public void auszahlen(float fBetrag){
        this.setStand(this.getStand() - fBetrag);
    }

    /**
     * Kontonummer und Stand ausgeben
     */
    public void print(){
        System.out.println("Kontonummer: " + this.getNumber() + "\nKontostand: " + this.getStand() + " EUR\n");
    }

    // --| Getter |--
    public int getNumber(){
        return this._iNumber;
    }
    public float getStand(){
        return this._fStand;
    }
    // --| Setter |--
    public void setNumber(int iNumber){
        this._iNumber = iNumber;
    }
    public void setStand(float fStand){
        this._fStand = fStand;
    }
}
