package forexersises;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		/*Realiza un programa en java que pida un número 
		 * entero positivo y nos diga si es primo o no.
		 */
		
		//Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
		
        int numero;
        int i;
        boolean esPrimo = true;
     
        // Pedimos el número al usuario
        System.out.print("Introduce un número entero positivo: ");
        numero = reader.nextInt();

        // Comprobamos si el número es primo
        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; 
        // si encontramos un divisor, salimos del bucle
                }
            }
        }

        // Mostramos el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
		
		// Cerramos Scanner
		
		reader.close();

	}

}
