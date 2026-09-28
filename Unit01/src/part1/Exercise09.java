package part1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		/*
		 * Realizar una aplicación que solicite al usuario su edad 
		 * y le indique si es mayor de edad
		 * (mediante un literal booleano: true o false).
		 */
		
		//Creamos nuevo scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variable edad
		int edad = sc.nextInt();
		
		//Declaramos variable boolean
		boolean mayorEdad = edad >= 18;
		
		//Pedimos edad al usuario
		System.out.print("Introduce tu edad: ");
		edad = sc.nextInt();
		
		//Mostramos si la persona es mayor de edad
		System.out.println("¿Eres mayor de edad?: " + mayorEdad);
		
		
		//Cerramos scanner
		sc.close();
	}
}
