package Testate;

public class Spiegelarray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| declaration |--
        int[] aNumSeq1 = {3, 1, 3, 1, 3};
        int[] aNumSeq2 = {3, 1, 4, 4, 1, 3};
        int[] aNumSeq3 = {3, 1, 3, 3};
        int[] aNumSeq4 = {3, 4, 3, 3, 4};

        // --| check if the sequence of numbers is mirrorable |--
        Spiegelarray.mirrNumSeq(aNumSeq1);
        Spiegelarray.mirrNumSeq(aNumSeq2);
        Spiegelarray.mirrNumSeq(aNumSeq3);
        Spiegelarray.mirrNumSeq(aNumSeq4);
    }

    /**
     * Check if the sequence of numbers is mirrorable
     * 
     * @param aNumSeq
     */
    private static void mirrNumSeq(int[] aNumSeq) {
        // --| declaration |--
        String sSeqNum = "Zahlenfolge: ";

        // save number sequence for output message
        for (int i = 0; i < aNumSeq.length; i++) {
            sSeqNum = sSeqNum + aNumSeq[i] + " ";
        }

        // --| output if number sequence is mirrable |--
        System.out.print("\n" + sSeqNum + "--> ");
        for (int i = 0; i < (aNumSeq.length / 2); i++) {
            if (aNumSeq[i] != aNumSeq[(aNumSeq.length - i - 1)]) {
                System.out.print("Kein Spiegel-Array.");
                return;
            }
        }
        System.out.print("Array lässt sich spiegeln.");
    }
}
