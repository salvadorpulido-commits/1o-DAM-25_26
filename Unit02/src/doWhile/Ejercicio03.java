package doWhile;

import java.util.Scanner;

public class Ejercicio03 {
	
	/*Realiza un programa que sume los números desde el 1 
	 * hasta un número N que se introducirá por teclado. 
	 * Por ejemplo: Si el usuario introduce un 5, 
	 * el programa debe devolver la suma de 1+2+3+4+5. 
	 */


	public static void main(String[] args) {
		// Variable donde almacenar la suma total
		int suma = 0;

		// Contador que se le va a ir sumando a suma
		int contador = 1;

		// Número introducido por el usuario
		int numero;

		// Creamos scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		do {
			suma += contador;
			contador++;
		} while (contador <= numero); // ¡¡¡¡PUNTO Y COMA!!!!
		
		System.out.println("La suma total es: " + suma);
		
		// Cerramos el scanner
		reader.close();

	}

}