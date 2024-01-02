package Uebungen.Uebung_7;

public class FakultArray {
    public static void main(String[] args){
        System.out.printf("Tabelle zur Fakukltät %d!\n", 8);
        long[][] aNum = FakultArray.fakult(8);
        FakultArray.print(aNum);
    }

    private static void print(long[][] aNum) {
        for (int i = 0; i < aNum.length; i++) {
            System.out.print("|");
            for (int j = 0; j < aNum[i].length; j++) {
                System.out.printf("%10d|", aNum[i][j]);
            }
            System.out.println();
        }
    }

    private static long[][] fakult(int i) {
        long[][] aNum = new long[2][i];

        for (int j = 0; j < aNum.length; j++) {
            for (int k = 0; k < aNum[j].length; k++) {
                if (j == 0) {
                    aNum[j][k] = (k+1);
                }else{
                    if (k == 0) {
                        aNum[j][k] = 1 * (k+1);
                    }else{
                        aNum[j][k] = aNum[j-1][k] * aNum[j][k-1];
                    }
                }
            }          
        }

        return aNum;
    }
}
