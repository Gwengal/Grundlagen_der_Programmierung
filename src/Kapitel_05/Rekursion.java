/**
 * 
 */
package Kapitel_05;

/**
 * 
 */
public class Rekursion {

	/**
	 * 
	 */
	public Rekursion() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rekursion.rek(4);
	}

	/**
	 * @param i
	 */
	private static void rek(int i) {
		System.out.println("Hinweg " + i);
		
		if (i > 0) {
			Rekursion.rek(i - 1);
		}
		
		System.out.println("Rücksprung " + i);
	}

}
