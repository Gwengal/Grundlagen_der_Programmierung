/**
 * 
 */
package Kapitel_06;

/**
 * 
 */
public class ErstesArrayKappa {

	/**
	 * 
	 */
	public ErstesArrayKappa() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] aIntArray = {1, 7, 33, 12, 21};
		
		System.out.println(aIntArray);
		System.out.println(aIntArray.length);
		System.out.println(aIntArray[2]);
		
		for (int i = 0; i < aIntArray.length; i++) {
			System.out.print("[" + aIntArray[i] + "] ");
		}
	}
}
