package Kapitel_07;

public class Buch {
    // --| Attribute |--
    private String _sAutor;
    private String _sTitel;

    // --| Konstruktoren |--
    private Buch(String sAutor, String sTitel){
        this.setAutor(sAutor);
        this.setTitel(sTitel);
    }

    // --| Getter |-- 
    public String getAutor(){
        return this._sAutor;
    }
    public String getTitel(){
        return this._sTitel;
    }

    // --| Setter |--
    public void setAutor(String sAutor){
        this._sAutor = sAutor;
    }
    public void setTitel(String sTitel){
        this._sTitel = sTitel;
    }

    // --| öffentliche Methoden |--
    /**
     * Rückgabe der Instanz zum Buch
     * 
     * @param sAutor
     * @param sBuch
     * @return
     */
    public static Buch init(String sAutor, String sBuch){
        return new Buch(sAutor, sBuch);
    }

    /**
     * Ausgabe des Titels + Autor 
     */
    public void print(){
        System.out.println("Buch:\t" + this.getTitel() +
                           "\nAutor:\t" + this.getAutor() + "\n");
    }
}
