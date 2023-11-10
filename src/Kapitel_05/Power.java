/**
 * 
 */
package Kapitel_05;

import java.util.Scanner;

/**
 * 
 */
public class Power {

	/**
	 * 
	 */
	public Power() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(Power.getPot(2, 7));
	}
	
	/**
	 * calculate potent
	 * 
	 * @param iNumber
	 * @param iPotenz
	 * @return
	 */
	public static double getPot(int iNumber, int iPotenz) {
		return Math.pow(iNumber, iPotenz);
	}

}
