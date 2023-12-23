package Uebungen.Uebung_2;

public class Arithmetik {
    public static void main(String[] args) {
        int n; 

        /*
         * 4 * 5 = 20
         * - 3 + 20 = 17
         * 17 - 6 = 11
         */
        n = - 3 + 4 * 5 - 6;
        System.out.println(n);

        /*
         * 4 % 5 = 4
         * 3 + 4 = 7
         * 7 - 6 = 1
         */
        n = 3 + 4 % 5 - 6;
        System.out.println(n);

        /*
         * - 3 * 5 = -15
         * - 15 % 11 = -4
         * - 4 / 2 = -2
         */
        n = - 3 * 5 % 11 / 2;
        System.out.println(n);
    }
}
