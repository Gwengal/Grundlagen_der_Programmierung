/**
 * 
 */
package Kapitel_04;

import java.util.Scanner;

/**
 * 
 */
public class Modulo {

	/**
	 * 
	 */
	public Modulo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
		int iInput;
		
		System.out.print("Erfassen Sie eine Zahl: ");
		iInput = oScan.nextInt();
		oScan.close();

		System.out.println("Ist die erfasste Zahl " + iInput + " durch 5 teilbar? " + (iInput % 5 == 0 ? "ja" : "nein"));
	}

}
