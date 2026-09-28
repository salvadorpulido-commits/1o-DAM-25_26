package part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		/* Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
		 * La aplicación debe mostrar cuántas horas, minutos y segundos 
		 * hay en el número de segundos introducidos por el usuario.
		 */
		
		// Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		// Cálculos
        int horas;    // 1 hora = 3600 segundos
        int minutos; // El resto de dividir entre 3600 lo pasamos a minutos
        int segundos; // Lo que sobra son los segundos
				
		// Pedir la cantidad de segundos
        System.out.print("Introduce una cantidad de segundos: ");
        int segundosTotales = sc.nextInt();

        
        // Mostrar el resultado
        System.out.println(segundosTotales + " segundos equivalen a: ");
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

        // Cerramos scanner
        sc.close();
		

	}

}
