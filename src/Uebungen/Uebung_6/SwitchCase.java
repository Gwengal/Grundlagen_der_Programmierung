package Uebungen.Uebung_6;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int iDay;
        String sDay = "";
        Scanner oScanner = new Scanner(System.in);

        System.out.print("Erfassen Sie einen Tag (1-7): ");
        iDay = oScanner.nextInt();
        oScanner.close();

        switch (iDay) {
            case 1:
                sDay = "Montag";
                break;
            case 2:
                sDay = "Dienstag";
                break;
            case 3:
                sDay = "Mittwoch";
                break;
            case 4:
                sDay = "Donnerstag";
                break;
            case 5:
                sDay = "Freitag";
                break;
            case 6:
                sDay = "Samstag";
                break;
            case 7:
                sDay = "Sonntag";
                break;
        }

        System.out.printf("%d entspricht %s", iDay, sDay);
    }
}
