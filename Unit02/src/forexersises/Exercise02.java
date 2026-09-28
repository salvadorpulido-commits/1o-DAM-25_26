package forexersises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		/*Realiza un programa que cuente los múltiplos de 3 desde el 1 
		 * hasta un número que introducimos por teclado.
		 */

		//Abrimos Scanner
	    Scanner reader = new Scanner(System.in);
	    
	 // Declaración de variables
        int n;
        int i;
        int contador = 0;
        
        // Pedimos el número al usuario
        System.out.print("Introduce un número: ");
        n = reader.nextInt();

        // Recorremos los números del 1 al n
        for (i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
                System.out.println(i + " es múltiplo de 3");
            }
        }
	    
	    reader.close();
	
	}
}
