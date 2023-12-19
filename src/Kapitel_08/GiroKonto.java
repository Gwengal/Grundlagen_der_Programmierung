package Kapitel_08;

public class GiroKonto extends Konto{
    private float _fDispo;
    private int _iPinNumber;

    // --| Konstruktor |--
    public GiroKonto(int iNumber, float fDispo, int iPinNumber){
        super(iNumber);
        this.setDispo(fDispo);
        this.setPinNumber(iPinNumber);
    }

    // --| Getter |--
    public float getDispo(){
        return this._fDispo;
    }
    public int getPinNumber(){
        return this._iPinNumber;
    }

    // --| Setter |--
    public void setDispo(float fDispo){
        this._fDispo = fDispo;
    }
    public void setPinNumber(int iPinNumber){
        this._iPinNumber = iPinNumber;
    }
    
    public boolean checkDispo(float b){
        return (this.getStand()-b) >= this.getDispo();
    }

    public void print(){
        super.print();
        System.out.println("Geheimzahl: " + this.getPinNumber() + "\nDispo: " + this.getDispo());
    }
}
