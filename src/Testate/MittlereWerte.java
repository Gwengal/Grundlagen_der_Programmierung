package Testate;

public class MittlereWerte {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        int[][] aTwoDim = {{1, 3, 4, 5, 1}, {2, 2, 3, 3}, {9}, {5, 6}, {1, 2, 17, 2, 1, 17, 3}};

        /*
         * 1. Mittlere Werte des zweiDim. Array ermitteln
         * 2. Ausgabe des Arrays mit den mittleren Werten
         */
        MittlereWerte.outputArray(MittlereWerte.getAvgValue(aTwoDim));
    }

    /**
     * Ausgabe eines eindim. Arrays
     * 
     * @param avgValue
     */
    private static void outputArray(int[] aAvgValue) {

        System.out.print("Zahlenarray mit " + aAvgValue.length + " Werten: ");
        
        for (int i = 0; i < aAvgValue.length; i++) {
            System.out.print(aAvgValue[i] + " ");
        }
    }

    /**
     * Methode ermittelt aus dem übergebenen
     * zweiDim. Array jeweils den mittleren Wert 
     * und speichert diesen in einem einDim. Array
     * 
     * @param aTwoDim
     * @return
     */
    private static int[] getAvgValue(int[][] aTwoDim) {
        // --| Deklaration |--
        int iLength;
        int[] aAvgValue = new int[aTwoDim.length];

        /*
         * Länge des Arrays = Gerade
         * 1. Arraylänge durch 2 dividieren
         * 2. Vom Ergebnis 1 abziehen
         * Länge des Arrays = Ungerade
         * 1. Arraylänge durch 2 dividieren
         */
        for (int i = 0; i < aTwoDim.length; i++) {
            iLength = aTwoDim[i].length / 2;

            if (aTwoDim[i].length % 2 == 0) {
                iLength -= 1;                
            }

            aAvgValue[i] = aTwoDim[i][iLength];            
        }

        return aAvgValue;
    }
}
