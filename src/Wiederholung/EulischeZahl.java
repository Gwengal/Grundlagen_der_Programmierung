package Wiederholung;

public class EulischeZahl {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        int iCount = 0;
        double dBefore = 0;
        double dE = 0;

        do {
            iCount++;
            dBefore = dE;
            dE += 1/EulischeZahl.fakultRek(iCount);
        } while ((dE-dBefore) > 0);

        System.out.println(dE);
        System.err.println(Math.E);
    }

    /**
     * @param iNumber
     * @return
     */
    private static double fakultIt(int iNumber) {
        double dFakult = 1;

        for (int i = 1; i <= iNumber; i++) {
            dFakult *= i;
        }

        return dFakult;
    }

    /**
     * @param iNumber
     * @return
     */
    private static double fakultRek(int iNumber) {
        if (iNumber == 1) {
            return 1;
        }

        return iNumber * EulischeZahl.fakultRek(iNumber - 1);
    }
}
