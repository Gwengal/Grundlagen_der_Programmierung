package Uebungen.Uebung_3;

public class Tabelle {
    public static void main(String[] args) {
        System.out.println("Das große Einmaleins: ");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d: \n---\n", i);

            for (int j = 1; j <= 20; j++) {
                System.out.printf("- %d x %d = %d\n", i, j, (i * j));    
            }
            System.out.println("=============\n");
        }
    }
}
