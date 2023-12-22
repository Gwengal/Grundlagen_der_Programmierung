package Uebungen.Uebung_1;

public class BinHex {
    public static void main(String[] args) {
        // Binäre 8 (=(2^3*1) + (2^2*0) + (2^1*0) + (2^0*0))
        int b = 0b1000;
        // Hex 17 (=(16^1*1) + (16^0*1))
        int x = 0x11;

        // Ausgabe der Zahl 8
        System.out.println(b);
        //  Ausgabe der Zahl 17
        System.out.println(x);
        // Ausgabe der Summe aus 8 + 17 = 25
        System.out.println(b+x);
    }
}
