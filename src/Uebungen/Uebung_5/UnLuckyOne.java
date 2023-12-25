package Uebungen.Uebung_5;

public class UnLuckyOne {
    public static void main(String[] args) {
        int[] aNumb1 = {1, 3, 4, 5};
        int[] aNumb2 = {2, 1, 3, 4, 5};
        int[] aNumb3 = {1, 1, 1};

        UnLuckyOne.checkULO(aNumb1);
        UnLuckyOne.checkULO(aNumb2);
        UnLuckyOne.checkULO(aNumb3);
    }

    private static void checkULO(int[] aNumb) {
        String sOutput = "",
                sMessage = "keine unglückliche 1 enthalten";

        for (int i = 0; i < aNumb.length; i++) {
            sOutput = String.format("%s%d%s", sOutput, aNumb[i], ((i + 1) == aNumb.length ? "" : ", "));
            if (i > 0 && aNumb[i - 1] == 1 && aNumb[i] == 3) {
                sMessage = "unglückliche 1 vorhanden";
            }
        }

        System.out.printf("[%s] --> %s\n", sOutput, sMessage);
    }
}
