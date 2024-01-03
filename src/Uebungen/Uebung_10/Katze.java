package Uebungen.Uebung_10;

public class Katze extends Tier {

    /**
     * Konstruktor
     * 
     * @param sName
     */
    public Katze(String sName) {
        super(sName);
    }

    @Override
    public void verstaendigen() {
        System.out.printf("%s macht Miau\n", this.getName());
    }

}
