package Bucles;

import java.util.Scanner;

public class Exercise10 {
	
	/*Realiza un programa que nos diga si un número 
	 * introducido por teclado es capicúa o no. 
	 * El número debe ser mayor o igual que 0.
	 */


    public static void main(String[] args) {

        // Número introducido por el usuario
        int numero;

        // Número con cifras invertidas
        int numeroInvertido = 0;

        // Número auxiliar para realizar las operaciones
        int numAux;

        // Última cifra del número
        int ultimaCifra;

        // Scanner para leer el número al usuario
        Scanner reader = new Scanner(System.in);

        // Pedimos número al usuario
        System.out.println("Introduzca un número: ");
        numero = reader.nextInt();

        // Guardamos en la variable auxiliar el número introducido por el usuario
        numAux = numero;

        // Bucle para invertir el número
        while (numAux > 0) {
            ultimaCifra = numAux % 10;
            numeroInvertido = numeroInvertido * 10 + ultimaCifra;
            numAux /= 10;
        }

        // Comprobación capicúa
        System.out.println(numeroInvertido == numero ? "Es capicúa" : "No es capicúa");

        // Cerramos scanner
        reader.close();

    }

}
