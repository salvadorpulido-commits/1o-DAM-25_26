package conditional_exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		/*
		 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios 
		 * (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. 
		 * La aplicación le pedirá al usuario que introduzca el resultado de la suma. 
		 * La aplicación le indicará si el resultado es correcto o no.
		 */
		
		//Clase para generar num aleatorios : Random
		
		Random aleatorio = new Random();
		
		// Variable aleatorio
		int num1 = aleatorio.nextInt(1, 100);
		
		//Segundo numero aleatorio
		int num2 = aleatorio.nextInt(1, 100);
		
		int sumaAleatorios = num1 + num2;
		
		int sumaUsuario;
		
		Scanner reader = new Scanner(System.in);
		
		//Pedimos al usuario dos numeros aleatorios
		
		System.out.println("Numero 1: " + num1);
		System.out.println("Numero 2: " + num2);
		
		//Preguntamos al usuario cuanto vale la suma
		
		System.out.println("Cuanto es la suma de: " + num1 + num2);
		sumaUsuario = reader.nextInt();
		
		//Comprobamos si lo introcido es correcto
		
		if(sumaUsuario == sumaAleatorios) {
			System.out.println("Has acertado ");
		} else {
			 System.out.println("Incorrecto. La suma correcta es " + (num1 + num2) + ".");
        }

        // Cerrar el Scanner
        reader.close();
    }
}
