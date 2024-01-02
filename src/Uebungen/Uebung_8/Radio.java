package Uebungen.Uebung_8;

public class Radio {
    private boolean _bEingeschaltet;
    private int _iLautstaerke;
    private float _fFrequenz;

    public Radio() {
    }

    public Radio(boolean bIstAn, int iLaut, float fFreq) {
        this._bEingeschaltet = bIstAn;
        this._iLautstaerke = iLaut;
        this._fFrequenz = fFreq;
    }

    public void an() {
        this._bEingeschaltet = true;
    }

    public void aus() {
        this._bEingeschaltet = false;
    }

    public void lauter(int i) {
        if (this._bEingeschaltet) {
            this._iLautstaerke = ((i + this._iLautstaerke) > 10 ? 10 : (i + this._iLautstaerke));
        } else {
            System.out.println("Radio ist aktuell aus! Lautstärke kann nicht erhöht werden.");
        }
    }

    public void leiser(int i) {
        if (this._bEingeschaltet) {
            this._iLautstaerke = ((this._iLautstaerke - i) < 0 ? 0 : (this._iLautstaerke - i));
        } else {
            System.out.println("Radio ist aktuell aus! Lautstärke kann nicht reduziert werden.");
        }
    }

    public void wahleSender(float fFreq) {
        if (this._bEingeschaltet) {
            if (fFreq > 110.0F || fFreq < 85.0F) {
                this._fFrequenz = 99.9F;
            } else {
                this._fFrequenz = fFreq;
            }
        }else{
            System.out.println("Radio ist aktuell aus! Sender kann nicht ausgewählt werden.");
        }
    }

    public void getInfos() {
        if (this._bEingeschaltet) {
            System.out.printf("Radio an: Freq=%.1f, Laut=%2d\n", this._fFrequenz, this._iLautstaerke);
        } else {
            System.out.println("Das Radio ist aktuell aus!");
        }
    }
}
