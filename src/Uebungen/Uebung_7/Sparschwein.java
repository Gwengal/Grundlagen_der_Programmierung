package Uebungen.Uebung_7;

public class Sparschwein {
    private String _sName;
    private float _fMoney;

    /**
     * Init der Membervariablen
     * 
     * @param sName
     * @param fMoney
     */
    public void init(String sName, float fMoney){
        this.setName(sName);
        this.setMoney(fMoney);
    }

    /**
     * Geld ins Sparschwein einzahlen
     * 
     * @param fInput
     */
    public void fuettern(float fInput){
        this.setMoney(this.getMoney() + fInput);
    }
    /**
     * Gesamtes Geld aus dem Sprschwein auszahlen
     * 
     * @return
     */
    public float schlachten(){
        float fReturn = this.getMoney();
        this.setMoney(0.F);

        return fReturn;
    }

    // --| Setter |-- 
    public void setName(String sName){
        this._sName = sName;
    }
    public void setMoney(float fMoney){
        this._fMoney = fMoney;
    }
    // --| Getter |--
    public String getName(){
        return this._sName;
    }
    public float getMoney(){
        return this._fMoney;
    }
}
