package Bucles;

import java.util.Scanner;

public class Exercise05 {
	
	/*Realiza un programa que pida un número entero N 
	 * entre 0 y 20 y luego muestre por pantalla los números 
	 * desde 1 hasta N, uno en cada línea, repitiendo cada número 
	 * tantas veces como su valor.
	 */

		public static void main(String[] args) {

	        // Número introducido por el usuario
	        int n;

	        // Contadores para los bucles
	        int i;
	        int j;

	        // Scanner para leer el número
	        Scanner reader = new Scanner(System.in);

	        // Pedimos el número N
	        System.out.println("Introduzca un número entre 0 y 20:");
	        n = reader.nextInt();

	        // Bucle para mostrar desde 1 hasta N
	        for (i = 1; i <= n; i++) {

	            // Bucle para repetir el número i tantas veces como su valor
	            for (j = 1; j <= i; j++) {
	                System.out.print(i);
	            }

	            // Salto de línea después de cada número
	            System.out.println();
	        }

	        // Cerramos Scanner
	        reader.close();
	    }
	}
