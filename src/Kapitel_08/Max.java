package Kapitel_08;

public class Max {
    public static int getMax(Groesse[] array) {
        int iMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[iMax].getGroesse() < array[i].getGroesse()) {
                iMax = i;
            }
        }

        // for (Groesse oGroesse : array) {
        // iMax = (iMax < oGroesse.getGroesse() ? oGroesse.getGroesse() : iMax);
        // }

        return iMax;
    }
}
