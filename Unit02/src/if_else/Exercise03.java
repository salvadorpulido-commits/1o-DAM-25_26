package if_else;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Declaramos variables
		
		int a;
		int b;
		int c;
		
		double x1;
		double x2;
		double discriminante;
		
		//Abrimos Scanner
		
		Scanner reader = new Scanner(System.in);
		
		//Solicitamos los coeficientes
		
		System.out.println("Introduzca los coeficientes de la ecuacion");
		a = reader.nextInt();
		b = reader.nextInt();
		c = reader.nextInt();
		
		discriminante = b*b - 4*a*c;
		
		if(a==0) {
			//Tenemos una ecuacion de primer grado
			x1 = (double)-c / b;
			System.out.println("La ecuacion solo tienen una solucion: " +x1 );
			
		} else if(discriminante >=0) {
			//Si es positivo, tiene solucion y se aplica la formula
			x1 = (-b + Math.sqrt(discriminante)) / (2*a);
			x2 = (-b + Math.sqrt(discriminante)) / (2*a);
			System.out.println("x1= " + x1);
			System.out.println("x2= " + x2);
		} else {
			//Si es negativo no tiene solucion
			System.out.println("La ecuacion no tiene solucion");
			
		}
		reader.close();
	}

}
