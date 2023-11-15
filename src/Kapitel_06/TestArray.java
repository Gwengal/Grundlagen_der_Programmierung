package Kapitel_06;

public class TestArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[][] array = {{7,3,12,8}, {0,11,5,7}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }        
    }
    
}
