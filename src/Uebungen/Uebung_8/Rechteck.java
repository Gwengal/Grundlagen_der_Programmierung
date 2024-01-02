package Uebungen.Uebung_8;

public class Rechteck {
    private int _iLength;
    private int _iWidth;

    public Rechteck(int iLength, int iWidth) {
        this.setLength(iLength);
        this.setWidth(iWidth);
    }

    public int getLength() {
        return this._iLength;
    }

    public int getWidth() {
        return this._iWidth;
    }

    public void setLength(int iLength) {
        this._iLength = iLength;
    }

    public void setWidth(int iWidth) {
        this._iWidth = iWidth;
    }

    public int getFlaeche(){
        return this.getLength() * this.getWidth();
    }

    public boolean istQuadrat(){
        return this.getLength() == this.getWidth();
    }

}
