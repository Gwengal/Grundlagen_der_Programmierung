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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1 = 0;
		float fWert = 1.0f,
			  fDelta = 1.0f;
		
		do {
			fDelta /= 10f;
			i1++;
		} while (fWert != fWert + fDelta);

	}

}
