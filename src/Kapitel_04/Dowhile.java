/**
 * 
 */
package Kapitel_04;

/**
 * 
 */
public class Dowhile {

	/**
	 * 
	 */
	public Dowhile() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float fWert = 1.0f,
			  fDelta = 1.0f;
		
		do {
			fDelta /= 10f;
		} while (fWert != fWert + fDelta);

	}

}
