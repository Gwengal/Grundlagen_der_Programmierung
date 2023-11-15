package Testate;

public class Shift {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| declaration |--
        int iShiftByNumber;
        int iNextNumber;
        int[] aShiftNumbers = {1, 3, 4, 5};

        // --| output before shift |--
        System.out.println("Ausgabe der Zahlen vor dem verschieben: ");
        for (int i = 0; i < aShiftNumbers.length; i++) {
            System.out.print(aShiftNumbers[i] + " ");
        }

        // --| shift the numbers by one position in the array |--
        iShiftByNumber = aShiftNumbers[0];
        for (int i = 0; i < aShiftNumbers.length; i++) {
            if ((i+1) == aShiftNumbers.length) {
                aShiftNumbers[0] = iShiftByNumber;
            }else{
                iNextNumber = aShiftNumbers[i+1];
                aShiftNumbers[i+1] = iShiftByNumber;
                iShiftByNumber = iNextNumber;
            }
        }

        // --| output after shift |--
        System.out.println("\nAusgabe der Zahlen nach dem verschieben: ");
        for (int i = 0; i < aShiftNumbers.length; i++) {
            System.out.print(aShiftNumbers[i] + " ");
        }
    }
    
}
