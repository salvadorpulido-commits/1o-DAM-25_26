package English_exercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Variable
		int mirrorHour;
		int mirrorMinute;

		int realHour;
		int realMinute;
		
		//Open Scanner
		Scanner reader = new Scanner(System.in);

		//Ask user add hour
		System.out.println("Introduce the hour that you are seeing in the mirror:");
		mirrorHour = reader.nextInt();
		mirrorMinute = reader.nextInt();

		// if hour==12 I change it to 0 to operate later
		mirrorHour = (mirrorHour == 12) ? 0 : mirrorHour;

		// Hour oclock
		if (mirrorMinute == 0) {
			realHour = 12 - mirrorHour;
		} else {
			// Not hour oclock
			realHour = 11 - mirrorHour;
		}

		realHour = (realHour==0) ? 12: realHour;
		realMinute = (mirrorMinute == 0) ? 0 : (60 - mirrorMinute);
		
		if (realHour < 10) {
			System.out.print("0");
		}
		
		System.out.print(realHour + ":");

		if (realMinute < 10) {
			System.out.print("0");
		}
		
		System.out.println(realMinute);

		reader.close();

	}

}