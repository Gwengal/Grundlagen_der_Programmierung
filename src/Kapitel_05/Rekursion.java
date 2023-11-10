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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rekursion.rek(4);
	}

	/**
	 * @param i
	 */
	private static void rek(int i) {
		// TODO Auto-generated method stub
		System.out.println("Hinweg " + i);
		
		if (i > 0) {
			Rekursion.rek(i - 1);
		}
		
		System.out.println("Rücksprung " + i);
	}

}
