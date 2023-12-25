package Uebungen.Uebung_4;

public class Tabelle2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%2d: \n---\n", i);
            for (int j = 1; j <= 20; j++) {
                System.out.printf("%2d x %2d = %3d\n", j, i, (i*j));
            }
            System.out.println("=============");
        }
    }
}
