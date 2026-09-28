package doWhile;

import java.util.Scanner;

public class Exercise08 {
	
	/*Repetir el ejercicio de los dados del boletín de SWITCH. 
	 * Mientras en la primera tirada no se introduzca un valor 
	 * válido se le seguirá preguntando. 
	 *Lo mismo con la segunda tirada.
	 */


	public static void main(String[] args) {
		// Variable donde almacenar el valor del primer dado
				int dado1;

				// Variable donde almacenar el valor del segundo dado
				int dado2;

				// Variable donde almacenar la primera tirada escrita por el usuario
				String tirada1;

				// Variable donde almacenar la segunda tirada escrita por el usuario
				String tirada2;

				// Scanner
				Scanner reader = new Scanner(System.in);

				// PRIMERA TIRADA
				do {
					// Le pido al usuario la primera tirada
					System.out.println("Escriba el valor de la primera tirada:");
					tirada1 = reader.next();

					switch (tirada1) {
					case "UNO" -> dado1 = 1;
					case "DOS" -> dado1 = 2;
					case "TRES" -> dado1 = 3;
					case "CUATRO" -> dado1 = 4;
					case "CINCO" -> dado1 = 5;
					case "SEIS" -> dado1 = 6;
					default -> {
						System.out.println("Tirada errónea");
						dado1 = -1;
					}
					}
				} while (dado1 == -1);

				// SEGUNDA TIRADA
				do {
					// Le pido al usuario la primera tirada
					System.out.println("Escriba el valor de la segunda tirada:");
					tirada2 = reader.next();

					dado2 = switch (tirada2) {
					case "UNO" -> {yield 1;}
					case "DOS" -> {yield 2;}
					case "TRES" -> {yield 3;}
					case "CUATRO" -> {yield 4;}
					case "CINCO" -> {yield 5;}
					case "SEIS" -> {yield 6;}
					default -> {
						System.out.println("Tirada errónea");
						yield -1;
					}
					}; // PUNTO Y COMA DEL SWITCH
				} while (dado2 == -1);
				
				System.out.println("La suma de las dos tiradas es " + (dado1 + dado2));

				// Cierro el scanner
				reader.close();

			}

		}