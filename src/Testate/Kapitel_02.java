package Testate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Kapitel_02 {

	public Kapitel_02() {
	}

	public static void main(String[] args) {
		
		// Declaration
		String sName, sDate;
		String[] aDate;
		int iDay, iMonth, iYear;
		Scanner oScan = new Scanner(System.in);
		LocalDate oGebDate, oCurrentDay;
		DateTimeFormatter oPattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		// Get instance for the current day
		oCurrentDay = LocalDate.now();

		// Get the name
		System.out.print("Erfassen Sie bitte Ihren Namen: ");
		sName = oScan.nextLine();

		System.out.print("Erfassen Sie bitte Ihren Geburtstag: ");
		sDate = oScan.nextLine();

		oScan.close();
				
		// Split the date by the char "."
		aDate = sDate.split("\\.");
				
		if (aDate.length < 3 || aDate.length > 3) {	
			
			System.out.println("Sie haben kein valides Datum erfasst!");
		}else {
			iDay = Integer.valueOf(aDate[0]);	
			iMonth = Integer.valueOf(aDate[1]);
			iYear = Integer.valueOf(aDate[2]);
					
			// Get instance for the birthdate
			oGebDate = LocalDate.of(iYear, iMonth, iDay);
					
			// Get the age
			int iAge = Period.between(oGebDate, oCurrentDay).getYears();
					
			System.out.print("\n\n");
			System.out.println("========================================");
			System.out.println("Mein Name ist " + sName);
			System.out.println("Ich habe am " + oGebDate.format(oPattern) + " Geburtstag und bin " + iAge + " Jahre alt!");
			System.out.println("========================================");
		}
	}
}
