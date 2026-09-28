package part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que tome como entrada un número entero 
		 * e indique qué cantidad hay que sumarle para que sea múltiplo de 7. 
		 * Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. 
		 * En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo.
		 */
				
        //Creamos scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variables
		
		int num = sc.nextInt();
		int resto = num % 7;
		int cantidad = (resto == 0) ? 0 : 7 - resto;
				
		//Pedimos numero entero
		System.out.print("Introduce un número entero: ");
		
		//Obtenemos el resultado
		System.out.println("Hay que sumarle " + cantidad + " a " + num + " para que sea múltiplo de 7.");
		
		
        //Cerramos scanner
		sc.close();
		
		    }
		}