package part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variable to store a number
		int number;
		
		//Ask the user a number
		System.out.print("Introduce un número: ");
	    number = sc.nextInt();
	     
	    //Show the number
	    System.out.println("El número que introdujiste es: " + number);
	    
	    //Close Scanner
	    sc.close();
	    
	  }
	
}
