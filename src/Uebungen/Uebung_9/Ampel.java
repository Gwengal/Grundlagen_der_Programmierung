package Uebungen.Uebung_9;

enum AmpelFarbe {
    ROT,
    ROTGELB,
    GELB,
    GRUEN
}

public class Ampel {
    private AmpelFarbe _eAmpelFarbe;

    /**
     * Konstruktor
     * 
     * @param eAmpelFarbe
     */
    public Ampel(AmpelFarbe eAmpelFarbe){
        if (eAmpelFarbe == null) {
            eAmpelFarbe = AmpelFarbe.ROT;
        }

        this.setAmpelFarbe(eAmpelFarbe);
    }

    /**
     * Referenzbeschreibung überschreiben
     * 
     * @return 
     */
    public String toString(){
        return String.format("%s", this.getAmpelFarbe());
    }

    /**
     * Getter für _eAmpelFarbe
     * 
     * @return
     */
    public AmpelFarbe getAmpelFarbe() {
        return this._eAmpelFarbe;
    }

    /**
     * Ampelfarben durchschalten
     */
    public void schalte(){        
        switch (this.getAmpelFarbe()) {
            case ROT:
                this.setAmpelFarbe(AmpelFarbe.ROTGELB);
                break;
            case ROTGELB:
                this.setAmpelFarbe(AmpelFarbe.GRUEN);
                break;
            case GRUEN:
                this.setAmpelFarbe(AmpelFarbe.GELB);
                break;
            case GELB:
                this.setAmpelFarbe(AmpelFarbe.ROT);
                break;
        }
    }

    /**
     * Setter für _eAmpelFarbe
     * 
     * @param eAmpelFarbe
     */
    private void setAmpelFarbe(AmpelFarbe eAmpelFarbe) {
        this._eAmpelFarbe = eAmpelFarbe;
    }
}
