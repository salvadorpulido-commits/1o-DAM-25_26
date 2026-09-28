package part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
        //Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Creamos variables
		
		int numero;
		int numASumar;
		int resto;
			
		// Pedimos numero
		
		System.out.println("Introduzca un número:");
		numero = sc.nextInt();
        
		//Calculamos
		resto = numero % 7;
		
		numASumar = (resto == 0) ? 0 : (7-resto) ;
		
		// Mostramos solucion		
		System.out.println("La cantidad a sumar es: " + numASumar);
        
		//Cerramos Scanner
		sc.close();

	}

}