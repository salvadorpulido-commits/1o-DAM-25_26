package forexersises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Pedir diez números por teclado y mostrar la media.

		// Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		//Variables
		
		// Declaración de variables
		
        int i;
        double numero;
        double suma = 0;
        double media;
		
		// Pedimos un numero al usuario
		
        for (i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = reader.nextDouble();
            suma = suma + numero;
        }
        
        // Calculamos la media
        media = suma / 10;

        // Mostramos el resultado
        System.out.println("La media de los 10 números es: " + media);

	
    	//Cierre del scanner
		
		reader.close();
	}

}
