/**
 * 
 */
package Kapitel_03;

/**
 * 
 */
public class Zuweisung {

	/**
	 * 
	 */
	public Zuweisung() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 2, z;
		
		// 4
		System.out.println(z = x + 1);
		// 8
		System.out.println(z += x + 1);
		// 13
		System.out.println(z += x + y);
		// 18
		System.out.println(z += x += y);
		// 24
		System.out.println(z += x += y = 1);
		// 12
		System.out.println(x *= x = 2);
	}
}
