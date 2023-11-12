package Testate;

import java.util.Scanner;

public class Rundung {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| declaration |--
        float fInput;
        Scanner oScan = new Scanner(System.in);

        // --| get user input |--
        fInput = Rundung.getInput(oScan);

        // --| round float to int |--
        System.out.println("Zahl " + fInput + " wird zu " + Rundung.round(fInput) + " gerundet.");

        // --| round float by choosen digits |--
        Rundung.roundByDigits(oScan, fInput);
    }

    /**
     * Round float by choosen digits
     * 
     * @param oScan
     * @param fInput
     */
    private static void roundByDigits(Scanner oScan, float fInput) {
        // --| declaration |--
        int iDigits;

        // --| get digits to round |--
        System.out.print("Möchten Sie die Zahl noch auf x-Beliebige Nachkommastellen runden? [ja = Y/y]");
        if (oScan.nextLine().contains("y") || oScan.nextLine().contains("Y")) {
            while (true) {
                try {
                    System.out.print("\nAuf wie viele Nachkommastellen möchten Sie runden? ");
                    try {
                        iDigits = Integer.parseInt(oScan.nextLine());
                    } catch (NumberFormatException eConvertError) {
                        throw new Exception("Eingabe ist keine Zahl!");
                    }
                    oScan.close();

                    break;
                } catch (Exception eError) {
                    System.out.println("****************************************************");
                    System.out.println("ERROR !!! -> " + eError.getMessage());
                    System.out.println("****************************************************\n");
                }
            }

            // --| round number to specified number of decimal places |--
            System.out.println("Zahl " + fInput + " wird auf " + iDigits + " Nachkommastellen gerundet: " + Rundung.round(fInput, iDigits));
        }
    }

    /**
     * Get user input
     * 
     * @return
     */
    private static float getInput(Scanner oScan) {
        // --| declaration | --
        float fInput;

        // --| user input and error handling |--
        while (true) {
            try {
                System.out.print("Erfassen Sie bitte eine Zahl: ");
                try {
                    fInput = Float.parseFloat(oScan.nextLine());
                } catch (NumberFormatException eConvertError) {
                    throw new Exception("Eingabe ist keine Zahl!");
                }

                break;
            } catch (Exception eError) {
                System.out.println("****************************************************");
                System.out.println("ERROR !!! -> " + eError.getMessage());
                System.out.println("****************************************************\n");
            }
        }

        return fInput;
    }

    /**
     * Round float number to an integer
     * 
     * @param fInput
     * @return
     */
    private static int round(float fInput) {
        return ((fInput % 1) >= 0.5 ? (int) (fInput + 1) : (int) fInput);
    }

    /**
     * Round number to specified number of decimal places
     * 
     * @param fInput
     * @param iDigits
     * @return
     */
    private static float round(float fInput, int iDigits) {
        // --| declaration |--
        int iNumber;

        // --| move decimal place by number of rounding places |--
        for (int i = 0; i < iDigits; i++) {
            fInput = fInput * 10;
        }

        // --/ round float number to an integer |--
        iNumber = Rundung.round(fInput);
        fInput = iNumber;

        // --| convert int to float with digits |--
        for (int i = 0; i < iDigits; i++) {
            fInput = fInput / 10f;
        }

        return fInput;
    }
}
