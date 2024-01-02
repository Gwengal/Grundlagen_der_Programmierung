package Uebungen.Uebung_8;

public class TestRaum {
    public static void main(String[] args){
        Raum oRaum = new Raum();
        oRaum.belegen(12);
        oRaum.belegen(18);
        oRaum.belegen(8);
        oRaum.belegen(9);
        oRaum.loeschen(9);

        oRaum.belegungsPlanDrucken();
    }
}
