/**
 * 
 */
package Testate;

import java.util.Scanner;

/**
 * 
 */
public class QuadratischeGleichung {

	/**
	 * 
	 */
	public QuadratischeGleichung() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ----------------------------------------------------------------------/
		// Declaration
		// ----------------------------------------------------------------------/
		Integer iA = null, iB = null, iC = null;
		Scanner oScan = new Scanner(System.in);

		// ---------------------------------------------------------------------/
		// Get user input for a, b, c
		// ---------------------------------------------------------------------/
		while (true) {
			try {
				// Get user input for variable a
				iA = QuadratischeGleichung.getInput('a', iA, oScan);
				// get user input for variable b
				iB = QuadratischeGleichung.getInput('b', iB, oScan);
				// get user input for variable c
				iC = QuadratischeGleichung.getInput('c', iC, oScan);

				break;
			} catch (Exception eError) {
				System.out.println("****************************************************");
				System.out.println("ERROR !!! -> " + eError.getMessage());
				System.out.println("****************************************************\n\n\n");
			}
		}
		oScan.close();

		// ---------------------------------------------------------------------/
		// Calculate solutions and output them
		// ---------------------------------------------------------------------/
		QuadratischeGleichung.calcQuard(iA, iB, iC);
	}

	/**
	 * Calculate solutions
	 * 
	 * @param iA
	 * @param iB
	 * @param iC
	 */
	private static void calcQuard(Integer iA, Integer iB, Integer iC) {
		float fD, fX1 = 0.0f, fX2 = 0.0f;

		if (iA != 0) {
			fD = (float) Math.pow(iB, 2) - 4 * iA * iC;

			if (fD < 0) {
				// Empty set
				QuadratischeGleichung.showResult(0, fX1, fX2, iA, iB, iC);
			} else if (fD == 0) {
				// One solution
				fX1 = -(iB / (2f * iA));
				
				QuadratischeGleichung.showResult(2, fX1, fX2, iA, iB, iC);
			} else if (fD > 0) {
				// Two solutions				
				fD = (float) Math.sqrt(fD);
				fX1 = ((-iB + fD) / (2f * iA));
				fX2 = ((-iB - fD) / (2f * iA));
				
				QuadratischeGleichung.showResult(3, fX1, fX2, iA, iB, iC);
			}
		} else {
			if (iB != 0) {
				// One solution
				fX1 = -((float) iC / iB);
				
				QuadratischeGleichung.showResult(2, fX1, fX2, iA, iB, iC);
			} else if (iC == 0) {
				// Infinite solutions
				QuadratischeGleichung.showResult(1, fX1, fX2, iA, iB, iC);
			} else {
				// Empty set
				QuadratischeGleichung.showResult(0, fX1, fX2, iA, iB, iC);
			}
		}
	}

	/**
	 * Output solutions to the console
	 * 
	 * @param iCase
	 * @param fX1
	 * @param fX2
	 * @param iA
	 * @param iB
	 * @param iC
	 */
	private static void showResult(int iCase, float fX1, float fX2, Integer iA, Integer iB, Integer iC) {
		String sOutput = "Für " + iA + ", " + iB + " und " + iC + " ";

		switch (iCase) {
		// ---------------------------------------------------------------------/
		// Empty set
		// ---------------------------------------------------------------------/
		case 0:
			System.out.println(sOutput + "kommen keine reellen Lösungen raus.");
			break;
		// ---------------------------------------------------------------------/
		// Infinite solutions
		// ---------------------------------------------------------------------/
		case 1:
			System.out.println(sOutput + "kommen unendlich viele Lösungen raus.");
			break;
		// ---------------------------------------------------------------------/
		// One solution
		// ---------------------------------------------------------------------/
		case 2:
			System.out.println(sOutput + "konnte nur eine Lösung berechnet werden: " + fX1);
			break;
		// ---------------------------------------------------------------------/
		// Two solutions
		// ---------------------------------------------------------------------/
		case 3:
			System.out.println(sOutput + "wurden zwei Lösungen berechnet. x1: " + fX1 + " x2: " + fX2);
			break;
		}
	}

	/**
	 * Get user input for each individual variable
	 * 
	 * @param cVar
	 * @param iInteger
	 * @param oScan
	 * @return
	 * @throws Exception
	 */
	private static Integer getInput(char cVar, Integer iInteger, Scanner oScan) throws Exception {
		if (iInteger == null) {
			try {
				System.out.print("Erfassen Sie eine Zahl für die Variable " + cVar + ": ");
				iInteger = Integer.parseInt(oScan.nextLine());
			} catch (NumberFormatException eWrongInput) {
				throw new Exception("Erfassen Sie bitte eine Gleitzahl!");
			}
		}

		return iInteger;
	}
}
