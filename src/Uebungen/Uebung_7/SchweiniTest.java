package Uebungen.Uebung_7;

public class SchweiniTest {
    public static void main(String[] args){
        Sparschwein oSchweini = new Sparschwein();
        oSchweini.init("Schweini", 0.F);
        oSchweini.fuettern(12.30F);
        oSchweini.fuettern(3.60F);
        System.out.printf("%.2f Euro\n", oSchweini.schlachten());

        oSchweini.fuettern(10.00F);
        System.out.printf("%.2f Euro\n", oSchweini.schlachten());
    }
}
