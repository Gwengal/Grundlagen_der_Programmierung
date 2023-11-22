/**
 * 
 */
package Kapitel_05;

import java.util.Scanner;

/**
 * 
 */
public class Fakultaet {

	/**
	 * 
	 */
	public Fakultaet() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int iInput = 0;
		Scanner oScan = new Scanner(System.in);
		
		System.out.print("Erfassen Sie eine Zahl: ");
		iInput = oScan.nextInt();
		oScan.close();
		
		System.out.println(Fakultaet.fakult(iInput));
	}

	/**
	 * @param iInput
	 */
	private static long fakult(int iInput) {
		// Abbruchkriterium
		if (iInput > 0) {
			return iInput * Fakultaet.fakult(iInput - 1);
		}else {
			// 1! = 1
			return 1;
		}
	}
	
	

}
