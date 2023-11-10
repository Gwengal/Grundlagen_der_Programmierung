/**
 * 
 */
package Testate;

import java.util.Scanner;

/**
 * 
 */
public class Primzahl {

	/**
	 * 
	 */
	public Primzahl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long lInput;
		boolean bPrim;

		// Get user input
		lInput = Primzahl.getInput();

		// Check if number is prime
		bPrim = Primzahl.isPrim(lInput);
		System.out.println("Zahl " + lInput + " ist " + (bPrim == true ? "eine" : "keine") + " Primzahl.");
	}

	/**
	 * Check if number is prime
	 * 
	 * @param lInput
	 * @return
	 */
	private static boolean isPrim(long lInput) {

		if (lInput <= 2)
			return (lInput == 2);

		/*
		 * Vorlesung Diskrete Mathematik am 02.11.2023:
		 * Zu jedem Teiler > Wurzel(lInput)
		 * gehört ein Teiler i < Wurzel(lInput)
		 */
		for (long i = 2; i * i <= lInput; i++) {
			if (lInput % i == 0)
				return false;
		}

		return true;
	}

	/**
	 * Get user input
	 * 
	 * @return
	 */
	private static long getInput() {

		long lInput;
		Scanner oScan = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Erfassen Sie bitte eine Gleitzahl: ");
				lInput = Long.parseLong(oScan.nextLine());
				oScan.close();
				break;
			} catch (Exception eError) {
				System.out.println("****************************************************");
				System.out.println("ERROR !!! -> Erfassen Sie bitte eine Gleitzahl!");
				System.out.println("****************************************************\n\n\n");
			}
		}

		return lInput;
	}

}
