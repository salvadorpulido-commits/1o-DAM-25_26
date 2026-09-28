package conditional_exercises;

import java.util.Scanner;

public class Exercise01 {
	
	
	/*
	 * Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
	 * La aplicación tendrá que indicar si el número introducido es capicúa. 
	 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
	 */

	public static void main(String[] args) {
		
		//Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		//Declaramos variable numero
		
		int numero;
		
		//Pedimos al usuario que introduzca un numero
		
		System.out.println("Introduzca un numero ");
		numero = reader.nextInt();
		
		// Comprobamos que está en el rango válido
		
        if (numero < 0 || numero > 9999) {
        	
            System.out.println("Error: el número introducido está fuera del rango permitido (0-9999).");
        } else {
        	
            // Convertimos el número a cadena para compararlo más fácilmente
        	
            String numCadena = String.valueOf(numero);
            String invertido = new StringBuilder(numCadena).reverse().toString();
            
            // Comprobamos si es capicúa
            
            if (numCadena.equals(invertido)) {
                System.out.println("El número " + numero + " es capicúa.");
            } else {
                System.out.println("El número " + numero + " no es capicúa.");
            }
        }
				
		reader.close();
	}

}
