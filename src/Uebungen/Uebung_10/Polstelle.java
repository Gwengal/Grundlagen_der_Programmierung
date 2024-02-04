package Uebungen.Uebung_10;

public class Polstelle {
    public static void main(String[] args) {
        Polstelle.calculate(-10, 10);
    }

    /**
     * Ergebnisse zur Funktion aus Aufgabe 1 berechnen
     * 
     * @param iMin
     * @param iMax
     */
    private static void calculate(int iMin, int iMax) {
        double dCalc, dNenner;

        for (int i = iMin; i <= iMax; i++) {
            try {
                System.out.printf("%d\t", i);

                dNenner = Polstelle.pow(i, 3) - (5 * Polstelle.pow(i, 2)) - i + 5;
                if (dNenner == 0) {
                    throw new Exception("Polstelle");
                }

                dCalc = 1.0 / dNenner;
                System.out.printf("%f\n", dCalc);
            } catch (Exception e) {
                System.out.printf("%s\n", e.getMessage());
            }
        }
    }

    /**
     * Potenz berechnen
     * 
     * @param iNumber
     * @param iPower
     * @return
     */
    private static int pow(int iNumber, int iPower) {
        if (iPower == 0) {
            return 1;
        }

        return iNumber * Polstelle.pow(iNumber, iPower - 1);
    }
}
