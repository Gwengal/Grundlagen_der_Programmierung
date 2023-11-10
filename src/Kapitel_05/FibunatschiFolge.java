/**
 * 
 */
package Kapitel_05;

/**
 * 
 */
public class FibunatschiFolge {

	/**
	 * 
	 */
	public FibunatschiFolge() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int fibu(int iNumber) {
		
		if (iNumber == 1 || iNumber == 2) 
			return 1;
		
		return FibunatschiFolge.fibu((iNumber - 1)) + FibunatschiFolge.fibu((iNumber-2));		
	}

}
