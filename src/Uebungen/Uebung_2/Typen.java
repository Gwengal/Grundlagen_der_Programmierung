package Uebungen.Uebung_2;

public class Typen {
    public static void main(String[] args) {
        int i;
        float f;

        /*
         * Ergebnis ist 0:
         * - 0.9 wird abgerundet auf 0
         * - 0 * 2 = 0
         */
        i = (int)0.9F*2;
        System.out.println(i);

        /*
         * Ergebnis ist 50:
         * - 7/2 = 3 
         * - 3 + 2 = 5
         * - 5 * 10 = 50
         */
        i = 2;
        i = 10 * (i + 7/2);
        System.out.println(i);

        /*
         * Ergebnis ist 3:
         * - 10 / 3 = 3 (da Werte als Integer intepretiert werden)
         */
        f = 10/3;
        System.out.println(f);

        /*
         * Ergebnis ist 3,3333:
         * - f = 10 (wird als Float interpretiert)
         * - 10 / 3 = 3,3333 (da ein Wert ein Float ist)
         */
        f = 10;
        f = f/3;
        System.out.println(f);
    }
}
