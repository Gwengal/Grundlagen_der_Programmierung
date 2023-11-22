package Kapitel_02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Zeit {

	public Zeit() {
	}

	public static void main(String[] args) {
		
		// Declaration
		String sInput;
		String[] aTime;
		Scanner oScan = new Scanner(System.in);
		Duration oDur;
		LocalDateTime oStart, oEnd;
		
		// Get instance of LocalDatetime for Date.now and Time.of(0, 0)
		oStart = LocalDateTime.of(LocalDate.now(), LocalTime.of(0, 0));
		
		// Get the recorded Time
		System.out.print("Erfassen Sie bitte die aktuelle Uhrzeit [HH:MM]: ");
		sInput = oScan.nextLine();
		
		// Split the Time by the char ":"
		aTime = sInput.split(":");
		
		// Get instance of LocalDateTime for Date.now and Time.of(aTime[0], aTime[1]) 
		oEnd = LocalDateTime.of(LocalDate.now(), LocalTime.of(Integer.valueOf(aTime[0]), Integer.valueOf(aTime[1])));
		
		// Get the duration between oStart and oEnd
		oDur = Duration.between(oStart, oEnd);
		oScan.close();
		
		System.out.println("Seit Mitternacht sind " + (oDur.getSeconds() / 60) + " min vergangen." );		
	}

}
