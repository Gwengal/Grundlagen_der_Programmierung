package Uebungen.Uebung_10;

public abstract class Tier {
    private String _sName;

    /**
     * Konstruktor
     * 
     * @param sName
     */
    public Tier(String sName) {
        this.setName(sName);
    }

    /**
     * Getter für _sName
     * 
     * @return
     */
    public String getName() {
        return this._sName;
    }

    /**
     * Setter für _sName
     * 
     * @param s
     */
    public void setName(String s) {
        this._sName = s;
    }

    /**
     * Tiergeräusche machen
     */
    public abstract void verstaendigen();
}
