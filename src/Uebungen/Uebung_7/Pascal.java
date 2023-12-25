package Uebungen.Uebung_7;

public class Pascal {
    public static void main(String[] args) {
        int iOne = 1;
        int[][] aPD = new int[6][];

        for (int i = 0; i < aPD.length; i++) {
            aPD[i] = new int[i + 1];
            for (int j = 0; j < aPD[i].length; j++) {

                if (j == 0) {
                    aPD[i][j] = iOne;
                } else {
                    if (aPD[i].length == (j + 1)) {
                        aPD[i][j] = iOne;
                        break;
                    }

                    for (int k = 1; k < aPD[i - 1].length; k++) {
                        aPD[i][j] = aPD[i - 1][k - 1] + aPD[i - 1][k];
                    }
                }
            }
        }
    }
}
