package part2;

import java.util.Scanner;

public class Exercise06 {
	
	/*Solicita al usuario tres distancias:
     *La primera, medida en milímetros.
     *La segunda, medida en centímetros.
     *La última, medida en metros.
     *Diseña un programa que muestre la suma de las tres longitudes introducidas 
     *(medida en centímetros).
     */
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        // Variables
        double mmEnCm = mm * 0.1;   // milímetros a centímetros
        double mEnCm = m * 100;     // metros a centímetros

        // Solicitar distancias
        System.out.print("Introduce la primera distancia (en milímetros): ");
        double mm = sc.nextDouble();

        System.out.print("Introduce la segunda distancia (en centímetros): ");
        double cm = sc.nextDouble();

        System.out.print("Introduce la tercera distancia (en metros): ");
        double m = sc.nextDouble();


        // Suma total en centímetros
        double sumaCm = mmEnCm + cm + mEnCm;

        // Resultado
        System.out.println("La suma total de las longitudes es: " + sumaCm + " cm");

        sc.close();
    }
}
	  
		