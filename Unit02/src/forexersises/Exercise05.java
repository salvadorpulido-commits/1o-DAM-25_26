package forexersises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		// Variables

		int cont;
		int numero;
		long factorial = 1;

		// Abrimos Scanner

		Scanner reader = new Scanner(System.in);

		// Pedimos un numero al usuario

		System.out.println("Introduzca un numero");
		numero = reader.nextInt();

		for (cont = numero; cont >= 1; cont--) {
			// 5*4*3*2*1
			System.out.print(cont);
			if (cont != 1) {
				// Solo imprimimos * si no es 1
				System.out.print("*");
			}
			// VAmos calculando el factorial
			factorial *= cont;
		}

		// Imprimimos el factorial
		System.out.println("=" + factorial);

		// Cerramos Scanner

		reader.close();

	}

}
