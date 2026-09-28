package Bucles;

import java.util.Scanner;

public class Exercise08 {
	
	/*Realiza un programa que lea y acepte únicamente aquellos 
	 * que sean mayores que el último dado. 
	 * La introducción de números finaliza con la introducción de un 0. 
	 * Al final se mostrará:
	 * El total de números introducidos, excluido el 0.
     * El total de números fallados.
	 */

	public static void main(String[] args) {
		
		// Número introducido por el usuario
        int numero;

        // Último número aceptado
        int ultimo;

        // Contador de números introducidos
        int total = 0;

        // Contador de fallos
        int fallos = 0;

        // Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos el primer número (inicial)
        System.out.println("Dime un número inicial:");
        ultimo = reader.nextInt();

        // Contamos el número inicial como válido
        total++;

        // Bucle para pedir números hasta que se introduzca un 0
        System.out.println("Dime un número:");
        numero = reader.nextInt();

        while (numero != 0) {

            // Comprobamos si es mayor que el último aceptado
            if (numero > ultimo) {
                // Aceptado
                ultimo = numero;
                total++;
            } else {
                // Fallo
                System.out.println("Fallo, es menor");
                fallos++;
            }

            // Pedimos de nuevo
            System.out.println("Dime un número:");
            numero = reader.nextInt();
        }

        // Resultados finales
        System.out.println("Total de números introducidos: " + total);
        System.out.println("Números fallados: " + fallos);

        // Cerramos scanner
        reader.close();
    }
}
