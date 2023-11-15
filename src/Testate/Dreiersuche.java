package Testate;

public class Dreiersuche {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| declaration |--
        int[] aNumbSeq1 = {3, 1, 3, 1, 3};
        int[] aNumbSeq2 = {3, 1, 3, 3};
        int[] aNumbSeq3 = {3, 4, 3, 3, 4};

        // --| check if number sequence is a "triplesearch" |--
        Dreiersuche.trioSearch(aNumbSeq1);
        Dreiersuche.trioSearch(aNumbSeq2);
        Dreiersuche.trioSearch(aNumbSeq3);
    }

    /**
     * Check if number sequence is a "triplesearch"
     * If the number 3 appears exactly 3 times in the number sequence 
     * and none of the 3s are consecutive
     * then the "triplesearch" is for this sequence true
     * 
     * @param aNumbSeq1
     */
    private static void trioSearch(int[] aNumbSeq) {
        // --| declaration |--
        int iCountThrees = 0;
        boolean bNSeqofThree = true;
        Integer iLastNumber = null;
        String sSeqNumb = "Zahlenfolge: ";

        /* If the number 3 appears exactly 3 times in the number sequence 
         * and none of the 3s are consecutive
         * then the "triplesearch" is for this sequence true
         */
        for (int i = 0; i < aNumbSeq.length; i++) {
            iCountThrees = (aNumbSeq[i] == 3 ? iCountThrees + 1 : iCountThrees);

            if (iLastNumber != null && iLastNumber == 3 && iLastNumber == aNumbSeq[i] && bNSeqofThree == true) {
                bNSeqofThree = false;
            }

            sSeqNumb = sSeqNumb + aNumbSeq[i] + " ";
            iLastNumber = aNumbSeq[i];
        }

        // --| output if number sequence is a "triple search" |--
        System.out.print("\n" + sSeqNumb + "--> ");
        if (bNSeqofThree == true && iCountThrees == 3) {
            System.out.print("Drei mal drei.");
        }else{
            System.out.print("Nix mit drei mal drei.");
        }
    }
}
