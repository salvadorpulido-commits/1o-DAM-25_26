package if_else;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		/*
		 * Implementar un programa que pida por teclado un número decimal 
		 * e indique si es un número casi-cero, que son aquellos, positivos o negativos, 
		 * que se acercan a 0 por menos de 1 unidad, aunque curiosamente 
		 * el 0 no se considera un número casi-cero. 
		 * Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), 
		 * donde se excluye el -1, el 0 y el 1.
		 */
		
		// Creamos un Scanner para leer datos del usuario
		
		Scanner reader = new Scanner(System.in);
		
		// Solicitar número decimal
		
        System.out.print("Introduce un número decimal: ");
        double numero = reader.nextDouble();

        // Verificar si es un número casi-cero
        
        if (numero > -1 && numero < 1 && numero != 0) {
        	
            System.out.println("El número " + numero + " es un número casi-cero.");
            
        } else {
            System.out.println("El número " + numero + " NO es un número casi-cero.");
        }

        //Cerramos Scanner
        reader.close();
    }
	
}
