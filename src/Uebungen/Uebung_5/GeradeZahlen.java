package Uebungen.Uebung_5;

public class GeradeZahlen {
    public static void main(String[] args) {
        int[] aNumb1 = {2, 1, 2, 3, 4};
        int[] aNumb2 = {2, 2, 0};
        int[] aNumb3 = {1, 3, 5};

        GeradeZahlen.checkEvenNumb(aNumb1);     
        GeradeZahlen.checkEvenNumb(aNumb2);
        GeradeZahlen.checkEvenNumb(aNumb3);
    }

    private static void checkEvenNumb(int[] aNumb){
        int iCounter = 0;
        String sOutput = "";
        for (int i = 0; i < aNumb.length; i++) {
            sOutput = String.format("%s%d%s", sOutput, aNumb[i], ((i+1) == aNumb.length ? "" : ", "));
            iCounter = (aNumb[i] % 2 == 0 ? iCounter+1 : iCounter);
        }

        System.out.printf("[%s] --> %d\n", sOutput, iCounter);
    }
}
