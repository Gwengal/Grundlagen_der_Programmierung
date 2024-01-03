package Uebungen.Uebung_10;

public class Hund extends Tier {

    /**
     * Konstruktor
     * 
     * @param sName
     */
    public Hund(String sName) {
        super(sName);
    }

    @Override
    public void verstaendigen() {
        System.out.printf("%s macht Wau\n", this.getName());
    }
}
