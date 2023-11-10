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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner oScan = new Scanner(System.in);
		int iInput;
		
		System.out.print("Erfassen Sie eine Zahl: ");
		iInput = oScan.nextInt();
		
		System.out.println("Ist die erfasste Zahl " + iInput + " durch 5 teilbar? " + (iInput % 5 == 0 ? "ja" : "nein"));
	}

}
