package part1;

import java.util.Scanner;

public class Exercise07 {
	
	public static void main(String[] args) {
	
		/*
		 * *pedir nombre
		 * *pedir direccion
		 * *pedir telefono
		 * *imprimir en lineas diferentes
		 */

		//Creamos nuevo scanner
		Scanner reader = new Scanner(System.in);
		
		//Declaramos las variables
		String nombre;
		String direccion;
		String telefono;
		
		//Pedimos datos
		System.out.println("Introduzca su nombre");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca su direccion");
		direccion = reader.nextLine();
		
		System.out.println("Introduzca su telefono");
		telefono = reader.nextLine();
		
		//Imprimimos por lineas diferentes
		System.out.println("Nombre introducido: " + nombre);
		System.out.println("Nombre introducido: " + direccion);
		System.out.println("Nombre introducido: " + telefono);
		
		//Cerramos scanner
		reader.close();
		
	}
}
