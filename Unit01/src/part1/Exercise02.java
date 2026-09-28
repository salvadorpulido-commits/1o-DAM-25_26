package part1;

import java.util.Scanner;

public class Exercise02 {
	
	public static void main(String[] args) {
		
		// Crear un escáner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir la edad al usuario
        System.out.print("Por favor, ingresa tu edad actual: ");
        int edadActual = sc.nextInt();

        // Calcular la edad del próximo año
        int edadProximoAno = edadActual + 1;
        
        // Mostrar el resultado
        System.out.println("El próximo año tendrás " + edadProximoAno + " años.");

        // Cerrar el escáner
        sc.close();
        
    }
	
}

