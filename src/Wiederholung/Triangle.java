package Wiederholung;

public class Triangle {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Triangle.buildTriangle(7));
    }

    /**
     * @param rows
     * @return
     */
    private static int buildTriangle(int iRows){
        if (iRows == 0) {
            return 0;
        }

        return iRows + Triangle.buildTriangle(iRows-1);
    }
    
}
