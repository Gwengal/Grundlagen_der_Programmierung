package Testate;

public class Faehre {
    // --| Attribute |--
    private static int _iStars = 29;
    private int _iTop;
    private Auto[] _aCars;

    // --| Konstruktoren |--
    public Faehre(int iNumElements){
        this.setTop(0);
        this._aCars = new Auto[iNumElements];

        this.printStars(Faehre._iStars);
        System.out.println("Willkommen in unserem Hafen!");
        this.printStars(Faehre._iStars);
    }

    // --| Getter |--
    public int getTop(){
        return this._iTop;
    }

    // --| Setter |--
    public void setTop(int iTop){
        this._iTop = iTop;
    }

    // --| öffentliche Methoden
    /**
     * Neues Auto der Liste hinzüfgen
     * 
     * @param oCar
     * @throws Exception
     */
    public void push(Auto oCar) {
        if (this.isFull()) {
            System.out.println("Fähre ist voll! (" + this._aCars.length + "/" + this.getTop() + ")");
            System.out.println("Das Auto " + oCar.getLicPlate() + " mit dem Gewicht " + oCar.getWeight() + " kg kann nicht mitfahren");
            return;
        }

        this._aCars[this.getTop()] = oCar;
        this.setTop(this.getTop() + 1);
    }

    /**
     * Letztes Auto aus der Liste entfernen
     * 
     * @return
     * @throws Exception
     */
    public Auto pop() throws Exception{
        if (this.isEmpty()) {
            System.out.println("Auf der Fähre befinden sich keine Fahrzeuge! (" + this._aCars.length + "/" + this.getTop() + ")");
            return null;
        }

        this.setTop(this.getTop() - 1);
        Auto oBuffer = this._aCars[this.getTop()];
        this._aCars[this.getTop()] = null;

        return oBuffer;
    }
    
    /**
     * Prüft ob die Liste leer ist
     * 
     * @return
     */
    public boolean isEmpty(){
        return this.getTop() == 0;
    }

    /**
     * Prüft ob die Liste voll ist
     * 
     * @return
     */
    public boolean isFull(){
        return this.getTop() == this._aCars.length;
    }

    /**
     * Ausgabe Gesamtgewicht der Fähre
     * 
     * @return
     */
    public void outputSumWeight(){
        int iSumWeight = 0;

        for (Auto oCar : this._aCars) {
            iSumWeight += oCar.getWeight();
        }

        this.printStars(Faehre._iStars);
        System.out.println("Aktuelles Gewicht auf der Fähre: " + iSumWeight + " kg");
    }

    /**
     * Ausgabe der Autos auf der Fähre
     */
    public void outputCars(){

    }

    // --| private Methoden |--
    private void printStars(int iNum){
        for (int i = 0; i < iNum; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
