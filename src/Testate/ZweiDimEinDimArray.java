package Testate;

public class ZweiDimEinDimArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        int[] aNumb = null;
        int[][] aTwoDim = { { 2, 4, 5, 6, 1 }, { 4, 7, 1, 8 }, { 4, 4 }, { 7, 9, 22, 5 }, { 111 }, { 43 } };

        // --| Ausgabe zweiDim. Array |--
        ZweiDimEinDimArray.print(aTwoDim);
        // --| einDim. Arrays aus zweiDim. Array generieren |--
        aNumb = ZweiDimEinDimArray.genArray(aTwoDim);
        // --| Array sortieren |--
        ZweiDimEinDimArray.sort(aNumb);
        // --| Ausgabe einDim. Array |--
        ZweiDimEinDimArray.print(aNumb);

    }

    /**
     * einDim. Array aufsteigend sortieren
     * 
     * @param aNumb
     */
    private static void sort(int[] aNumb) {
        // --| Deklaration |--
        boolean bRun = true;
        int iRemind;

        // --| BubbleSort ausführen |--
        for (int i = 0; i < aNumb.length && bRun == true; i++) {
            bRun = false;

            for (int j = 0; j < aNumb.length - 1; j++) {
                if (aNumb[j] > aNumb[j + 1]) {
                    iRemind = aNumb[j + 1];
                    aNumb[j + 1] = aNumb[j];
                    aNumb[j] = iRemind;
                    bRun = true;
                }
            }
        }

    }

    /**
     * einDim. Array aus zweiDim. Array erzeugen
     * 
     * @param aTwoDim
     * @return
     */
    private static int[] genArray(int[][] aTwoDim) {
        // --| Deklaration |--
        int iLength = 0,
                iCount = 0;
        int[] aNumb = null;

        // --| einDim. Array erzeugen |--
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < aTwoDim.length; j++) {
                if (i == 0) {
                    iLength += aTwoDim[j].length;
                    continue;
                }

                for (int k = 0; k < aTwoDim[j].length; k++) {
                    aNumb[iCount] = aTwoDim[j][k];
                    iCount++;
                }
            }

            if (i == 0) {
                aNumb = new int[iLength];
            }
        }

        return aNumb;
    }

    /**
     * Ausgabe eines zweiDim. Arrays
     * 
     * @param aTwoDim
     */
    private static void print(int[][] aTwoDim) {
        System.out.println("Ausgabe des zweiDim. Arrays mit " + aTwoDim.length + " Werten: ");

        for (int i = 0; i < aTwoDim.length; i++) {
            ZweiDimEinDimArray.print(aTwoDim[i]);
        }

        System.out.println();
    }

    /**
     * Ausgabe eines eindDim. Arrays
     * 
     * @param aNumb
     */
    private static void print(int[] aNumb) {
        System.out.print("Ausgabe des Arrays mit " + aNumb.length + " Werten: ");

        for (int i = 0; i < aNumb.length; i++) {
            System.out.print(aNumb[i] + " ");
        }

        System.out.println();
    }

}
