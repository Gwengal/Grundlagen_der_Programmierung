/**
 * 
 */
package Kapitel_05;


/**
 * 
 */
public class Power {

	/**
	 * 
	 */
	public Power() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println(Power.getPot(2, 7));
	}
	
	/**
	 * calculate potent
	 * 
	 * @param iNumber
	 * @param iPotenz
	 * @return
	 */
	public static double getPot(int iNumber, int iPotenz) {
		return Math.pow(iNumber, iPotenz);
	}

}
