package Uebungen.Uebung_7;

public class ArrayInArray {
    public static void main(String[] args){
        int[] aInner = {1, 2, 4, 6};
        int[] aInner1 = {1, 2, 4, 6};
        int[] aInner2 = {1, 2, 4, 4, 6};
        int[] aInner3 = {2, 2, 4, 4, 6, 6};
        int[] aInner4 = {2, 2, 2, 2, 2};
        int[] aInner5 = {2, 2, 2, 2, 2};
        int[] aInner6 = {2, 2, 2, 2, 4};
        int[] aInner7 = {1, 2, 3};
        int[] aInner8 = {1, 2, 3};
        int[] aInner9 = {1, 2, 3};

        int[] aOuter = {2, 4};
        int[] aOuter1 = {2, 3, 4};
        int[] aOuter2 = {2, 4};
        int[] aOuter3 = {2, 4};
        int[] aOuter4 = {2, 2};
        int[] aOuter5 = {2, 4};
        int[] aOuter6 = {2, 4};
        int[] aOuter7 = {2};
        int[] aOuter8 = {-1};
        int[] aOuter9 = {};

        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter, aInner), ArrayInArray.linearIn(aOuter, aInner));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter1, aInner1), ArrayInArray.linearIn(aOuter1, aInner1));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter2, aInner2), ArrayInArray.linearIn(aOuter2, aInner2));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter3, aInner3), ArrayInArray.linearIn(aOuter3, aInner3));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter4, aInner4), ArrayInArray.linearIn(aOuter4, aInner4));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter5, aInner5), ArrayInArray.linearIn(aOuter5, aInner5));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter6, aInner6), ArrayInArray.linearIn(aOuter6, aInner6));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter7, aInner7), ArrayInArray.linearIn(aOuter7, aInner7));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter8, aInner8), ArrayInArray.linearIn(aOuter8, aInner8));
        System.out.printf("%s --> %s\n", ArrayInArray.print(aOuter9, aInner9), ArrayInArray.linearIn(aOuter9, aInner9));
    }

    private static String print(int[] aOuter, int[] aInner){
        String sOutput = "([";
        for (int i = 0; i < aInner.length; i++) {
            sOutput = String.format("%s%d%s", sOutput, aInner[i], ((i+1) == aInner.length ? "" : ", "));
        }
        sOutput = String.format("%s], [", sOutput);

        for (int i = 0; i < aOuter.length; i++) {
            sOutput = String.format("%s%d%s", sOutput, aOuter[i], ((i+1) == aOuter.length ? "" : ", "));
        }
        sOutput = String.format("%s])", sOutput);

        return sOutput;
    }

    private static boolean linearIn(int[] aOuter, int[] aInner){
        boolean bLin = (aOuter.length == 0 ? true : false);
        
        for (int i = 0; i < aInner.length; i++) {
            for (int j = 0; j < aOuter.length; j++) {
                if (j == 0 && aOuter[j] != aInner[i]) {
                    break;
                }

                if ((i+j) >= aInner.length || aOuter[j] != aInner[i+j]) {
                    bLin = false;
                    break;
                }

                bLin = true;
            }

            if (bLin) {
                break;
            }
        }

        return bLin;
    }
}
