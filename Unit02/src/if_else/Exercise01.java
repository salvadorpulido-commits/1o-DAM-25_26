package if_else;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/*Diseñar una aplicación que solicite al usuario 
		 * un número e indique si es par o impar.
		 */
		
					
		// Creamos un Scanner para leer datos del usuario
		
        Scanner reader = new Scanner(System.in);

        // Solicitar número al usuario
        
        System.out.print("Introduce un número: ");
        int numero = reader.nextInt();

        // Verificar si es par o impar
        
        if (numero % 2 == 0) {
        	
            System.out.println("El número " + numero + " es PAR.");
        } else {
        	
            System.out.println("El número " + numero + " es IMPAR.");
        }

        // Cerrar el Scanner
        reader.close();
    }
	
}
