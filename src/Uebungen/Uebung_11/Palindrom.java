package Uebungen.Uebung_11;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Palindrom.checkPalindrom(Palindrom.getInput());
    }

    private static String getInput() {
        String sInput;
        Scanner oScan = new Scanner(System.in);

        System.out.print("Erfassen Sie einen Text: ");
        sInput = oScan.nextLine();
        oScan.close();
        sInput = sInput.replace("?", "");
        sInput = sInput.replace("!", "");
        sInput = sInput.replace(".", "");
        sInput = sInput.replace(",", "");

        return sInput;
    }

    private static void checkPalindrom(String sText) {
        boolean bPal = true;
        String sTextChange = sText.toLowerCase();
        sTextChange = sTextChange.replace(" ", "");

        for (int j = 0; j < (sTextChange.length() / 2); j++) {
            if (sTextChange.charAt(j) != sTextChange.charAt(((sTextChange.length() - 1) - j))) {
                bPal = false;
                break;
            }
        }

        System.out.printf("Text [%s] ist %s Palindrom.\n", sText, (bPal ? "ein" : "kein"));
    }
}
