package Testate;

public class Weihnachtskiste {
    public static void main(String[] args) {
        float fSumVol = 0;
        Weihnachtsschmuck[] oSchmuck = new Weihnachtsschmuck[3];
        oSchmuck[0] = new Kugel("Rot", 3.2F, "Glas");
        oSchmuck[1] = new Stern("Blau", 5.2F, true);
        oSchmuck[2] = new Kerze("Grün", 8);
        
        Weihnachtskiste.printStars(50);
        System.out.println("In der Kiste liegen: ");
        Weihnachtskiste.printStars(50);

        for (Weihnachtsschmuck oObject : oSchmuck) {
            fSumVol += oObject.getVolumen();
            oObject.print();
        }

        Weihnachtskiste.printStars(50);
        System.out.printf("In der Kiste sind bereits %.3f cm³ belegt\n", fSumVol);
        Weihnachtskiste.printStars(50);
    }

    public static void printStars(int i){
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

abstract class Weihnachtsschmuck {
    // --| Attribute |--
    private String _sFarbe;
    private double _dRadius;

    // --| Methoden |--
    /**
     * Konstruktor
     * 
     * @param sFarbe
     * @param dRadius
     */
    public Weihnachtsschmuck(String sFarbe, double dRadius) {
        this._sFarbe = sFarbe;
        this._dRadius = dRadius;
    }

    /**
     * Getter für _fRadius
     * 
     * @return
     */
    public double getRadius() {
        return this._dRadius;
    }

    /**
     * Objekt ausgeben
     */
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        String[] aClassname = this.getClass().getName().split("\\.");
        String sOutput = String.format("Schmuck: %s\n", aClassname[aClassname.length - 1]);
        sOutput = String.format("%sFarbe: %s\n", sOutput, this._sFarbe);
        sOutput = String.format("%sVolumen: %.3f cm³\n", sOutput, this.getVolumen());
        sOutput = String.format("%sRadius: %.3f cm\n", sOutput, this.getRadius());

        return sOutput;
    }

    /**
     * Volumen des Weihnachtsschmuckes
     * 
     * @return
     */
    public abstract double getVolumen();
}

class Kugel extends Weihnachtsschmuck {
    // --| Attribute |--
    private String _sMaterial;

    // --| Methoden |--
    /**
     * Konstruktor
     * 
     * @param sFarbe
     * @param dRadius
     */
    public Kugel(String sFarbe, double dRadius, String sMaterial) {
        super(sFarbe, dRadius);
        this._sMaterial = sMaterial;
    }

    @Override
    public double getVolumen() {
        return (4.0 / 3.0) * Math.pow(this.getRadius(), 3) * Math.PI;
    }

    @Override
    public String toString() {
        String sOutput = super.toString();
        sOutput = String.format("%sMaterial: %s\n", sOutput, this._sMaterial);

        return sOutput;
    }
}

class Stern extends Weihnachtsschmuck{
    // --| Attribute |--
    private boolean _bGlizert;

    // --| Methoden |--
    /**
     * Konstruktor
     * 
     * @param sFarbe
     * @param dRadius
     * @param bGlizert
     */
    public Stern(String sFarbe, double dRadius, boolean bGlizert){
        super(sFarbe, dRadius);
        this._bGlizert = bGlizert;
    }

    @Override
    public double getVolumen(){
        return Math.PI * Math.pow(this.getRadius(), 2) * 0.5;
    }

    @Override
    public String toString(){
        String sOutput = super.toString();
        sOutput = String.format("%sGliziert: %s\n", sOutput, (this._bGlizert ? "ja" : "nein"));

        return sOutput;
    }
}

class Kerze extends Weihnachtsschmuck{
    // --| Attribute |--
    private int _iHoehe;

    // --| Methoden |--
    /**
     * Konstruktor
     * 
     * @param sFarbe
     * @param iHoehe
     */
    public Kerze(String sFarbe, int iHoehe){
        super(sFarbe, 1.0);
        this._iHoehe = iHoehe;
    }

    @Override
    public double getVolumen(){
        return Math.PI * Math.pow(this.getRadius(), 2) * this._iHoehe;
    }

    @Override
    public String toString(){
        String sOutput = super.toString();
        sOutput = String.format("%sHöhe: %d cm\n", sOutput, this._iHoehe);

        return sOutput;
    }
}
