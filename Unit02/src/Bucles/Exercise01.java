package Bucles;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/* Escribe un programa que incremente la hora de un reloj. 
		 * Se pedirán por teclado:
		 * Hora
         * Minutos
         * Segundos
         * Cantidad de segundos a incrementar
         * La aplicación debe mostrar la nueva hora. 
         * Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, 
         * y se desea incrementar en 10 segundos, el resultado a mostrar es 14:00:01.
		 */
		
			// Variable para las horas
			int horas = 20;

			// Variable para los minutos
			int min = 59;

			// Variable para los segundos
			int sec = 55;

			// Cantidad de segundos a sumar
			int secSumar = 10;

			// Scanner para leer datos
			Scanner reader = new Scanner(System.in);

			for (int i = 1; i <= secSumar; i++) {
				sec++;

				if (sec == 60) {
					sec = 0;
					min++;
					if (min == 60) {
						min = 0;
						horas++;
						if (horas == 24) {
							horas = 0;
						}
					}
				}
			}

			if (horas < 10) {
				System.out.print("0");
			}
			System.out.print(horas + ":");
			if (min < 10) {
				System.out.print("0");
			}
			
			System.out.print(min + ":");
			
			if (sec < 10) {
				System.out.print("0");
			}
			
			System.out.println(sec);
			reader.close();

		}

	}
