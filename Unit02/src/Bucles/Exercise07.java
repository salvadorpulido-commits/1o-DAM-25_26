package Bucles;

import java.util.Scanner;

public class Exercise07 {
	
	/*Escribe un programa que lea un número n e imprima 
	 * una pirámide de números con n filas como en la siguiente figura:
	 * 1
	 * 121
	 * 12321
	 * 1234321
	 */		

	public static void main(String[] args) {
		
		// Número de filas
        int n;

        // Contadores
        int i;
        int j;

        // Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos numero de filas
        System.out.println("Introduzca un número:");
        n = reader.nextInt();

        // Bucle principal para cada fila
        for (i = 1; i <= n; i++) {

            // Parte ascendente 1, 2, 3, ..., i
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Parte descendente (i-1, i-2, ..., 1)
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Salto de línea
            System.out.println();
        }

        // Cerramos scanner
        reader.close();
    }
}
		