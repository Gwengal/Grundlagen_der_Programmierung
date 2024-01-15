package Testate.Testat_12;

public class Sortieren {
    public static void main(String[] args) {
        Figur[] aFigurs = new Figur[10];
        aFigurs[0] = new Kugel("Blau", 2.34);
        aFigurs[1] = new Quadar("Gelb", 2.0, 4.5, 5.1);
        aFigurs[2] = new Quadar("Violet", 3.0, 2.0, 1.0);
        aFigurs[3] = new Kugel("Grün", 4.5);
        aFigurs[4] = new Kugel("Magenta", 5.22);
        aFigurs[5] = new Quadar("Schwarz", 4.5, 2.3, 1.3);
        aFigurs[6] = new Quadar("Weiß", 5.4, 2.3, 4.5);
        aFigurs[7] = new Kugel("Rot", 7.4);
        aFigurs[8] = new Kugel("Grau", 1.3);
        aFigurs[9] = new Quadar("Orange", 3.3, 2.2, 1.1);

        System.out.println("Unsortiert:");
        Sortieren.print(aFigurs);

        System.out.println("\nSortiert:");
        Sortieren.sort(aFigurs);
        Sortieren.print(aFigurs);
    }

    /**
     * Objekte aus dem Array sortieren
     * 
     * @param aSort
     */
    private static void sort(Sortierbar[] aSort) {
        boolean bSort = true;
        Sortierbar oBuffer;

        while (bSort) {
            bSort = false;

            for (int i = 1; i < aSort.length; i++) {
                if (aSort[i-1] != null && aSort[i] != null && aSort[i-1].istGroesser(aSort[i]) > 0) {
                    oBuffer    = aSort[i-1];
                    aSort[i-1] = aSort[i];
                    aSort[i]   = oBuffer;

                    bSort = true;
                }
            }
        }
    }

    /**
     * Objekte aus dem Array ausgeben
     * 
     * @param aSort
     */
    private static void print(Sortierbar[] aSort) {
        for (Sortierbar oSort : aSort) {
            System.out.println(oSort);
        }
    }
}

interface Sortierbar {
    public int istGroesser(Sortierbar oSort);
}

abstract class Figur implements Sortierbar {
    // Attribute
    private String _sFarbe;

    /**
     * Konstruktor
     * 
     * @param sFarbe
     */
    public Figur(String sFarbe) {
        this._sFarbe = sFarbe;
    }

    /**
     * Volumen einer Figur berechnen
     * 
     * @return
     */
    protected abstract double calcVolumen();

    @Override
    public String toString() {
        String sOutput = "";
        String[] aClassName = this.getClass().getName().split("\\.");

        sOutput = String.format("%s:", aClassName[(aClassName.length - 1)]);
        sOutput = String.format("%s\tFarbe: %s", sOutput, this._sFarbe);
        sOutput = String.format("%s\tVolumen: %.3f cm³", sOutput, this.calcVolumen());

        return sOutput;
    }

    @Override
    public int istGroesser(Sortierbar oSort) {
        Figur oFigur = (Figur) oSort;

        return (int) (this.calcVolumen() - oFigur.calcVolumen());
    }
}

class Kugel extends Figur {
    // Attribute
    private double _dRad;

    /**
     * Konstruktor
     * 
     * @param sFarbe
     * @param dRad
     */
    public Kugel(String sFarbe, double dRad) {
        super(sFarbe);
        this._dRad = dRad;
    }

    @Override
    public double calcVolumen() {
        return ((4.0 / 3.0) * Math.pow(this._dRad, 3) * Math.PI);
    }
}

class Quadar extends Figur {
    // Attribute
    private double _dLength,
            _dWidth,
            _dHeight;

    /**
     * Konstruktor
     * 
     * @param sFarbe
     * @param dLength
     * @param dWidth
     * @param dHeight
     */
    public Quadar(String sFarbe, double dLength, double dWidth, double dHeight) {
        super(sFarbe);
        this._dLength = dLength;
        this._dWidth = dWidth;
        this._dHeight = dHeight;
    }

    @Override
    protected double calcVolumen() {
        return (this._dLength * this._dWidth * this._dHeight);
    }
}
