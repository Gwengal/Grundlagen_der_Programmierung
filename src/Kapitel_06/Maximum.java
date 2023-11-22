/**
 * 
 */
package Kapitel_06;

/**
 * 
 */
public class Maximum {

	/**
	 * 
	 */
	public Maximum() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int iMax = 0;
		int[] aInt = {-2, 5, 0, -7, 13, 6, 2, 2};
		
		for (int i = 0; i < aInt.length; i++) {
			if (aInt[i] > iMax) {
				iMax = aInt[i];
			}
		}
		
		System.out.println("Maxwert: " + iMax);		
	}

}
