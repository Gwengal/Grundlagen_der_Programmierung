package Uebungen.Uebung_7;

public class Suche77 {
    public static void main(String[] args) {
        int[] iNum   = {1, 7, 7};
        int[] iNum2  = {1, 7, 1, 7};
        int[] iNum3  = {1, 7, 1, 1, 7};
        int[] iNum4  = {7, 7, 1, 1, 7};
        int[] iNum5  = {2, 7, 2, 2, 7, 2};
        int[] iNum6  = {2, 7, 2, 2, 7, 7};
        int[] iNum7  = {7, 2, 7, 2, 2, 7};
        int[] iNum8  = {7, 2, 6, 2, 2, 7};
        int[] iNum9  = {7, 7, 7};
        int[] iNum10 = {7, 1, 7};
        int[] iNum11 = {7, 1, 1};
        int[] iNum12 = {1, 2};
        int[] iNum13 = {1, 7};
        int[] iNum14 = {7};

        System.out.printf("%s --> %s\n", Suche77.print(iNum), Suche77.searchSeven(iNum));
        System.out.printf("%s --> %s\n", Suche77.print(iNum2), Suche77.searchSeven(iNum2));
        System.out.printf("%s --> %s\n", Suche77.print(iNum3), Suche77.searchSeven(iNum3));
        System.out.printf("%s --> %s\n", Suche77.print(iNum4), Suche77.searchSeven(iNum4));
        System.out.printf("%s --> %s\n", Suche77.print(iNum5), Suche77.searchSeven(iNum5));
        System.out.printf("%s --> %s\n", Suche77.print(iNum6), Suche77.searchSeven(iNum6));
        System.out.printf("%s --> %s\n", Suche77.print(iNum7), Suche77.searchSeven(iNum7));
        System.out.printf("%s --> %s\n", Suche77.print(iNum8), Suche77.searchSeven(iNum8));
        System.out.printf("%s --> %s\n", Suche77.print(iNum9), Suche77.searchSeven(iNum9));
        System.out.printf("%s --> %s\n", Suche77.print(iNum10), Suche77.searchSeven(iNum10));
        System.out.printf("%s --> %s\n", Suche77.print(iNum11), Suche77.searchSeven(iNum11));
        System.out.printf("%s --> %s\n", Suche77.print(iNum12), Suche77.searchSeven(iNum12));
        System.out.printf("%s --> %s\n", Suche77.print(iNum13), Suche77.searchSeven(iNum13));
        System.out.printf("%s --> %s\n", Suche77.print(iNum14), Suche77.searchSeven(iNum14));
    }

    private static String print(int[] iNum){
        String sOutput = "([";
        for (int i = 0; i < iNum.length; i++) {
            sOutput = String.format("%s%d%s", sOutput, iNum[i], ((i+1) == iNum.length ? "" : ", "));
        }

        sOutput = String.format("%s)]", sOutput);
        return sOutput;
    }

    private static boolean searchSeven(int[] iNum) {
        int iSearch = 0;
        boolean bSearch = false,    
                bSeven = false;

        for (int i = 0; i < iNum.length; i++) {
            if (bSearch) {
                if (i - iSearch > 2) {
                    bSearch = false;
                } else if (iNum[i] == 7) {
                    bSeven = true;
                    break;
                }
            }

            if (iNum[i] == 7 && bSearch == false) {
                bSearch = true;
                iSearch = i;
            }
        }

        return bSeven;
    }
}
