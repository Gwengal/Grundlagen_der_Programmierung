/**
 * 
 */
package Kapitel_06;

/**
 * 
 */
public class DurchschnittswertArrays {

	/**
	 * 
	 */
	public DurchschnittswertArrays() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float fSum = 0f;
		float[] afloatTemp = {1, 7, 33, 77, 111};
		
		for (int i = 0; i < afloatTemp.length; i++) {
			fSum = fSum + afloatTemp[i];
		}
		
		fSum = fSum / afloatTemp.length;
		
		System.out.println("Durchschnittstemperatur: " + fSum);
	}

}
