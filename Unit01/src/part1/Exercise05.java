package part1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
	    //radio de la circunferencia
		double radio;
		
		//Longitud de la circunferencia
		double longitud;
		
		//area de la circunferencia
		double area;
		
		//creacion de la circunferencia
		Scanner reader = new Scanner(System.in);
		
		//introduce el radio
		System.out.println("Introduce el radio de la circunferencia");
		radio = reader.nextDouble();// En este paso el usuario introduce el radio
	
		
		//Calculamos la longitud de la circunferencia
		longitud = 2*Math.PI*radio;
		
		//Calculamos el area de la circunferencia
	    area = Math.PI*Math.pow(radio, 2);
		
		//Mostramos en pantalla el resultado de la longitud y el area
		System.out.println("la longitud de la circunferencia es " + longitud);
		System.out.println("el area de la circunferencia es " + area);
		
		//Cerramos scanner
		reader.close();
				
	}
}