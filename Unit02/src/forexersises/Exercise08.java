package forexersises;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		/* Realiza un programa que pida dos números enteros A y B. 
		 * Luego visualiza los números que hay entre A y B. 
		 * Si A es menor que B, entonces debe mostrar los números 
		 * desde A hasta B. 
		 * Si B es menor que A, entonces debe mostrar los números 
		 * desde B hasta A.
		 */
		
		//Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		// Declaramos variables
		
        int a;
        int b;
        int i;
        
        // Pedimos los dos números al usuario
        System.out.print("Introduce el primer número (A): ");
        a = reader.nextInt();

        System.out.print("Introduce el segundo número (B): ");
        b = reader.nextInt();

        // Comprobamos cuál es mayor y mostramos los números entre ambos
        if (a < b) {
            System.out.println("Números entre " + a + " y " + b + ":");
            for (i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else if (b < a) {
            System.out.println("Números entre " + b + " y " + a + ":");
            for (i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Los números son iguales, no hay números entre ellos.");
        }


	}

}
