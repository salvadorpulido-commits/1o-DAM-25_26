package if_else;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		/*
		 * Escribir un programa que pida al usuario tres números enteros, 
		 * y que muestre por pantalla si la suma de dos de esos números 
		 * da como resultado el otro número.
		 */
		
		
		//Declaramos variables
		
		int num1;
		int num2;
		int num3;
		
		//Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca los numeros
		
		System.out.println("Introduce el primer número:");
		num1 = reader.nextInt();
		
		System.out.println("Introduce el segundo número:");
		num2 = reader.nextInt();
		
		System.out.println("Introduce el tercer número:");
		num3 = reader.nextInt();
		
		//Ejecutamos y mostramos mensaje por pantalla
		
		if (num1 + num2 == num3) {
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);
		} else if (num1 + num3 == num2) {
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);
		} else if (num2 + num3 == num1) {
			System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);
		} else {
			System.out.println("Ninguna suma de dos números es igual al tercero.");
		}
		
		//Cerramos Scanner
		
		reader.close();
	}
}
