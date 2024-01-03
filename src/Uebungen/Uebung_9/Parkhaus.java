package Uebungen.Uebung_9;

public class Parkhaus {
    private Auto[] _aCars;
    private int _iTop;

    /**
     * Konstruktor
     * 
     * @param iSpace
     */
    public Parkhaus(int iSpace) {
        this._aCars = new Auto[iSpace];
    }

    /**
     * Übergebenes Auto fährt ein
     * 
     * @param oCar
     */
    public void einfahren(Auto oCar) {
        if (this.emptySpaces() == 0) {
            System.out.printf("Fahrzeug %s kann nicht einfahren!\n", oCar);
            System.out.printf("Parkhaus ist leider voll (%d/%d)!\n", this._iTop, this._aCars.length);
            return;
        }

        this._aCars[this._iTop++] = oCar;
        System.out.printf("Fahrzeug %s ist eingefahren (%d/%d).\n", oCar, this._iTop, this._aCars.length);
    }

    /**
     * Gibt die Anzahl der freien Plätze zurück
     * > 0 - freie Plätze vorhanden
     * = 0 - keine freien Plätze vorhanden
     * 
     * @return
     */
    public int emptySpaces() {
        return this._aCars.length - this._iTop;
    }

    /**
     * Ausgabe der Autos, die sich im Parkhaus befinden
     */
    public void print(){
        System.out.printf("%d Autos befinden sich im Parkhaus: \n", this._iTop);
        for(Auto oCar : this._aCars){
            System.out.printf("- %s\n", oCar);
        }
    }
}
