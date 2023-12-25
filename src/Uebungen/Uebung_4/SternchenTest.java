package Uebungen.Uebung_4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class SternchenTest {
    public static void main(String[] args) {
        // --| Deklaration |--
        String sInput;
        String[] aTime;
        Scanner oScanner = new Scanner(System.in);
        LocalDateTime oStart, oEnd;

        // LocalDateTime-Instanz für [Jetztiges Datum][00:00] erzeugen
        oStart = LocalDateTime.of(LocalDate.now(), LocalTime.of(0, 0));

        SternchenTest.printStars(30);
        // Uhrzeit aus Terminal auslesen
        System.out.print("Bitte die Uhrzeit im folgenden Format erfassen [HH:MM]: ");
        sInput = oScanner.nextLine();
        oScanner.close();
        SternchenTest.printStars(30);

        // Eingabe aufsplitten bei dem Zeichen ":"
        aTime = sInput.split(":");

        // LocalDateTime-Instanz für [Jetztiges Datum][Erfasste Uhrzeit vom User]
        oEnd = LocalDateTime.of(LocalDate.now(), LocalTime.of(Integer.parseInt(aTime[0]), Integer.parseInt(aTime[1])));

        Duration oDur = Duration.between(oStart, oEnd);
        SternchenTest.printStars(30);
        System.out.printf("Seit Mitternacht sind %d min vergangen.\n", (oDur.getSeconds() / 60));
        SternchenTest.printStars(30);
    }

    /**
     * Sterne in der Konsole ausgeben
     * 
     * @param iNum
     */
    private static void printStars(int iNum){
        for (int i = 0; i < iNum; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
