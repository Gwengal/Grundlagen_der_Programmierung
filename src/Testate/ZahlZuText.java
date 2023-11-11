package Testate;

import java.util.Scanner;

public class ZahlZuText {

    public static void main(String[] args) {
        // --| declaration |--
        int iNumToText;
        String sOutput;

        // --| get user input |--
        iNumToText = ZahlZuText.getInput();

        // --| get number as text |--
        if ((iNumToText / 10) < 20) {
            sOutput = ZahlZuText.convertToText19(iNumToText);
        } else {
            sOutput = ZahlZuText.covertToText(iNumToText);
        }

        // --> output [input]: [number to text]
        System.out.println((iNumToText / 10f) + ": " + sOutput);
    }

    /**
     * Convert number to text > 19
     * 
     * @param iNumToText
     * @return
     */
    private static String covertToText(int iNumToText) {
        // --| declaration |--
        int iDecimalPlace;
        String sOutput = "";

        // get the decimal place
        iDecimalPlace = iNumToText % 10;
        iNumToText = iNumToText / 10;

        // --| get text for starting number |--
        if (iNumToText % 10 > 0) {
            sOutput = ZahlZuText.numbers1To9((iNumToText % 10), true) + "und";
        }

        // --| determine the tens digit and multiply by 10 |--
        switch ((iNumToText / 10) * 10) {
            case 20:
                sOutput = sOutput + "zwanzig";
                break;
            case 30:
                sOutput = sOutput + "dreißig";
                break;
            case 40:
                sOutput = sOutput + "vierzig";
                break;
            case 50:
                sOutput = sOutput + "fünfzig";
                break;
            case 60:
                sOutput = sOutput + "sechzig";
                break;
            case 70:
                sOutput = sOutput + "siebzig";
                break;
            case 80:
                sOutput = sOutput + "achtzig";
                break;
            case 90:
                sOutput = sOutput + "neunzig";
                break;
        }

        // --| get decimal to text |--
        if (iDecimalPlace > 0) {
            sOutput = sOutput + "" + ZahlZuText.decimalToText(iDecimalPlace);
        }

        return sOutput;
    }

    /**
     * Convert number to text till 19
     * 
     * @param iNumToText
     * @return
     */
    private static String convertToText19(int iNumToText) {
        // --| declaration |--
        int iDecimalPlace;
        String sOutput;

        // get the decimal place
        iDecimalPlace = iNumToText % 10;
        iNumToText = iNumToText / 10;

        // --| numbers from 0 to 9 |--
        sOutput = ZahlZuText.numbers1To9(iNumToText, false);

        // --| numbers from 10 to 19 |--
        switch (iNumToText) {
            case 10:
                sOutput = "zehn";
                break;
            case 11:
                sOutput = "elf";
                break;
            case 12:
                sOutput = "zwölf";
                break;
            case 13:
                sOutput = "dreizehn";
                break;
            case 14:
                sOutput = "vierzehn";
                break;
            case 15:
                sOutput = "fünfzehn";
                break;
            case 16:
                sOutput = "sechszehn";
                break;
            case 17: 
                sOutput = "siebzehn";
                break;
            case 18: 
                sOutput = "achtzehn";
                break;
            case 19:
                sOutput = "neunzehn";
                break;
        }

        // --| get decimal to text |--
        if (iDecimalPlace > 0) {
            sOutput = sOutput + "" + ZahlZuText.decimalToText(iDecimalPlace);
        }

        return sOutput;
    }

    /**
     * Get decimal to text
     * 
     * @param iDecimalPlace
     * @return
     */
    private static String decimalToText(int iDecimalPlace) {
        // --| get text for number 1 to 9        
        return "komma" + ZahlZuText.numbers1To9(iDecimalPlace, false);
    }

    /**
     * Get text for numbers 1-9
     * 
     * @param iNumToText
     * @return
     */
    private static String numbers1To9(int iNumToText, boolean bBigger19) {
        // --| declaration |--
        String sOutput = "";

        switch (iNumToText) {
            case 0:
                sOutput = "null";
                break;
            case 1:
                sOutput = (bBigger19 == true ? "ein" : "eins");
                break;
            case 2:
                sOutput = "zwei";
                break;
            case 3:
                sOutput = "drei";
                break;
            case 4:
                sOutput = "vier";
                break;
            case 5:
                sOutput = "fünf";
                break;
            case 6:
                sOutput = "sechs";
                break;
            case 7:
                sOutput = "sieben";
                break;
            case 8:
                sOutput = "acht";
                break;
            case 9: 
                sOutput = "neun";
                break;
        }
        
        return sOutput;
    }

    /**
     * Get user input
     * 
     * @return
     */
    private static int getInput() {
        // --| declaration | --
        float fInput;
        Scanner oScan = new Scanner(System.in);

        // --| user input and error handling |--
        while (true) {
            try {
                System.out.print("Erfassen Sie bitte eine positive Zahl im Format XX,X: ");
                try {
                    fInput = Float.parseFloat(oScan.nextLine());
                } catch (NumberFormatException eConvertError) {
                    throw new Exception("Eingabe ist keine Zahl!");
                }

                // user input was negative
                if (fInput < 0) {
                    throw new Exception("Erfasste Zahl darf nicht negativ sein!");
                }

                // input format ist not xx,x
                if (String.valueOf(fInput).length() > 4 || fInput >= 100) {
                    throw new Exception("Erfasste Zahl " + fInput + " ist nicht im Format xx,x!");
                }
                oScan.close();
                
                
                break;
            } catch (Exception eError) {
                System.out.println("****************************************************");
                System.out.println("ERROR !!! -> " + eError.getMessage());
                System.out.println("****************************************************\n");
            }
        }

        return (int) (fInput * 10);
    }

}
