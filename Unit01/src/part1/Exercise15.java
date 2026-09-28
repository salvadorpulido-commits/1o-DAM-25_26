package part1;

import java.util.Scanner;

public class Exercise15 {
	
	public static void main(String[] args) {
		
		/*
		 * Pedir precio al usuario
		 * mostrar el precio con el iva
		 */
		// Creamos el Scanner
				Scanner reader = new Scanner(System.in);

		// Constante para almacenar el valor del IVA
		final int IVA = 21;

		// Precio a leer de consola
		double precio;

		// Variable donde almacenar el precio total con el IVA incluido
		double precioConIVA;

		// Le pedimos el precio al usuario
		System.out.println("Introduzca el precio:");
		precio = reader.nextDouble();

		// Calculamos el precion con IVA incluido
		precioConIVA = precio + precio * IVA / 100;
		System.out.println("El precio con IVA es: " + precioConIVA);

		// Cerramos Scanner
		reader.close();

			}

		}