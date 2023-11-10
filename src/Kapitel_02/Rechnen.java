package Kapitel_02;

import java.util.Iterator;

public class Rechnen {

	public Rechnen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aX, aY;
		int iSum, iDiv, iProd, iQuot;
		
		aX = new int[]{4, 7, 1};
		aY = new int[]{2, 3, 0};
		
 		for (int i = 0; i < aX.length; i++) {
			iSum = aX[i] + aY[i];
			iDiv = aX[i] - aY[i];
			iProd = aX[i] * aY[i];
			iQuot = aX[i] / aY[i];
			
			System.out.println("Summe: " + iSum);
			System.out.println("Differenz: " + iDiv);
			System.out.println("Produkt: " + iProd);
			System.out.println("Quotient: " + iQuot + "\n");
		}

	}

}
