package Uebungen.Uebung_10;

public abstract class Figur {
    // --| Attribute |--
    private String _sFarbe;

    // --| Methoden |--
    /**
     * Konstruktor
     * 
     * @param sFarbe
     */
    public Figur(String sFarbe) {
        this.setFarbe(sFarbe);
    }

    /**
     * Getter für _sFarbe
     * 
     * @return
     */
    public String getFarbe() {
        return this._sFarbe;
    }

    /**
     * Setter für _sFarbe
     * 
     * @param sFarbe
     */
    public void setFarbe(String sFarbe) {
        this._sFarbe = sFarbe;
    }

    /**
     * Ausgabe der Figuren
     */
    public void print(){
        System.out.println(this + "\n");
    }

    @Override
    public String toString() {
        String[] aCompName = this.getClass().getName().split("\\.");
        String sOutput = String.format("Typ: %s\n", aCompName[aCompName.length-1]);
        sOutput = String.format("%sFarbe: %s\n", sOutput, this.getFarbe());
        sOutput = String.format("%sUmfang: %2.2f\n", sOutput, this.getUmfang());
        sOutput = String.format("%sFläche: %2.2f\n", sOutput, this.getFlaeche());

        return sOutput;
    }

    /**
     * Rückgabe des Umfangs der Figur
     * 
     * @return
     */
    public abstract double getUmfang();

    /**
     * Rückgabe der Fläche von der Figur
     * 
     * @return
     */
    public abstract double getFlaeche();
}
