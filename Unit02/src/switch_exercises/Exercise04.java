package switch_exercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		/*
		 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que tiraría el usuario. 
		 * El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada 
		 * y el usuario le dará esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”).
		 * Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada 
		 * y el usuario también dará esa información en formato cadena.
		 * Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas 
		 * en formato numérico.
		 */
			
			    
		        Scanner reader = new Scanner(System.in);
		        int tirada1 = 0, tirada2 = 0;
		        String texto1, texto2;

		        System.out.print("¿Qué has sacado en la primera tirada? (UNO, DOS, TRES, CUATRO, CINCO, SEIS): ");
		        texto1 = reader.nextLine().toUpperCase();

		        switch (texto1) {
		            case "UNO": tirada1 = 1; break;
		            case "DOS": tirada1 = 2; break;
		            case "TRES": tirada1 = 3; break;
		            case "CUATRO": tirada1 = 4; break;
		            case "CINCO": tirada1 = 5; break;
		            case "SEIS": tirada1 = 6; break;
		            default:
		                System.out.println("Valor no válido en la primera tirada.");
		                reader.close();
		                return;
		        }

		        System.out.print("¿Qué has sacado en la segunda tirada? (UNO, DOS, TRES, CUATRO, CINCO, SEIS): ");
		        texto2 = reader.nextLine().toUpperCase();

		        switch (texto2) {
		            case "UNO": tirada2 = 1; break;
		            case "DOS": tirada2 = 2; break;
		            case "TRES": tirada2 = 3; break;
		            case "CUATRO": tirada2 = 4; break;
		            case "CINCO": tirada2 = 5; break;
		            case "SEIS": tirada2 = 6; break;
		            default:
		                System.out.println("Valor no válido en la segunda tirada.");
		                reader.close();
		                return;
		        }

		        int suma = tirada1 + tirada2;
		        System.out.println("La suma de las dos tiradas es: " + suma);

		        reader.close();
		    }

	}
