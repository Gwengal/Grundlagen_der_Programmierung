package Uebungen.Uebung_2;

public class Inkrement {
    public static void main(String[] args) {
        int x, z = 10;

        /*
         * x = 10
         * z = 11 (10 + 1)
         */
        System.out.println(x = z++);
        /*
         * x = 11 (10 + 1)
         * z = 11
         */
        System.out.println(z = ++x);
        /*
         * z = 12
         * x = 23 (11 + 12) 
         */
        System.out.println(x += ++z);
        /*
         * z = 35 (12 + 23)
         * x = 24
         */
        System.out.println(z += x++);
    }
}
