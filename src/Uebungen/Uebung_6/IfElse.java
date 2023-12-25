package Uebungen.Uebung_6;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int iAge = IfElse.getInput();
        if (iAge < 18) {
            System.out.println("Sie sind noch minderjährig");
        }else if(iAge >= 18 && iAge <= 65){
            System.out.println("Sie sind im erwerbsfähigen Alter");
        }else{
            System.out.println("Sie sind bereits im Renten-Alter");
        }
    }

    private static int getInput() {
        int iAge;
        String sInput;
        Scanner oScanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Geben Sie Ihr Alter bitte ein: ");
                sInput = oScanner.nextLine();
                iAge = Integer.parseInt(sInput);

                if (iAge <= 0) {
                    throw new Exception("Alter muss > 0 sein!");
                }

                break;
            } catch (Exception e) {
                System.out.printf("ERROR -> %s\n\n", e.getMessage());
            }
        }
        oScanner.close();

        return iAge;
    }
}
