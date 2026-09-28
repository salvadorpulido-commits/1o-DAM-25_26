package part1;

import java.util.Scanner;

public class Exercise06 {
	
    public static void main(String[] args) {
    	/*Escribir un programa que le pida dos números al usuario. 
    	 * A continuación, debe mostrar la suma, la resta, la multiplicación y la división de ambos números. 
    	 * Debe mostrarse el resultado de cada operación en una línea distinta.
    	*/
    	
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el primer numero al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        
        //Pedimos el segundo numero al usuario
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        //Hacemos las operaciones cada una en una linea distinta
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        
        //Cerramos Scanner
        sc.close();
    }
}
