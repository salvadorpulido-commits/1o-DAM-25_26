package part1;

import java.util.Scanner;

public class Exercise03 {
	
    public static void main(String[] args) {
    	
    	// Crear un escáner para leer datos del usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir el año actual al usuario
        System.out.print("Introduce el año actual: ");
        
        // Declaramos la variable año
        int actual = sc.nextInt();
        
        // Pedimos al usuario su año de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        
        // La consola espera un valor
        int nacimiento = sc.nextInt();
        
        // La consola calcula las variables
        int edad = actual - nacimiento;
        
        // Imprime el resultado
        System.out.println("Tienes " + edad + " años.");
        
        // Cerramos el Scanner
        sc.close();
    }
}
