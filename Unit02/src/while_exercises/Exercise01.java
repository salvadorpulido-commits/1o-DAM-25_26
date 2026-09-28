package while_exercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		/*Escribe un programa que vaya pidiendo al usuario números enteros positivos 
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números, 
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará 
		 * la suma de los números positivos introducidos por el usuario.
		 * 2, 3, 6, -1: La suma es 11
		 */

	        //Variables
			int suma = 0;
			int numero;
			
			Scanner reader = new Scanner(System.in);
			
			// Pido un número
			System.out.println("Introduce un número:");
			numero = reader.nextInt();
			
			while(numero >= 0) {
				// Añadimos el valor de número a suma
				suma += numero;
				
				// Pido un número
				System.out.println("Introduce un número:");
				numero = reader.nextInt();
			} // Fin while
			
			System.out.println("La suma es: " + suma);
			
			reader.close();

		} // Fin main

	}// Fin clase

