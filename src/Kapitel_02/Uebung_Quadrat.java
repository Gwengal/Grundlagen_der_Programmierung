package Kapitel_02;

import java.util.Scanner;

public class Uebung_Quadrat {

	public Uebung_Quadrat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iInput, iExponent;
		Scanner oScan = new Scanner(System.in);
		
		// Enter a number
		System.out.print("Erfassen Sie eine Zahl: ");
		iInput = oScan.nextInt();
		
		// Enter an exponent
		System.out.print("Erfassen Sie einen Exponenten: ");
		iExponent = oScan.nextInt();
		
		// Calc the expo of the number
		System.out.print(iInput + " hoch " + iExponent + " = " + _calcExpo(iInput, iExponent));
	}
	
	private static int _calcExpo(int iBase, int iExponent) {
		 int iresult = 1;
	       for (int i = 0; i < iExponent; i++) {
	           iresult = iBase * iresult;
	       }
	     return iresult;
	}
}
