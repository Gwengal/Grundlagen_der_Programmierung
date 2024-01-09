package Kapitel_08;

public class Kugel implements Sortierbar{
    private int _iRadius;
    private String _sFarbe;

    public Kugel(int iRadius, String sFarbe){
        this.setRadius(iRadius);
        this.setFrabe(sFarbe);
    }

    @Override
    public int istGroesser(Sortierbar oElement){
        Kugel oKugel = (Kugel)oElement;

        return this.getRadius() - oKugel.getRadius();
    }

    @Override
    public String toString(){
        return String.format("Kugel:\n- Farbe: %s\n- Radius %2d\n", this.getFarbe(), this.getRadius());
    }

    public int getRadius(){
        return this._iRadius;
    }
    public String getFarbe(){
        return this._sFarbe;
    }
    public void setRadius(int i){
        this._iRadius = i;
    }
    public void setFrabe(String s){
        this._sFarbe = s;
    }
}
