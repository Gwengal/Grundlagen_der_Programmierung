package Uebungen.Uebung_5;

public class Summe8 {
    public static void main(String[] args) {
        int[] aNumb1 = {2, 3, 2, 2, 4, 2};
        int[] aNumb2 = {2, 3, 2, 2, 4, 2, 2};
        int[] aNumb3 = {1, 2, 3, 4};

        Summe8.checkTwoEight(aNumb1);
        Summe8.checkTwoEight(aNumb2);
        Summe8.checkTwoEight(aNumb3);
    }

    private static void checkTwoEight(int[] aNumb){
        int iSum = 0;
        String sOutput = "";

        for (int i = 0; i < aNumb.length; i++) {
            sOutput = String.format("%s%d%s", sOutput, aNumb[i], ((i+1) == aNumb.length ? "" : ", "));
            iSum = (aNumb[i] == 2 ? (iSum + aNumb[i]) : iSum);
        }

        System.out.printf("[%s] --> %s(%d)\n", sOutput, (iSum >= 8 ? "Summe aller 2er ist größer/gleich 8" : "Summe ist kleiner als 8"), iSum);
    }
}
