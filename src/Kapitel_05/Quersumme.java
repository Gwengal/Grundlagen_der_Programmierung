/**
 * 
 */
package Kapitel_05;

import java.util.Scanner;

/**
 * 
 */
public class Quersumme {

	/**
	 * 
	 */
	public Quersumme() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int iInput;
		Scanner oScan = new Scanner(System.in);
		
		System.out.print("Erfassen Sie eine Zahl: ");
		iInput = oScan.nextInt();
		oScan.close();
		
		System.out.println("Quersumme von " + iInput + " = " + Quersumme.calc(iInput));
	}

	/**
	 * Berechne Quersumme
	 * 
	 * @param iInput
	 * @return
	 */
	private static int calc(int iInput) {
		if (iInput > 0) {
			return (iInput % 10) + Quersumme.calc((iInput / 10));
		}else {
			return iInput;
		}
		
	}

}
