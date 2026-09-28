package diagramas;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor.

		
		        //Abrimos Scanner para leer desde teclado
		
		        Scanner reader = new Scanner(System.in);

		        //Pedimos al usuario los dos números
		        
		        System.out.print("Introduce el primer número: ");
		        int numero1 = reader.nextInt();

		        System.out.print("Introduce el segundo número: ");
		        int numero2 = reader.nextInt();

		        //Comparar los números y mostrar el mayor
		        
		        if (numero1 > numero2) {
		            System.out.println("El número mayor es: " + numero1);
		        } else if (numero2 > numero1) {
		            System.out.println("El número mayor es: " + numero2);
		        } else {
		            System.out.println("Ambos números son iguales.");
		        }

		        //Cerramos el Scanner
		        
		        reader.close();
		    }
	
	}
