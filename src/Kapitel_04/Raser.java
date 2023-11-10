package Kapitel_04;

import java.util.Scanner;

public class Raser {

	public Raser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner oScan = new Scanner(System.in);
		float fV;
		boolean bRaser;
		
		System.out.print("Wie schnell fährt das Auto: ");
		fV = oScan.nextFloat();
		
		bRaser = fV <= 50.0f;
		
		System.out.println("Geschwindigkeit ok? " + bRaser );
		
		if (fV > 50.0f && bRaser == false) {			
			System.out.println("Im Auto sitzt ein Raser! Raser fährt um " + (fV - 50.0f) + "kmh zu schnell.");
		} else {
			System.out.println("Im Auto sitzt kein Raser. Die Person fährt " + fV + "kmh.");
		}	
		
		oScan.close();		
	}

}
