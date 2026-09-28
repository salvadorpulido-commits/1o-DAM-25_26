package Bucles;

import java.util.Scanner;

public class Exercise06 {
	
	/*Solicita al usuario un número n y dibuja 
	 * un triángulo de base y altura n. 
	 * Por ejemplo para n=4 debe dibujar lo siguiente:
	 *        *
     *       * *
	 *      * * *
	 *     * * * *
	 */
   
	public static void main(String[] args) {
		 // Número introducido por el usuario
        int n;

        // Contadores
        int i;
        int j;

        // Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos número
        System.out.println("Introduzca un número:");
        n = reader.nextInt();

        // Bucle para las filas
        for (i = 1; i <= n; i++) {

            // Espacios a la izquierda (n - i)
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos con espacio
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Salto de línea
            System.out.println();
        }

        // Cerramos scanner
        reader.close();
        
    }
}