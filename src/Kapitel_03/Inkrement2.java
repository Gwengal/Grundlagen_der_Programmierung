/**
 * 
 */
package Kapitel_03;

/**
 * 
 */
public class Inkrement2 {

	/**
	 * 
	 */
	public Inkrement2() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x, z = 10;

		// 10
		System.out.println(x = z++);
		// 11
		System.out.println(z = ++x);
		// 23
		System.out.println(x += ++z);
		// 35
		System.out.println(z += x++);
	}

}
