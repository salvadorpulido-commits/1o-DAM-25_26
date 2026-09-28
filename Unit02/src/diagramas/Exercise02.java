package diagramas;

import java.util.Scanner;

public class Exercise02 {
	
	public static void main(String[] args) {
	
		// Abrimos scanner
		Scanner reader = new Scanner(System.in);
		
		//Variable edad
	    int edad;
	    
	 	// Pedimos introducir edad
	    System.out.println("Introduzca su edad");
	    edad = reader.nextInt();
	
	    //Calcula e imprime un resultado u otro
	    if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
	    
	    // Cerramos el scanner
        reader.close();
    }
}