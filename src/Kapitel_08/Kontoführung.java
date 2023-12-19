package Kapitel_08;

public class Kontoführung {
    /**
     * @param args
     */
    public static void main(String[] args) {
        GiroKonto oKonto = new GiroKonto(445621, 1000.F, 1234);
        oKonto.einzahlen(500.F);

        oKonto.print();

        if (oKonto.checkDispo(200.F)) {
            oKonto.auszahlen(200.F);
            System.out.println("200,- Euro ausgezahlt");
        }else{
            System.out.println("Keine Auszahlung, Dispo überschritten");
        }
    }
}
