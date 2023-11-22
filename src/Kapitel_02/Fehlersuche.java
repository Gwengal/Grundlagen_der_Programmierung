package Kapitel_02;

import java.util.Scanner;

public class Fehlersuche {

	public Fehlersuche() {
	}
	
	public static void main (String[] args) {
		
		int a, b, c, sum;
		 Scanner read = new Scanner(System.in);

		 System.out.println("Bitte eine ganze Zahl eingeben: ");
		 a = read.nextInt();
		 System.out.println("Bitte eine weitere Zahl eingeben: ");
		 
		 // --> Semikolon fehlt
		 b = read.nextInt();
		 System.out.println("Bitte eine weitere Zahl eingeben: ");
		 c = read.nextInt();

		 // --> Deklaration für Summe fehlt
		 sum = a+b+c;
		 System.out.println("******************");
		 
		 // --> Stringverkettung falsch ... "=" + sum
		 System.out.println(a + "+" + b + "+" + c + "=" + sum);
		 // --> Anführungszeichen fehlen
		 System.out.println("********************"); 
		 read.close();
	}

}
