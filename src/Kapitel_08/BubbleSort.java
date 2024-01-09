package Kapitel_08;

public class BubbleSort {
    public static void sort(Sortierbar[] aSort){
        boolean bSort = true;
        Sortierbar oBuffer;

        while (bSort) {
            bSort = false;

            for (int i = 1; i < aSort.length; i++) {
                if (aSort[i-1].istGroesser(aSort[i]) > 0) {
                    oBuffer = aSort[i-1];
                    aSort[i-1] = aSort[i];
                    aSort[i] = oBuffer;

                    bSort = true;
                }
            }
        }
    }    
}
