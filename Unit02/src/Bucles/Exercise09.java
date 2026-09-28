package Bucles;

import java.util.Scanner;

public class Exercise09 {
	
	/*Realiza un programa que nos diga cuántos dígitos tiene un 
	 * número introducido por teclado. 
	 * El número introducido debe ser mayor que 0.
	 */
	
	public static void main(String[] args) {

        // Número introducido por el usuario
        int numero;

        // Número auxiliar para realizar las operaciones
        int numAux;

        // Contador de dígitos
        int contador = 0;

        // Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos número al usuario
        System.out.println("Introduzca un número mayor que 0:");
        numero = reader.nextInt();

        // Guardamos en la variable auxiliar el número introducido
        numAux = numero;

        // Bucle para contar los dígitos
        while (numAux > 0) {
            numAux /= 10;   // Eliminamos la última cifra
            contador++;     // Sumamos un dígito
        }

        // Mostramos el resultado
        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");

        // Cerramos scanner
        reader.close();
    }

}

