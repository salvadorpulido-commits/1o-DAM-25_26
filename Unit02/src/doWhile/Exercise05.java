package doWhile;

import java.util.Random;

import java.util.Scanner;

public class Exercise05 {
	
	/*Realiza un programa donde el usuario "piensa" un número 
	 * del 1 al 100 y el ordenador intenta adivinarlo. 
	 * Es decir, el ordenador irá proponiendo números una y otra vez 
	 * hasta adivinarlo (el usuario deberá indicarle al ordenador 
	 * si es mayor, menor o igual al número que ha pensado).
	 */

	public static void main(String[] args) {
Random rand = new Random();
		
		int numAleatorio;
		int min = 1;
		int max = 101;
		
		String respuesta;
		
		Scanner reader = new Scanner(System.in);
		
		do {
			numAleatorio = rand.nextInt(min, max);
			System.out.println("¿Es " + numAleatorio + "?");
			respuesta = reader.next();
			
			
		}while(!respuesta.equals("iguales"));
		
		
		reader.close();

	}

}
