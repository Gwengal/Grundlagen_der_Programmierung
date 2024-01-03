package Uebungen.Uebung_10;

public class Kreis extends Figur{
    // --| Attribute |--
    private double _dRadius;
    
    // --| Methoden |--
    public Kreis(String sFarbe, double dRadius){
        super(sFarbe);
        this.setRadius(dRadius);
    }

    /**
     * Getter für _fRadius
     * 
     * @return
     */
    public double getRadius(){
        return this._dRadius;
    }

    /**
     * Setter für Radius
     * 
     * @param dRadius
     */
    public void setRadius(double dRadius){
        this._dRadius = dRadius;
    }

    @Override
    public double getUmfang() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public double getFlaeche() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public String toString() {
        String sOutput = super.toString();
        sOutput = String.format("%sRadius: %2.2f\n", sOutput, this.getRadius());

        return sOutput;
    }
    
}
