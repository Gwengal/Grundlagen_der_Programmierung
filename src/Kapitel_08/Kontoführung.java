package Kapitel_08;

public class Kontoführung {
    /**
     * @param args
     */
    public static void main(String[] args) {
        GiroKonto oKonto = new GiroKonto();
        oKonto.setDispo(1000.F);
        oKonto.einzahlen(500.F);

        if (oKonto.checkDispo(200.F)) {
            oKonto.auszahlen(200.F);
            System.out.println("200,- Euro ausgezahlt");
        }else{
            System.out.println("Keine Auszahlung, Dispo überschritten");
        }
    }
}
