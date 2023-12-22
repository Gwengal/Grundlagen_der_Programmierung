package Uebungen.Uebung_1;

public class Tausche {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println("Vor dem Tausch: ");
        System.out.printf("a = %d \nb = %d \n", a, b);

        // Beginn Tausch
        int iBuffer = a;
        a = b;
        b = iBuffer;
        // Ende Tausch

        System.out.println("Nach dem Tausch: ");
        System.out.printf("a = %d \nb = %d \n", a, b);
    }
}
