package Kapitel_08;

public class KFZ implements Groesse {
    private String _sKz;
    private int _iSitze;

    public KFZ(String sKz, int iSitze){
        this.setKz(sKz);
        this.setSitze(iSitze);
    }

    public String getKz(){
        return this._sKz;
    }
    public int getSitze(){
        return this._iSitze;
    }
    public void setKz(String sKz){
        this._sKz = sKz;
    }
    public void setSitze(int i){
        this._iSitze = i;
    }

    @Override
    public int getGroesse(){
        return this.getSitze();
    }

    @Override
    public String toString(){
        return this.getKz();
    }
}
