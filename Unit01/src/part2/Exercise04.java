package part2;

import java.util.Scanner;

public class Exercise04 {
	
	public static void main(String[] args) {
	
	    /*Dado el siguiente polinomio de segundo grado:
        *y= ax2+bx+c, Crea un programa que pida los coeficientes 
        *a, b y c, así como el valor de x, 
        *y calcula el valor correspondiente de y.
        */
		
        // Creamos scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos variables
		
		double a;
		double b;
		double c;
		double x;
		double y;
						
		//Pedimos los coeficientes:
		
		System.out.print("Introduce el valor de a: ");
		a = sc.nextDouble();
		
		System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();
        
        System.out.print("Introduce el valor de c: ");
        c = sc.nextDouble();

        // Pedimos el valor de x
        System.out.print("Introduce el valor de x: ");
        x = sc.nextDouble();
        
        // Calculamos y = ax^2 + bx + c
        y = a * Math.pow(x, 2) + b * x + c;

        // Mostramos el resultado
        System.out.println("El valor de y para x = " + x + " es: " + y);

        sc.close();
		
		
	}

}
