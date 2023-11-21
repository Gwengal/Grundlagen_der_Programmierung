package Kapitel_06;

public class UebungMehrDimArrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int iCount = 0;
        int[][] iA = new int[10][];

        for (int i = 0; i < iA.length; i++) {
            // Anlegen der Ebenen des Arrays
            iA[i] = new int[i+1];
            for (int j = 0; j < iA[i].length; j++) {
                iCount++;
                iA[i][j] = iCount;
                System.out.print("|" + iA[i][j]);
            }
            System.out.println("|");
        }
    }
}
