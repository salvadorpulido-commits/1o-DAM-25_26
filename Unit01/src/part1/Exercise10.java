package part1;

import java.util.Scanner;

public class Exercise10 {
	
	public static void main(String[] args) {
		/*
		 * 1 Pedir un numero al usuario
		 * 2 compuebo si es par
		 * 3 imprimo el mensaje
		 */
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		//Declaramos variables
		int numero;
		boolean esPar;
		String cadenaEsPar;
		
		// Pedimos un numero al usuario
		System.out.println("introduzca su numero:");
		numero = reader.nextInt();
		
		// Comprobamos si el numero es par
		cadenaEsPar = (numero%2 == 0) ? "Si" : "No";
		
		// Imprimimos si el numero es par o impar
		System.out.println("¿El numero es par?" + cadenaEsPar);
		
	    // Cerramos el scanner
		reader.close();
								
	}
}
