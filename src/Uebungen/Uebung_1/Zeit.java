package Uebungen.Uebung_1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Zeit {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        String sInput;
        String[] aTime;
        Scanner oScanner = new Scanner(System.in);
        LocalDateTime oStart, oEnd;

        // LocalDateTime-Instanz für [Jetztiges Datum][00:00] erzeugen 
        oStart = LocalDateTime.of(LocalDate.now(), LocalTime.of(0, 0));
        
        // Uhrzeit aus Terminal auslesen
        System.out.print("Bitte die Uhrzeit im folgenden Format erfassen [HH:MM]: ");
        sInput = oScanner.nextLine();
        oScanner.close();

        // Eingabe aufsplitten bei dem Zeichen ":"
        aTime = sInput.split(":");

        // LocalDateTime-Instanz für [Jetztiges Datum][Erfasste Uhrzeit vom User]
        oEnd = LocalDateTime.of(LocalDate.now(), LocalTime.of(Integer.parseInt(aTime[0]), Integer.parseInt(aTime[1])));
        
        Duration oDur = Duration.between(oStart, oEnd);
        System.out.printf("Seit Mitternacht sind %d min vergangen.\n", (oDur.getSeconds() / 60));
    }
}
