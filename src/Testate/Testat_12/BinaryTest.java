package Testate.Testat_12;

import java.util.regex.Pattern;

public class BinaryTest {
    public static void main(String[] args) {
        double dDecTest = 107.875;
        String sBinaryTest = "1010.  0010.1111,1111.  0011";

        System.out.printf("Dezimalzahl: %f\tDualzahl: %s\n", dDecTest, Binary.toBinary(dDecTest));
        try {
            System.out.printf("Dualzahl: %s\tDezimalzahl: %f\n", sBinaryTest, Binary.toDecimal(sBinaryTest));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Binary {
    // Attribute
    /*
     * - []: Zeichenklasse - Gibt an welche Zeichen in der Klasse akzeptiert werden
     * - [01 .]*: Beliebige Anzahl von '0', '1', ' ', '.'
     * - ,?: Optionales ','
     * - [01 .]*: Beliebige Anzahl von '0', '1', ' ', '.'
     */
    private static String _sRegex = "[01 .]*,?[01 .]*";
    private static Pattern _oPat = Pattern.compile(Binary._sRegex);

    /**
     * Dezimalzahl wird in eine Dualzahl umgewandelt
     * 
     * @param i
     * @return
     */
    public static String toBinary(double d) {
        // --| Deklaration |--
        int iPreDec = (int) d;
        String sCalc = "", sBinary = "";

        // Vorkommastellen abschneiden
        d -= iPreDec;

        // Dezimal zu Dualzahl (falsche Reihenfolge)
        while (iPreDec > 0) {
            sCalc = String.format("%s%d", sCalc, (iPreDec % 2));
            iPreDec /= 2;
        }

        // Dualzahl (richtige Reihenfolge)
        for (int j = (sCalc.length() - 1); j >= 0; j--) {
            sBinary = String.format("%s%s", sBinary, sCalc.charAt(j));
        }

        // Sollten Nachkommastellen vorhanden sein, wird dem String ein Komma
        // hinzugefügt
        sBinary = (d > 0 ? String.format("%s,", sBinary) : sBinary);

        // Nachkommastellen anhängen
        while (d > 0) {
            d *= 2;
            iPreDec = (int) d;
            d -= iPreDec;

            sBinary = String.format("%s%d", sBinary, iPreDec);
        }

        return sBinary;
    }

    /**
     * Dualzahl wird in eine Dezimalzahl umgewandelt
     * 
     * @param s
     * @return
     */
    public static double toDecimal(String s) throws Exception {
        // --| Deklaration |--
        int iCount = 1;
        double dPreDec = 0, dDec = 0, dCount = 0.5;
        String[] aDual;

        /*
         * Im String sind Zeichen enthalten, die nicht vorkommen dürfen!
         * Logik abbrechen und Fehler schmeißen
         */
        if (!Binary._oPat.matcher(s).matches()) {
            throw new Exception(String.format("ERROR:\nUnerlaubte Zeichen in [%s]! \nErlaubt sind: [%s]", s, "10 .,"));
        }

        // Punkte im String löschen
        s = s.replace(".", "");
        // Leerzeichen im String löschen
        s = s.replace(" ", "");

        // Aufteilen in Vorkomma- und Nachkommastellen
        aDual = s.split(",");

        // Vorkommastellen: Dualzahl zu Dezimal
        for (int i = (aDual[0].length() - 1); i >= 0; i--) {
            dPreDec += iCount * Character.getNumericValue(aDual[0].charAt(i));
            iCount *= 2;
        }

        // Nachkommastellen: Dualzahl zu Dezimal
        if (aDual.length > 1) {
            for (int i = 0; i < aDual[1].length(); i++) {
                dDec += dCount * Character.getNumericValue(aDual[1].charAt(i));
                dCount /= 2;
            }
        }

        return dPreDec + dDec;
    }
}
