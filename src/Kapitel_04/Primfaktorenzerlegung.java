/**
 * 
 */
package Kapitel_04;

import java.util.Scanner;

/**
 * 
 */
public class Primfaktorenzerlegung {

	/**
	 * 
	 */
	public Primfaktorenzerlegung() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iInput;
		Scanner oScan = new Scanner(System.in);

		System.out.print("Erfassen Sie eine Zahl: ");
		iInput = oScan.nextInt();

		while (iInput > 1) {
			for (int iCount = 2; iCount <= iInput; iCount++) {
				if (iInput % iCount == 0) {
					iInput /= iCount;
					System.out.println(iCount);
					
					break;
				}
				
//				iInput = (iInput % iCount == 0 ? iInput / iCount : iInput);
			}
		}

		oScan.close();
	}

}
