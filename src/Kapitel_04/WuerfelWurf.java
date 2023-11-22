/**
 * 
 */
package Kapitel_04;

import java.util.Random;

/**
 * 
 */
public class WuerfelWurf {

	/**
	 * 
	 */
	public WuerfelWurf() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//----------------------------------------------------------------------/
		// Declaration
		//----------------------------------------------------------------------/
		int iZahl;
		Random oRandom = new Random();
		
//		iZahl = (int)(Math.random() * 6) * 1;
		iZahl = oRandom.nextInt(1, 7);
		switch (iZahl) {
			case 1: {
				System.out.println("Hugo");
				break;
			}
			case 2:{
				System.out.println("Anne");
				break;
			}
			case 3:{
				System.out.println("Jens");
				break;
			}
			case 4:{
				System.out.println("Jürgen");
				break;
			}
			case 5:{
				System.out.println("Wolfgang");
				break;
			}
			case 6:{
				System.out.println("Joahim");
				break;
			}
			default:
				System.out.println("Scheiße");
				break;
		}	

	}

}
