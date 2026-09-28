package while_exercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		// Variables

		double altura;
		double alturaMaxima;

		// Abrimos scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos altura
		System.out.println("introduce altura ");
		altura = reader.nextDouble();

		// Le asignamos a alturaMaxima la primera altura introducida
		alturaMaxima = altura;

		// Mientras la altura introducida sea distinta de -1

		while (altura != -1) {
        //Si la altura introducida es mayor que la maxima almacenada, utilizo la maxima
			if (altura > alturaMaxima) {
				alturaMaxima = altura;

			} // Fin if

			// Pedimos altura
			System.out.println("introduce altura ");
			altura = reader.nextDouble();

		} // Fin while
		
		//Comprobamos si la altura maxima es distinto de -1
		//Este caso se dara cuando la primera altura introducida sea -1

		if (alturaMaxima != -1) {
			System.out.println("la altura maxima es:" + alturaMaxima);
		} else {
			System.out.println("No se a introducido ninguna altura maxima ");
		}
		
		//Cerramos Scanner
		reader.close();

	}

}
