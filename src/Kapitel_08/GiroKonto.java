package Kapitel_08;

public class GiroKonto extends Konto{
    private float _fDispo;

    // --| Konstruktor |--

    // --| Getter |--
    public float getDispo(){
        return this._fDispo;
    }
    // --| Setter |--
    public void setDispo(float fDispo){
        this._fDispo = fDispo;
    }

    public boolean checkDispo(float b){
        return (this.getStand()-b) >= this.getDispo();
    }
}
