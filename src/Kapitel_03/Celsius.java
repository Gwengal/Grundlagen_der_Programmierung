/**
 * 
 */
package Kapitel_03;

import java.util.Scanner;

/**
 * 
 */
public class Celsius {

	/**
	 * 
	 */
	public Celsius() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//----------------------------------------------------------------------/
		// Declaration
		//----------------------------------------------------------------------/
		float fInput;
		Scanner oScan = new Scanner(System.in);
		
		System.out.print("Erfassen Sie die Temperatur in °F: ");
		fInput = oScan.nextFloat();
		
		System.out.println(fInput + " °F entspricht " + (5/9f * (fInput - 32)) + " °C.\n");
		
		System.out.print("Erfassen Sie die Temperatur in °C: ");
		fInput = oScan.nextFloat();
		
		System.out.println(fInput + " °F entspricht " + ((fInput * 9/5f) + 32) + " °F.");
		
		oScan.close();
	}

}
