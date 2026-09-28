package English_exercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Variables
		int option;
		String answer;
		
		double totalPrice = 375.99;
		final double SCREEN_38 = 75.99;
		final double SCREEN_43 = 99.99;
		
		//Abrimos Scanner
		Scanner reader = new Scanner(System.in);
		
		//Pedimos al usuario que elija una de loas dos opciones
		
		System.out.println("Which screen do you prefeer?");
		System.out.println("1. 38cm " + SCREEN_38);
		System.out.println("2. 43cm " + SCREEN_43);
	    option = reader.nextInt();
	    
	    switch(option) {
	    
	    case 1:
	    	totalPrice += SCREEN_38;
	    	break;
	    case 2:
	    	totalPrice += SCREEN_43;	
	    	break;
	    }
	    //Pedimos al usuario si quiere un antivirus y que elija una de las dos opciones
	    System.out.println("Do you want antivirus software? (Y / N)");
		answer = reader.next();
		
		if(answer.equalsIgnoreCase("Y")) {
			totalPrice += 65.99;
		}
		
		System.out.println("Do you want a printer? (Y / N)");
		answer = reader.next();
		
		if(answer.equalsIgnoreCase("Y")) {
			totalPrice += 125;
		}
		
		//Devolvemos resultado
		System.out.println("Total price: " + totalPrice);
		
		reader.close();

	}

}
