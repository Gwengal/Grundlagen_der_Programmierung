/**
 * 
 */
package Kapitel_05;

/**
 * 
 */
public class Swap {

	/**
	 * 
	 */
	public Swap() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7, b = 3;
		
		System.out.println("In Main a = " + a + " b = " + b);
		Swap.swap(a,b);
		System.out.println("In Main a = " + a + " b = " + b);
	}

	/**
	 * @param x
	 * @param y
	 */
	private static void swap(int x, int y) {
		// lokale Variable zum Tauschen
		int tmp;
		
		System.out.println("In Swap x = " + x + " y = " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("In Swap x = " + x + " y = " + y);
	}

}
