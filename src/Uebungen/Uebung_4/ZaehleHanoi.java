package Uebungen.Uebung_4;

public class ZaehleHanoi {
    public static void main(String[] args) {
        int scheibenAnzahl = 3; // Anzahl der Scheiben
        char startStab = 'A';   // Ausgangs-Stab
        char zielStab = 'C';    // Ziel-Stab
        char hilfsStab = 'B';   // Hilfs-Stab

        System.out.println(ZaehleHanoi.turmeVonHanoi(scheibenAnzahl, startStab, zielStab, hilfsStab));
    }

    public static int turmeVonHanoi(int n, char startStab, char zielStab, char hilfsStab) {
        int iCounter = 0;

        if (n == 1) {
            System.out.printf("Verschiebe %d von %s nach %s\n", n, startStab, zielStab);
            return 1;
        }else{
            iCounter += ZaehleHanoi.turmeVonHanoi((n-1), startStab, hilfsStab, zielStab);
            System.out.printf("Verschiebe %d von %s nach %s\n", n, startStab, zielStab);
            iCounter++;
            iCounter += ZaehleHanoi.turmeVonHanoi((n-1), hilfsStab, zielStab, startStab);
        }

        return iCounter;


    }
}
