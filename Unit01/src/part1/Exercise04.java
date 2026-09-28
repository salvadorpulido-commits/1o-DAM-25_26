package part1;

import java.util.Scanner;

public class Exercise04 {
	
    public static void main(String[] args) {
    	
    	// Creamos nuevo  scanner
        Scanner sc = new Scanner(System.in);
        
        // Pedimos la primera nota al usuario
        System.out.print("Introduce la primera nota: ");
        int nota1 = sc.nextInt();
        
        // Pedimos la segunda nota al usuario
        System.out.print("Introduce la segunda nota: ");
        int nota2 = sc.nextInt();
        
        // Calculamos la media de las dos notas, indicando que puede tener decimales
        double media = (nota1 + nota2) / 2.0;
        
        // Imprimimos resultado
        System.out.println("La media es: " + media);
        
        // Cerramos Scanner
        sc.close();
        
    }
    
}
