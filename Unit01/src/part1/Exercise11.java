package part1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		/*
		 * /*Realiza un conversor de pesetas a euros.
		 * pide al usuario que te introduzca el valor en pesetas 
		 * y muestrale el resultado de la conversion
		 * (1€ = 166 ptas).
		 */

		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
				
		//Declaramos variable pesetas
		double pesetas = sc.nextDouble();
		
		//Declaramos variable euros
		double euros = pesetas / 166.0;
		
		//Pedimos al usuario introducir la cantidad a convertir
		System.out.print("Introduce la cantidad en pesetas: ");
		pesetas = sc.nextDouble();
		
		//Devolvemos resultado
		System.out.println("Equivale a " + euros + " euros.");
		
		//Cerramos scanner
		sc.close();
	}
}
