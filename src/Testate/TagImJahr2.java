package Testate;

import java.util.Scanner;

public class TagImJahr2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| declaration |--
        // Jan[31], Feb[28/29], Mar[31], Apr[30], May[31], Jun[30], Jul[31], Aug[31],
        // Sep[30], Okt[31], Nov[30], Dez[31]
        int[] aDaysinMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] aDate;

        // --| get user input |--
        aDate = TagImJahr2.getInput(aDaysinMonth);

        // --| terminal output: Datum [date] ist der [dayinyear]. Tag im Jahr.
        System.out.println("Datum " + aDate[0] + "." + aDate[1] + "." + aDate[2] + " ist der "
                + TagImJahr2.tagImJahr(aDate[0], aDate[1], aDate[2]) + ". Tag im Jahr.");
    }

    /**
     * @param aDaysinMonth
     * @return
     */
    private static String[] getInput(int[] aDaysinMonth) {
        // --| declaration |--
        int iDay, iMonth;
        String sDate;
        String[] aDate = null;
        Scanner oScan = new Scanner(System.in);
        
        // --| get user input and validate |--
        while (true) {
            try {
                System.out.print("Erfassen Sie bitte ein Datum im Format dd.MM.yyyy: ");
                sDate = oScan.nextLine();

                aDate = sDate.split("\\.");

                // wrong input. Input was not a date
                if (aDate.length < 3 || aDate.length > 3) {
                    throw new Exception("Ihre Eingabe " + sDate + " ist kein Datum!");
                }

                // --| check if input year is leap year |--
                if (isLeapYear(Integer.parseInt(aDate[2]))){
                    aDaysinMonth[1] = 29;
                }
                
                // input days > days in month
                if (aDaysinMonth[(Integer.parseInt(aDate[1]) - 1)] < Integer.parseInt(aDate[0])) {
                    
                }

                oScan.close();
                break;
            } catch (Exception eError) {

            }
        }

        return aDate;
    }

    /**
     * Check if input year is a leap year
     * 
     * @param iYear
     * @return
     */
    private static boolean isLeapYear(int iYear){
        return (iYear % 4 == 0 && (iYear % 100 != 0 || iYear % 400 == 0) ? true : false );
    }

    /**
     * @param iTag
     * @param iMonat
     * @param iJahr
     * @return
     */
    private static int tagImJahr(int iTag, int iMonat, int iJahr) {

        return 0;
    }
}
