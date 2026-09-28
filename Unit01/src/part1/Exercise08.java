package part1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		/*
		 * *pedir nombre *pedir edad *mostrar mensaje
		 */

		// Creamos nuevo Scanner
		Scanner reader = new Scanner(System.in);

		//Declaramos variable nombre
		String nombre = reader.nextLine();
		
		//Declaramos variable edad
		int edad = reader.nextInt();
		
		//Pedimos nombre al usuario
		System.out.print("Introduce tu nombre: ");
		
		//Pedimos edad al usuario
		System.out.print("Introduce tu edad: ");
		
		//Mostramos mensaje
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		//Cerramos scanner
		reader.close();
		
	}
}
