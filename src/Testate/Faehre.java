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
     */
    public void push(Auto oCar) {
        if (this.isFull()) {
            System.out.println("\nFähre ist voll! (" + this.getTop() + "/" + this._aCars.length + ")");
            System.out.println("Das Auto " + oCar.getLicPlate() + " mit dem Gewicht " + oCar.getWeight() + " kg kann nicht mitfahren.\n");
            return;
        }

        this._aCars[this.getTop()] = oCar;
        this.setTop(this.getTop() + 1);

        System.out.println("Das Auto " + oCar.getLicPlate() + " mit dem Gewicht " + oCar.getWeight() + " kg ist auf die Fähre gefahren. (" + this.getTop() + "/" + this._aCars.length + ")");
    }

    /**
     * Letztes Auto aus der Liste entfernen
     * 
     * @return
     */
    public Auto pop(){
        this.printStars(Faehre._iStars);
        if (this.isEmpty()) {
            System.out.println("Auf der Fähre befinden sich keine Fahrzeuge! (" + this.getTop() + "/" + this._aCars.length + ")\n");
            return null;
        }

        this.setTop(this.getTop() - 1);
        Auto oBuffer = this._aCars[this.getTop()];
        this._aCars[this.getTop()] = null;
        
        System.out.println("Ausfahren des " + (this.getTop()+1) + ". Autos: " + oBuffer.getLicPlate() + " " + oBuffer.getWeight() + " kg. (" + this.getTop() + "/" + this._aCars.length + ")\n");
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
        System.out.println("Aktuelles Gewicht auf der Fähre: " + iSumWeight + " kg\n");
    }

    /**
     * Ausgabe der Autos auf der Fähre
     */
    public void outputCars(){
        this.printStars(Faehre._iStars);
        System.out.println("Momentan sind " + this._aCars.length + " Fahrzeuge auf der Fähre: ");

        for (Auto oCar : this._aCars) {
            System.out.println("- " + oCar.getLicPlate() + "\t" + oCar.getWeight() + " kg");
        }
        System.out.println();
    }

    // --| private Methoden |--
    /**
     * Sterne ausgeben
     * 
     * @param iNum
     */
    private void printStars(int iNum){
        for (int i = 0; i < iNum; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}