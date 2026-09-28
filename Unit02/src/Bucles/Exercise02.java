package Bucles;

import java.util.Scanner;

public class Exercise02 {

	/*Realiza un programa que nos pida un número n 
	 * y nos diga cuántos números hay entre 1 y n que sean primos.
	 */

	
	public static void main(String[] args) {
		
		// Contador para saber cuántos primos hay
				int cuentaPrimos = 0;
				
				// Número introducido por el usuario
				int num;
				
				// Variable para el while que comprueba si el número es primo
				int divisor;
				
				// Variable para indicar si un número es primo
				boolean esPrimo;
				
				// Scanner para leer del teclado
				Scanner reader = new Scanner(System.in);
				
				// Le pedimos un número al usuario
				System.out.println("Introduce un número");
				num = reader.nextInt();
				
				// Recorremos todos los números del 2 hasta num
				for(int cont = 2; cont<=num; cont++) {
					// Inicializamos el divisor a 2
					divisor = 2;
					
					// volvemos a poner esPrimo a true
					esPrimo = true;
					
					// comprobamos si cont es primo
					while(divisor < cont && esPrimo) {
						if(cont % divisor == 0) {
							esPrimo = false;
						}
						divisor++;
					} // fin while
					
					// Miramos si el número es primo
					if(esPrimo) {
						cuentaPrimos++;
					} // fin if esPrimo
					
				} // fin for
				
				// Imprimimos cuántos primos hay
				System.out.println("Hay " + cuentaPrimos + " números primos");
				
				// Cerramos scanner
				reader.close();

			} // fin main

		} // fin clase