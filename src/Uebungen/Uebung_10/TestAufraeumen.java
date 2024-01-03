package Uebungen.Uebung_10;

public class TestAufraeumen {
    public static void main(String[] args) {
        Termin[] meinKalender = new Termin[10];
        meinKalender[2] = new Termin("Zahnarzt", new Datum(5, 12, 2023));
        meinKalender[8] = new Termin("Geburtstag", new Datum(22, 02, 2024));
        meinKalender[7] = new Termin("Hochschule", new Datum(01, 10, 2024));
        meinKalender[3] = new Termin("Urlaub", new Datum(24, 12, 2024));

        System.out.println("Vor dem Aufräumen: ");
        Array.print(meinKalender);

        Array.aufraumen(meinKalender);
        System.out.println("Nach dem Aufräumen: ");
        Array.print(meinKalender);

        Array.sort(meinKalender);
        System.out.println("Nach dem Sortieren: ");
        Array.print(meinKalender);
    }
}
