/**
 * 
 */
package Kapitel_05;

/**
 * 
 */
public class Format {

	/**
	 * 
	 */
	public Format() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 19,
			z =	7;
		float f = 123.456789F;
		String s = "Euro";
		
		System.out.printf("Teilnehmer: %d Person \n", x);
		System.out.printf("Teilnehmer: %6d Person \n", x);
		System.out.printf("Teilnehmer: %-6d Person \n", x);
		
//		System.out.printf("Kosten: %f Euro \n", f);
//		System.out.printf("Kosten: %12,4f Euro \n", f);
		System.out.printf("Kosten: %6,2f %S \n", f, s);
		System.out.printf("Nummer: %02d \n", z);
	}

}
