package Uebungen.Uebung_8;

public class Binary {
    /**
     * Dezimalzahl zu Binärzahl umwandeln
     * 
     * @param lNum
     * @return
     */
    public static String toBinary(long lNum){        
        String sCalc = "",
               sBinary = "";

        while (lNum > 0) {
            sCalc = String.format("%s%d", sCalc, (lNum % 2));
            lNum = lNum / 2;
        }

        for (int i = sCalc.length()-1; i >= 0; i--) {
            sBinary = String.format("%s%s", sBinary, sCalc.charAt(i));
        }

        return sBinary;
    }

    /**
     * Binärzahl zu Dezimalzahl umwandeln
     * 
     * @param sNum
     * @return
     */
    public static long toDecimal(String sNum){
        int iCount = 1;
        long lDec = 0;

        for (int i = sNum.length()-1; i >= 0; i--) {
            lDec += iCount * Character.getNumericValue(sNum.charAt(i));
            iCount *= 2;
        }

        return lDec;
    }
}
