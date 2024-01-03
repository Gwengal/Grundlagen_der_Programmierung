package Uebungen.Uebung_10;

public abstract class Mensch {
    private String _sFach;

    public Mensch(String sFach) {
        this.setFach(sFach);
    }

    public String getFach() {
        return this._sFach;
    }

    public void setFach(String s) {
        this._sFach = s;
    }
}
