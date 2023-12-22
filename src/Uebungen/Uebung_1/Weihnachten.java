package Uebungen.Uebung_1;

public class Weihnachten {
    public static void main(String[] args) {
        String[] aTree = new String[6];

        // Aufgabe a)
        for (int i = 0; i < aTree.length; i++) {
            switch (i) {
                case 5:
                    aTree[i] = "   / \\   ";
                    break;
                case 4:
                    aTree[i] = "***o***o*";
                    break;
                case 3:
                    aTree[i] = " *o*o*** ";
                    break;
                case 2:
                    aTree[i] = "  ***o*  ";
                    break;
                case 1:
                    aTree[i] = "   *o*   ";
                    break;
                case 0:
                    aTree[i] = "    *    ";
                    break;
            }       
            
            System.out.println(aTree[i]);
        }

        // Aufgabe b)
        for (int i = 0; i < aTree.length; i++) {
            System.out.println("\t" + aTree[i]);
        }
    }
}
