package part2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
        /*
         * Realizar un programa que pida como entrada un número con decimales
         * y lo muestre redondeado al entero más próximo.
         * SIN UTILIZAR Math.round
         */
		
		//creamos scanner
		
		Scanner reader = new Scanner(System.in);
		
		//Pedimos numero con decimales
		
		System.out.print("Introduce un número decimal: ");
		
		//Leemos el numero que ha añadido el usuario y guardamos la variable
		
        double numero = reader.nextDouble();
        
        //Aplicamos Math.floor(numero) para obtener la parte entera hacia abajo del número.        
        
        int entero = (int) Math.floor(numero);
        
        //hacemos un casting a entero para quitar la parte decimal y guardarlo en entero.
        
        int redondeado = (numero - entero) >= 0.5 ? entero + 1 : entero;
        
        //Imprimimos por pantalla
        
        System.out.println("Número redondeado: " + redondeado);
        
        // Cerramos Scanner

        reader.close();
        
        
        
        
        
        
        

		
	}

}
