/**
 * 
 */
package Kapitel_04;

import java.util.Scanner;

/**
 * 
 */
public class Rechnen {

	/**
	 * 
	 */
	public Rechnen() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iInput1, iInput2;
		String sOperator;
		Scanner oScan = new Scanner(System.in);

		System.out.print("Erfassen Sie die erste Zahl: ");
		iInput1 = oScan.nextInt();

		System.out.print("Erfassen Sie die zweite Zahl: ");
		iInput2 = oScan.nextInt();

		System.out.print("Erfassen Sie den Operator: ");
		sOperator = oScan.next();

		switch (sOperator) {
		case "+": {
			System.out.println(iInput1 + " + " + iInput2 + " = " + (iInput1 + iInput2));
			break;
		}
		case "-": {
			System.out.println(iInput1 + " + " + iInput2 + " = " + (iInput1 + iInput2));
			break;
		}
		case "*": {

			break;
		}
		case "/": {

			break;
		}
		default:
			System.out.println("Operator " + sOperator + " ist nicht valide.");
		}
	}

}
