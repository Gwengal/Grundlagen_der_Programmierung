package Uebungen.Uebung_4;

public class Fakult {
    public static void main(String[] args) {
        double dZahl1 = Fakult.fakult(49, (49-6));
        double dZahl2 = Fakult.fakult(6, 0); 
        double dResult = dZahl1 / dZahl2;

        System.out.println(dResult);
    }

    /**
     * Fakultät Rekursiv berechnen
     * 
     * @param i
     * @param iEnd
     * @return
     */
    private static double fakult(int i, int iEnd){
        if (i == iEnd) {
            return 1;
        }

        return i * Fakult.fakult(i - 1, iEnd);
    }
}
