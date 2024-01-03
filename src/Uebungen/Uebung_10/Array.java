package Uebungen.Uebung_10;

public class Array {
    public static void aufraumen(Komprimierbar[] aKomp) {
        int iCount = 0;

        for (int i = 0; i < aKomp.length; i++) {
            if (aKomp[i] == null) {
                continue;
            }

            if (aKomp[i].loeschen()) {
                aKomp[i] = null;
            } else {
                aKomp[iCount++] = aKomp[i];
                aKomp[i] = null;
            }
        }
    }

    public static void print(Komprimierbar[] aKomp) {
        for (Komprimierbar oKomp : aKomp) {
            if (oKomp == null) {
                System.out.println("frei");
                continue;
            }
            oKomp.print();
        }
    }

    public static void sort(Komprimierbar[] aKomp) {
        boolean bSort = true;
        Komprimierbar oBuffer;

        while (bSort) {
            bSort = false;

            for (int i = 1; i < aKomp.length; i++) {
                if (aKomp[i-1] != null && aKomp[i] != null && aKomp[i-1].compare(aKomp[i].get())){
                    oBuffer = aKomp[i];
                    aKomp[i] = aKomp[i-1];
                    aKomp[i-1] = oBuffer;

                    bSort = true;
                }
            }
        }
    }
}
