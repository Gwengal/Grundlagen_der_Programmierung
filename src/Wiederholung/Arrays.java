package Wiederholung;

public class Arrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] aInt = {1, 2, 3, 4, 5};
        Arrays.printArray(aInt);
    }

    /**
     * @param aInt
     */
    private static void printArray(int[] aInt){
        for (int i = 0; i < aInt.length; i++) {
            System.out.println(aInt[i] + " ");
        }
    }
}
