package Kapitel_03;

import java.util.Scanner;

import Exception.Uebung_Exception;

public class Uebung_Operatoren {

	public Uebung_Operatoren() {
	}

	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
		
		double d1, d2, dSolution = 0;
		String sInput;
		
		while (true) {
			d1 = 0;
			d2 = 0;
			sInput = "";
			
			System.out.print("Erfassen Sie die erste Zahl: ");
			d1 = oScan.nextDouble();
			
			System.out.print("Erfassen Sie die zweite Zahl: ");
			d2 = oScan.nextDouble();
			
			System.out.print("Erfassen Sie den Operator: ");
			sInput = oScan.next();
			
			dSolution = calculate(oScan, sInput, d1, d2);
		
			System.out.println("Ergebnis: " + dSolution);
			
			System.out.print("Wollen Sie die Logik verlassen? [Yes = Y/y]");
			sInput = oScan.next();
			
			if (sInput.contains("y") || sInput.contains("Y")) {
				break;
			}
			
			System.out.println("\n \n \n \n");
		}
	}

	private static double calculate(Scanner oScan, String sInput, double d1, double d2) {
		
		String sErrorMsg;
		double dSolution = 0;
		
		while (true) {	
			try {
				switch (sInput){
					case "+": {
						dSolution = d1 + d2;
						break;	
					}
					case "-": {
						dSolution = d1 - d2;
						break;
					}
					case "*":{
						dSolution = d1 * d2;
						break;
					}
					case "/":{
						if (d2 == 0) {
							System.out.println("Division durch 0 ist nicht erlaubt!");
							throw new Uebung_Exception("Erfassen Sie bitte eine neue Zahl: ");
						}
						
						dSolution = d1 / d2;
						break;
					}
					case "%":{
						dSolution = d1 % d2;
						break;
					}		
					default:{
						System.out.println("Sie haben keinen validen Operater erfasst! [+;-,*;/;%]");
						throw new Uebung_Exception("Erfassen Sie bitte einen validen Operator: ");
					}	
				}
				
				return dSolution;
			} catch(Uebung_Exception eUebung){ 
				sErrorMsg = eUebung.getMessage();
				
				System.out.print(sErrorMsg);
				
				if (sErrorMsg.contains("Operator")) {
					sInput = oScan.next();
				}
				else {
					d2 = oScan.nextDouble();
				}
			}
		} 
	} 
}
