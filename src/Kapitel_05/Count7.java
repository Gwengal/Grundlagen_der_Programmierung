/**
 * 
 */
package Kapitel_05;

/**
 * 
 */
public class Count7 {

	/**
	 * 
	 */
	public Count7() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Count7.iter_Count7(717737) + " " + Count7.rek_Count7(7137));
	}
	
	private static int iter_Count7(int iInput) {
		int iCount = 0;
		
		while(iInput != 0) {
			if (iInput % 10 == 7) 
				iCount ++;
			
			iInput = iInput / 10;
		}
		
		return iCount;
	}
	
	private static int rek_Count7(int iInput) {
		if (iInput > 0) {	
			return (iInput % 10 == 7 ? 1 : 0) + Count7.rek_Count7(iInput / 10);
		}
		else {
			return 0;
		}
	}
}
