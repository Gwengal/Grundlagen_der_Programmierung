package Uebungen.Uebung_3;

public class Fahrenheit {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            float fCelsius = 5F/9 * (i - 32F);
            System.out.printf("- %d °F entspricht %.2f °C \n", i, fCelsius);
        }
    }
}
