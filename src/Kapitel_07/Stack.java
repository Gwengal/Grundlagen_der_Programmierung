package Kapitel_07;

public class Stack {
    // --| Attribute |--
    private Buch[] _aBooks;
    /*
     * zeigt immer auf das nächste leere Feld
     * und gibt die Anzahl der Bücher an
     */
    private int _iTop;

    // --| Konstruktor |--
    public Stack(int iNumElements) {
        _aBooks = new Buch[iNumElements];
        this.setTop(0);
    }

    // --| Getter |--
    public int getTop() {
        return this._iTop;
    }

    // --| Setter |--
    public void setTop(int iTop) {
        this._iTop = iTop;
    }

    // --| öffentliche Methoden |--
    /**
     * Buch zum Stack hinzufügen
     * 
     * @param oBook
     */
    public void push(Buch oBook) {
        //_aBooks[_iTop++] = oBook;
        _aBooks[this.getTop()] = oBook;
        this.setTop(this.getTop()+1);
    }

    /**
     * Rückgabe des letzten Buches
     *  
     * @return
     */
    public Buch pop(){
        //return _aBooks[--_iTop];
        this.setTop(this.getTop()-1);

        Buch oBook = _aBooks[this.getTop()];
        _aBooks[this.getTop()] = null;

        return oBook;
    }
    
    /**
     * Ist das Array leer?
     * 
     * @return
     */
    public boolean isEmpty(){
        return this.getTop() == 0;
    }

    /**
     * Ist das Array voll?
     * 
     * @return
     */
    public boolean isFull(){
        return this.getTop() == _aBooks.length;
    }
}
