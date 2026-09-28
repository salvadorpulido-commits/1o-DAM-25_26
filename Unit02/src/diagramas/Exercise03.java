package diagramas;

import java.util.Scanner;

public class Exercise03 {

	
		
		public static void main(String[] args) {
			int num1;
			int num2;
			
			int suma;
			int resta;
			int multiplicacion;
			double division;
			
			Scanner reader = new Scanner(System.in);
			
			System.out.println("Introduzca un número:");
			num1 = reader.nextInt();
			
			System.out.println("Introduzca otro número:");
			num2 = reader.nextInt();
			
			suma = num1 + num2;
			resta = num1 - num2;
			multiplicacion = num1 *num2;
			
			System.out.println("La suma es: " + suma);
			System.out.println("La resta es: " + resta);
			System.out.println("La multiplicación es: " + multiplicacion);
			
			if(num2 == 0) {
				System.out.println("No se puede dividir por 0");
			} else {
				division = num1 / num2;
				System.out.println("La división es: " + division);
			}
			
			reader.close();

		}

	}