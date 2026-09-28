package Bucles;

import java.util.Scanner;

public class Exercise03 {
	
	/*Para dos números dados, a y b, es posible calcular el 
	 * máximo común divisor (el número más grande que divide a ambos) 
	 * mediante un algoritmo ineficiente pero sencillo: 
	 * desde el menor de a y b, ir buscando, de forma decreciente (-1), 
	 * el primer número que divide a ambos simultáneamente. 
	 * Teniendo en cuenta lo que se acaba de explicar, 
	 * realiza un programa que calcule el máximo común divisor 
	 * de dos números.
	 */


	public static void main(String[] args) {
		// Primer numero
		int num1;

		// Segundo numero
		int num2;

		// Máximo común divisor
		int mcd = 1;

		// Variable donde almacenar el mínimo
		int min;

		// Variable donde ir guardando los divisores
		int divisor;

		// Scanner para leer los números
		Scanner reader = new Scanner(System.in);

		// Pedimos dos números al usuario
		System.out.println("Introduzca el primer número:");
		num1 = reader.nextInt();

		System.out.println("Introduzca el segundo número:");
		num2 = reader.nextInt();

		// Miramos cuál es el más pequeño
		min = Math.min(num1, num2);

		// Bucle for para recorrer desde el más pequeño de los dos números hasta 1,
		// restando 1 en cada vuelta
		for (int i = min; i >= 1; i--) {
			// Comprobamos si i divide a ambos números
			if (num1 % i == 0 && num2 % i == 0) {
				mcd = i;
			}
		}

		// Inicializamos el divisor al mínimo de ambos números
		divisor = min;
		// Mientras no lleguemos a 1 y el mcd siga siendo 1, es decir, no hemos
		// encontrado un divisor distinto de 1
		while (divisor > 1 && mcd == 1) {
			// Comprobamos si i divide a ambos números
			if (num1 % divisor == 0 && num2 % divisor == 0) {
				// Establecemos el valor para el mcd con el divisor común
				mcd = divisor;
			}

			// Decrementamos en 1 el divisor
			divisor--;
		}

		// Mostramos el resultado del mcd
		System.out.println("El m.c.d. de " + num1 + " y " + num2 + " es: " + mcd);

		// Cerramos Scanner
		reader.close();

	}

}
