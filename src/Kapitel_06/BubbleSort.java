package Kapitel_06;

public class BubbleSort {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        int[] iNumbers = { 100, 5, 1, 3, 17, 22, 2, 4, 17, 2, 1 };

        // --| Array ausgeben |--
        BubbleSort.output("(Unsortiert)", iNumbers);

        // --| BubbleSort ausführen - Aufsteigend |--
        BubbleSort.sort(true, iNumbers);

        // --| Array ausgeben |--
        BubbleSort.output("(Aufsteigend)", iNumbers);

        // --| BubbleSort ausführen - Absteigend |--
        BubbleSort.sort(false, iNumbers);

        // --| Array ausgeben |--
        BubbleSort.output("(Absteigend)", iNumbers);
    }

    /**
     * BubbleSort ausführen
     * 
     * @param iNumbers
     */
    public static void sort(boolean bAsc, int[] iNumbers) {
        // --| Deklaration |--
        int iSwitcher;

        // --| Sortierung ausführen |--
        for (int i = 0; i < iNumbers.length; i++) {
            for (int j = (i + 1); j < iNumbers.length; j++) {
                // Aufsteigend sortieren
                if (bAsc) {
                    if (iNumbers[i] > iNumbers[j]) {
                        iSwitcher = iNumbers[i];
                        iNumbers[i] = iNumbers[j];
                        iNumbers[j] = iSwitcher;
                    }
                } 
                // Absteigend sortieren
                else {
                    if (iNumbers[i] < iNumbers[j]) {
                        iSwitcher = iNumbers[i];
                        iNumbers[i] = iNumbers[j];
                        iNumbers[j] = iSwitcher;
                    }
                }
            }
        }
    }

    /**
     * Ausgabe des Arrays
     * 
     * @param iNumbers
     */
    private static void output(String sExcSort, int[] iNumbers) {
        System.out.print("Zahlenfolge " + sExcSort + ": ");

        for (int i : iNumbers) {
            System.out.print(i + " ");
        }

        System.out.print("\n");
    }
}
