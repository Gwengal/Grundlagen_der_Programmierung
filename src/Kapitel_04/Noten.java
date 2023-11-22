/**
 * 
 */
package Kapitel_04;

import java.util.Scanner;

/**
 * 
 */
public class Noten {

	/**
	 * 
	 */
	public Noten() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
		int iNote = 0;
		
		
		while(true) {
			System.out.print("Erfassen Sie eine Note als Gleitzahl: ");
			
			try {
				try {
					iNote = Integer.parseInt(oScan.next());
				} catch (NumberFormatException eWrongInput) {
					throw new Exception("Erfassen Sie die Note bitte als Gleitzahl!");
				}
				
				if (iNote < 1 && iNote > 6) {
					throw new Exception("Note darf nur im Bereich 1-6 liegen!");
				}	
				
				break;				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		switch (iNote) {
			case 1: {	
				System.out.println("Sehr gut");
				break;
			}		
			case 2: {	
				System.out.println("Gut");
				break;
			}	
			case 3: {	
				System.out.println("Befriedigend");
				break;
			}	
			case 4: {	
				System.out.println("Ausreichend");
				break;
			}	
			case 5: {	
				System.out.println("Ungenügend");
				break;
			}	
			case 6: {	
				System.out.println("Sehr scheiße");
				break;
			}	
		}
		
		oScan.close();
	}

}
