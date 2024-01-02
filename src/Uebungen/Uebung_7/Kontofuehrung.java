package Uebungen.Uebung_7;

public class Kontofuehrung {
    public static void main(String[] args){
        Konto konto1 = new Konto("Hans Maier", 1234567);
        Konto konto2 = new Konto("Uta Mueller", 7654321);

        konto1.einzahlen(100.F);
        konto2.abheben(300.F);
        konto1.auszugDrucken();
        konto2.auszugDrucken();
    }
}
