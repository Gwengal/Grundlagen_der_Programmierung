package Uebungen.Uebung_6;

public class Arrays {
    public static void main(String[] args) {
        int iLength = 0;
        int[] aNumb = new int[10];
        String sOutput = "";

        System.out.println("Inhalt des Arrays: ");
        for (int i = 0; i < 19; i++) {
            if (i % 2 == 0) {
                aNumb[iLength++] = i;
                sOutput = String.format("%s [%d]", sOutput, i);
            }
        }
        System.out.printf("%s \n\n\n", sOutput);
        sOutput = "";
        iLength = aNumb.length;

        System.out.println("Inhalt des Arrays: ");
        for (int i = 19; i > 0; i--) {
            if (i % 2 != 0) {
                aNumb[--iLength] = i;
                sOutput = String.format("%s [%d]", sOutput, i);
            }
        }
        System.out.printf("%s \n\n\n", sOutput);
    }
}
