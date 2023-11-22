package Kapitel_06;

import java.util.Arrays;

public class MaxIndex {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int iMax = 0;
        Integer[] aInt = { -2, 5, 0, -7, 13, 6, 2, 2 };

        for (int i = 0; i < aInt.length; i++) {
            if (aInt[i] > iMax) {
                iMax = aInt[i];
            }
        }

        // get index for max
        System.out.println(Arrays.asList(aInt).indexOf(iMax));

        System.out.println("Maxwert: " + iMax);
    }
}
