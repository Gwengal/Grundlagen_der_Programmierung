package Testate;

public class NewArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        NewArray.printArray(NewArray.genArray(1, 10));
        NewArray.printArray(NewArray.genArray(100, 107));
        NewArray.printArray(NewArray.genArray(99, 110));
        NewArray.printArray(NewArray.genArray(1, 1));
        NewArray.printArray(NewArray.genArray(3, 4));
    }

    /**
     * @param iStart
     * @param iEnd
     * @return
     */
    private static int[] genArray(int iStart, int iEnd) {
        // --| Deklaration |--
        int[] aNumbers = new int[(iEnd - iStart)];

        // Array mit Werten füllen
        for (int i = 0; i < aNumbers.length; i++) {
            aNumbers[i] = (iStart + i);
        }

        return aNumbers;
    }

    /**
     * Ausgabe des Arrays
     * 
     * @param aNumbers
     */
    private static void printArray(int[] aNumbers) {

        System.out.print("Zahlenarray mit " + aNumbers.length + " Werten: ");
        
        for (int i = 0; i < aNumbers.length; i++) {
            System.out.print(aNumbers[i] + " ");
        }

        System.out.println();
    }
}
