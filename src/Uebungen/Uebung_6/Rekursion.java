package Uebungen.Uebung_6;

public class Rekursion {
    public static void main(String[] args) {
        System.out.printf("%d --> %d\n", 12345, Rekursion.count(12345));
        System.out.printf("%d --> %d\n", 1, Rekursion.count(1));
        System.out.printf("%d --> %d\n", 2341111, Rekursion.count(2341111));
    }

    private static int count(int i){
        if (i == 0) {
            return 0;
        }

        return 1 + Rekursion.count(i / 10);
    }
}
