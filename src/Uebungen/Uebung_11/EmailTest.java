package Uebungen.Uebung_11;

import java.util.Scanner;

public class EmailTest {
    public static void main(String[] args) {
        try {
            EmailTest.checkMail(EmailTest.enterEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * E-Mail erfassen
     * 
     * @return
     */
    private static String enterEmail() {
        String sEmail = "";
        Scanner oScan = new Scanner(System.in);

        System.out.print("Bitte eine gültige E-Mailadresse der Hochschule Hof eingeben: ");
        sEmail = oScan.nextLine();
        oScan.close();

        return sEmail;
    }

    /**
     * Email überprüfen und ausgeben
     * 
     * @param sEmail
     * @throws Exception
     */
    private static void checkMail(String sEmail) throws Exception {
        String sHochschuleHof = "hof-university.de";
        String[] aEmailParts;

        aEmailParts = sEmail.split("@");

        // Kein @ oder zu viele @ vorhanden --> Keine valide Mail
        if (aEmailParts.length < 2 || aEmailParts.length > 2) {
            throw new Exception(String.format("Eingabe %s ist keine gültige Email!", sEmail));
        }

        // Email ist nicht von der Domain der Hochschule Hof
        if (aEmailParts[1].compareTo(sHochschuleHof) != 0) {
            throw new Exception(String.format("Email %s ist nicht von der Domain %s", sEmail, sHochschuleHof));
        }

        // Ausgabe Vor- und Nachname
        if (aEmailParts[0].contains(".")) {
            String[] sVNName = aEmailParts[0].split("\\.");
            System.out.printf("Vorname:\t%s\nNachname:\t%s\n", sVNName[0], sVNName[1]);
        }
        // Ausgabe Name
        else{
            System.out.printf("Name:\t%s\n", aEmailParts[0]);
        }

        // Ausgabe Endung der Domain
        System.out.printf("Endung:\t%s\n", aEmailParts[1]);
    }
}
