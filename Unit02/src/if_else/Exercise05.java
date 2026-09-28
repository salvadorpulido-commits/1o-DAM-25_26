package if_else;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		/**
		 * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, 
		 * pidiendo a cada jugador que escriba PIEDRA, PAPEL o TIJERA. 
		 * El juego debe mostrar por pantalla quién ha ganado el juego tras jugar una partida. 
		 * Hay que contemplar el caso de que empaten.
		 */
				
		//Declaramos variables y constantes
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		String jugada1;
		String jugada2;
		
		//Abrimos Scanner
		Scanner reader = new Scanner(System.in);
		jugada1 = reader.next();
		jugada2 = reader.next();
		
		//Comenzamos jugadas e imprimimos resultados
		if (jugada1.equals(jugada2)) {
		} else if (jugada1.equals("PIEDRA") && jugada2.equals("TIJERAS")) {
			System.out.println("Gana el jugador 1");
		} else if (jugada1.equals("PAPEL") && jugada2.equals("PIEDRA")) {
			System.out.println("Gana el jugador 1");
		} else if (jugada1.equals("TIJERAS") && jugada2.equals("PAPEL")) {
			System.out.println("Gana el jugador 1");
		} else if (jugada2.equals("PIEDRA") && jugada1.equals("TIJERAS")) {
			System.out.println("Gana el jugador 2");
		} else if (jugada2.equals("PAPEL") && jugada1.equals("PIEDRA")) {
			System.out.println("Gana el jugador 2");
		} else if (jugada2.equals("TIJERAS") && jugada1.equals("PAPEL")) {
			System.out.println("Gana el jugador 2");
		} else {
			System.out.println("Error al escribir PIEDRA, PAPEL o TIJERAS.");
		 }
		
		//Cerramos Scanner	
				reader.close();
				}
			}
