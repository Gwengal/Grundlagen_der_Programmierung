package Testate;

public class Auto {
    // --| Attribute |__
    private String _sLicPlate;
    private int _iWeight;

    // --| Konstruktoren |--
    public Auto(String sLicPlate, int iWeight){
        this.setLicPlate(sLicPlate);
        this.setWeight(iWeight);
    }

    // --| Getter |--
    public String getLicPlate(){
        return this._sLicPlate;
    }
    public int getWeight(){
        return this._iWeight;
    }

    // --| Setter |--
    public void setLicPlate(String sLicPlate){
        this._sLicPlate = sLicPlate;
    }
    public void setWeight(int iWeight){
        this._iWeight = iWeight;
    }
}
