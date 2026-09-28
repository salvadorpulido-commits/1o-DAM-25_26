package forexersises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variables
        int i;
        int numeroImpar;
        int suma = 0;

        // Recorremos los 10 primeros números impares
        for (i = 1; i <= 10; i++) {
            numeroImpar = (2 * i) - 1;
            suma = suma + numeroImpar;
            System.out.println("Número impar " + i + ": " + numeroImpar);
        }

        // Mostramos la suma total
        System.out.println("La suma de los 10 primeros números impares es: " + suma);

	    //Cerramos scanner
        
        reader.close();
        
	
	}

}

