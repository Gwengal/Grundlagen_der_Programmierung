package Uebungen.Uebung_9;

// import java.util.Scanner;

public class AmpelSchaltung {
    public static void main(String[] args){
        // Scanner oScanner = new Scanner(System.in);
        Ampel oAmpel = new Ampel(null);
        while (true) {
            System.out.println(oAmpel);
            oAmpel.schalte();
            
            // oScanner.nextLine();
        }
    }
}
