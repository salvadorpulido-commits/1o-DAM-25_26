package part1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre 
		 * (notas enteras que se solicitarán al usuario). 
		 * El programa debe mostrar la nota media del curso 
		 * como se utiliza en el boletín de calificaciones 
		 * (solo la parte entera) y como se usa en el expediente académico 
		 * (con decimales).
		 */

		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variables de notas de los 3 trimestres
		
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		
		//Pedimos las notas de los tres trimestres por separado
		
		System.out.print("Nota primer trimestre: ");
		nota1 = sc.nextInt();
				
		System.out.print("Nota segundo trimestre: ");
		nota2 = sc.nextInt();
		
		System.out.print("Nota tercer trimestre: ");
		nota3 = sc.nextInt();
		
        //Calculamos la media con parte entera
		int mediaEntera = (nota1 + nota2 + nota3) / 3;
		
		//Calculamos la media con parte decimal
		double mediaDecimal = (nota1 + nota2 + nota3) / 3.0;
        
		//Mostramos el resultado en consola
		System.out.println("Media boletín (entera): " + mediaEntera);
		System.out.println("Media expediente (decimal): " + mediaDecimal);
		
		//Cerramos scanner
		sc.close();
	}
}
