package Uebungen.Uebung_4;

public class Weihnachtsbaum {
    public static void main(String[] args) {
        int iCenter = 9;
        int iStart = iCenter;
        int iEnd, iLength;

        if (iCenter % 2 != 0) {
            iEnd = iCenter;
            iLength = iCenter * 2 - 1;            
        }else{
            iEnd = iCenter + 1;
            iLength = iCenter * 2;
        }

        for (int i = 0; i < iCenter; i++) {
            Weihnachtsbaum.printKette('a', iStart, iEnd, iLength);
            iStart -= 1;
            iEnd += 1;           
        }
    }

    /**
     * Terminalausgabe mit übergebenem Zeichen bilden
     * 
     * @param cZeichen
     * @param iStart
     * @param iEnd
     * @param iLaenge
     */
    private static void printKette(char cZeichen, int iStart, int iEnd, int iLaenge){
        iStart --;
        for (int i = 0; i < iLaenge; i++) {
            if (i >= iStart) {
                System.out.print(cZeichen);
                iStart++;
            }else{
                System.out.print("_");
            }

            if (iStart == iEnd) {
                break;
            }
        }
        System.out.println();
    }
}
