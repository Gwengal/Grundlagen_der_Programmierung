package Uebungen.Uebung_4;

public class Power {
    public static void main(String[] args) {
        System.out.println(Power.power(4, 5));
    }

    /**
     * Rekursiver Aufruf Exponentenberechnung
     * 
     * @param basis
     * @param exponent
     * @return
     */
    private static long power(int basis, int exponent){
        if (exponent == 0) {
            return 1;
        }

        return basis * Power.power(basis, (exponent-1));
    }
}
