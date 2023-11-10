package Testate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bankautomat {

	public Bankautomat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------------------------------------------------------------------/
		// Declaration
		//----------------------------------------------------------------------/
		Integer[] aPossMoney = new Integer[] {500, 200, 100, 50, 20, 10, 5};
		int iInput;
		Scanner oScan = new Scanner(System.in);
				
		//-----------------------------------------------------------------------/
		// User Input
		//-----------------------------------------------------------------------/
		while(true) {
			System.out.print("Erfassen Sie bitte den gewünschten Betrag [min. 5 €]: ");
			try {
				try {
					iInput = Integer.parseInt(oScan.next());
				} catch (NumberFormatException eWrongInput) {
					throw new Exception("Erfassen Sie bitte eine Gleitzahl!");
				}
					
				if (iInput < 5) {
					throw new Exception("Erfasster Betrag darf nicht < 5€ sein!");
				} else if( (iInput % 10) != 0 && (iInput % 10) != 5) {
					throw new Exception("Erfasster Betrag muss auf 0 oder 5 enden!");
				}
						
				// input is valid -> leave the loop
				break;
			} catch (Exception eError) {
						System.out.println("****************************************************");
						System.out.println("ERROR !!! -> " + eError.getMessage());
						System.out.println("****************************************************\n\n\n");
			}
		}
				
		//-----------------------------------------------------------------------/
		// Output of the money
		//-----------------------------------------------------------------------/
		Arrays.sort(aPossMoney, Collections.reverseOrder());
		System.out.println("\n\nAusgabe des Geldes zu dem Betrag " + iInput + "€: ");
		for (int i = 0; i < aPossMoney.length; i++) {
			if (iInput < aPossMoney[i]) {
				continue;				
			}			
					
			// [Amount of money] x [money-value]€  
			System.out.print((iInput / aPossMoney[i]) + " x " + aPossMoney[i] + "€ \n");
			iInput = iInput % aPossMoney[i];
					
			if (iInput == 0) {
				break;
			}
		}
				
		oScan.close();
	}
}
