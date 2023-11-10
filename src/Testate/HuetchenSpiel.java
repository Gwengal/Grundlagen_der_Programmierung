/**
 * 
 */
package Testate;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class HuetchenSpiel {

	/**
	 * 
	 */
	public HuetchenSpiel() {
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
		int iHuetchen, iNumbRuns = 2;
		boolean bWon = false;
		Integer iInput = null;
		Scanner oScan = new Scanner(System.in);
		Random oRandom = new Random();

		// Get a number between 1 and 4 --> (1, 2, 3)
		iHuetchen = oRandom.nextInt(1, 4);

		// ---------------------------------------------------------------------/
		// Start shell game
		// ---------------------------------------------------------------------/
		System.out.println("Willkommen beim Hütchen-Spiel");
		System.out.println("************************");
		System.out.println("|   |\t|   |\t|   |");
		System.out.println("| 1 |\t| 2 |\t| 3 |");
		System.out.println("|___|\t|___|\t|___|");
		System.out.println("************************");
		System.out.println("\nWo ist die Kugel versteckt? Unter Becher 1, 2 oder 3?");

		for (int i = 0; i < iNumbRuns; i++) {
			iInput = HuetchenSpiel.getUserInput(iInput, i, oScan);

			// User won! Input equals iHuetchen
			if (iInput == iHuetchen) {
				bWon = true;
				System.out.println("***------Gewonnen, beim " + (i + 1) + ". Versuch-----***");

				break;
			}
		}

		// User lost! Input != iHuetchen
		if (bWon == false) {
			System.out.println("|-----------VERLOREN-----------");
		}

		System.out.println("Die Kugel war unter dem " + iHuetchen + ". Becher versteckt");
		oScan.close();
	}

	/**
	 * get user input
	 * 
	 * @param iInput
	 * @param oScan
	 * @param i
	 * @return
	 */
	private static int getUserInput(Integer iInput, int i, Scanner oScan) {
		while (true) {
			try {
				if (i == 0) {
					System.out.print("Bitte geben Sie Ihren Tipp ab: ");
				} else {
					System.out.print("Leider falsch. Raten Sie nochmal: ");
				}

				// Input is not an Integer!
				try {
					iInput = Integer.parseInt(oScan.nextLine());
				} catch (NumberFormatException eWrongInput) {
					throw new Exception("Erfassen Sie bitte eine Gleitzahl!");
				}

				// Input must be between 1 and 4
				if (iInput < 1 || iInput > 3) {
					throw new Exception("Erfassen Sie bitte eine Zahl zwischen 1 und 3!");
				}

				break;
			} catch (Exception eError) {
				System.out.println("****************************************************");
				System.out.println("ERROR !!! -> " + eError.getMessage());
				System.out.println("****************************************************\n\n\n");
			}
		}
		
		return iInput;
	}

}
