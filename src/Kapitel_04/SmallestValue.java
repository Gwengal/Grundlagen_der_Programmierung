/**
 * 
 */
package Kapitel_04;

import java.util.Scanner;

/**
 * 
 */
public class SmallestValue {

	/**
	 * 
	 */
	public SmallestValue() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int iA, iB, iC, iSmall;
		Scanner oScan = new Scanner(System.in);
		
		System.out.print("Erfassen Sie die erste Zahl: ");
		iA = oScan.nextInt();
		System.out.print("Erfassen Sie die zweite Zahl: ");
		iB = oScan.nextInt();
		System.out.print("Erfassen Sie die dritte Zahl: ");
		iC = oScan.nextInt();
		
		if (iA < iB) {
			iSmall = iA;
		}else{
			iSmall = iB;
		}
		
		if (iSmall > iC) {
			iSmall = iC;
		}
		
		System.out.println(iSmall);
		oScan.close();
	}

}
