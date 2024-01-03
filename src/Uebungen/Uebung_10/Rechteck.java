package Uebungen.Uebung_10;

public class Rechteck extends Figur {
    // --| Attribute |--
    private double _dLaenge;
    private double _dBreite;

    public Rechteck(String sFarbe, double dLaenge, double dBreite) {
        super(sFarbe);
        this.setBreite(dBreite);
        this.setLaenge(dLaenge);
    }

    /**
     * Getter für _dLaenge
     * 
     * @return
     */
    public double getLaenge() {
        return this._dLaenge;
    }

    /**
     * Getter für _dBreite
     * 
     * @return
     */
    public double getBreite() {
        return this._dBreite;
    }

    /**
     * Setter für _dLaenge
     * 
     * @param dLaenge
     */
    public void setLaenge(double dLaenge) {
        this._dLaenge = dLaenge;
    }

    /**
     * Setter für _dBreite
     * 
     * @param dBreite
     */
    public void setBreite(double dBreite) {
        this._dBreite = dBreite;
    }

    @Override
    public double getFlaeche() {
        return this.getBreite() * this.getLaenge();
    }

    @Override
    public double getUmfang() {
        return (2 * this.getBreite()) + (2 * this.getLaenge());
    }

    @Override
    public String toString() {
        String sOutput = super.toString();
        sOutput = String.format("%sLänge: %2.2f\n", sOutput, this.getLaenge());
        sOutput = String.format("%sBreite: %2.2f\n", sOutput, this.getBreite());

        return sOutput;
    }

}
