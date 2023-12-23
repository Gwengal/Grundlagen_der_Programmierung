package Uebungen.Uebung_2;

public class Zuweisung {
    public static void main(String[] args) {
        int x = 3, y = 2, z;

        // 4 = 3 + 1
        System.out.println(z = x + 1);
        // 8 = 4 + 3 + 1
        System.out.println(z += x + 1);
        // 13 = 8 + 3 + 2
        System.out.println(z += x + y); 
        /*
         * x+=y: 5=3+2
         * z+=x: 18=13+5 
         */
        System.out.println(z += x += y);
        /*
         * y = 1
         * x+=y: 6=5+1
         * z+=x: 24=18+6 
         */      
        System.out.println(z += x += y = 1);
        /*
         * 12=6*2
         */
        System.out.println(x *= x = 2);
    }
}
