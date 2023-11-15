package Testate;

public class Summe8 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| declaration |--
        int[] aNumSeq1 = {2, 3, 2, 2, 4, 2};
        int[] aNumSeq2 = {2, 3, 2, 2, 4, 2, 2};
        int[] aNumSeq3 = {1, 2, 3, 4};

        // --| sum all twos in the number sequence |--
        Summe8.calc(aNumSeq1);
        Summe8.calc(aNumSeq2);
        Summe8.calc(aNumSeq3);
    }

    /**
     * Sum all twos in the number sequence
     * 
     * @param aNumSeq1
     */
    private static void calc(int[] aNumSeq) {
        // --| declaration |--
        int iSumTwos = 0;
        String sSeqNum = "Zahlenfolge: ";

        // sum all twos in the sequence
        for (int i = 0; i < aNumSeq.length; i++) {
            iSumTwos = (aNumSeq[i] == 2 ? iSumTwos + aNumSeq[i] : iSumTwos);
            sSeqNum = sSeqNum + aNumSeq[i] + " ";
        }

        // --| output if number is <, >, = 8 |--
        System.out.print("\n" + sSeqNum + "--> ");
        if (iSumTwos < 8) {
            System.out.print("Summer aller 2er ist kleiner als 8.");
        }else if(iSumTwos == 8){
            System.out.print("Summer aller 2er ist 8.");
        }else if(iSumTwos > 8){
            System.out.print("Summer aller 2er ist größer als 8.");
        }
    }
}
