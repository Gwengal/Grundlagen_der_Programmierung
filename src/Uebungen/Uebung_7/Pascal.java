package Uebungen.Uebung_7;

public class Pascal {
    public static void main(String[] args) {
        int iCount = 0;
        int[][] aPD = new int[6][];

        for (int i = 0; i < aPD.length; i++) {
            iCount = 0;
            aPD[i] = new int[i + 1];

            for (int j = 0; j < aPD[i].length; j++) {
                // Bei der ersten und letzten Array-Variable
                // wird immer der Wert 1 vergeben
                if (j == 0 || (j + 1) == aPD[i].length) {
                    aPD[i][j] = 1;
                } else {
                    aPD[i][j] = aPD[i - 1][iCount] + aPD[i - 1][++iCount];
                }

                System.out.printf("%d ", aPD[i][j]);
            }
            System.out.println();
        }
    }
}
