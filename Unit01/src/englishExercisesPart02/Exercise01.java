package englishExercisesPart02;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		/*
		 * Implement in Java the next program:
		 * Begin
		 * Display program title
		 * Display prompt for price
		 * Enter price
		 * Display prompt for tax
		 * Enter tax
		 * Set price to price * (1 +tax/100)
		 * Display new price
		 * End
		 */

        //Creammos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		// Variable precio
		
		double price;
		
		//Variable impuesto
		
		int tax;
		
		//Nombramos programa
		
		System.out.println("TAX CALCULATOR");
		
		//Solicitamos importe
		
		System.out.println("Introduce the price");
		price = reader.nextDouble();
		
		//Solicitamos impuesto
		
		System.out.println("Introduce tax");
		tax = reader.nextInt();
		
		//Calcula el resultado
		
		price = price *(1 + tax/100);
		
		//Muestra el resultado
		
		System.out.println("The price with the tax is " + price);
		
		//Cerramos Scanner
		
		reader.close();
		
	}

}
