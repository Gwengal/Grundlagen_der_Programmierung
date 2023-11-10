/**
 * 
 */
package Kapitel_04;

/**
 * 
 */
public class Character {

	/**
	 * 
	 */
	public Character() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cTestChar = 'h';
		
		switch (cTestChar){
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': {
				System.out.println("Vokal");
				break;
			}
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': {
				System.out.println("Zahl");
				break;
			}
			default:
				System.out.println("Konsonant");
			}
	}

}
