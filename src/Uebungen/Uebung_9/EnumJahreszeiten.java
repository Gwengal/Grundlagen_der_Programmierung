package Uebungen.Uebung_9;

public class EnumJahreszeiten {
    public static void main(String[] args) {
        System.out.println("Die Jahreszeiten: \n");
        for (Jahreszeiten eJahreszeit : Jahreszeiten.values()) {
            System.out.print(eJahreszeit + "\t");
        }
        System.out.println("\n\n");

        Wetter oWetter = new Wetter(Jahreszeiten.SOMMER, false);
        oWetter.print();

        oWetter = new Wetter(Jahreszeiten.WINTER, true);
        oWetter.print();

        oWetter = new Wetter(Jahreszeiten.FRUEHLING, true);
        oWetter.print();

        oWetter = new Wetter(Jahreszeiten.HERBST, false);
        oWetter.print();
    }
}
