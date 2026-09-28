package doWhile;

import java.util.Scanner;

public class Exercise07 {
	
	/*Repetir el ejercicio de la calculadora del boletín de SWITCH 
	 * de forma que se añada una opción más al menú, quedando 
	 * el menú así:
	 * SUMAR LOS NÚMEROS
     *RESTAR LOS NÚMEROS
     *MULTIPLICAR LOS NÚMEROS
     *DIVIDIR LOS NÚMEROS
     *SALIR
     *De forma que se vuelva a pedir los dos números y la operación 
     *a realizar hasta que se pulse la letra E para salir del programa.
	 */


	public static void main(String[] args) {
		// Variable donde almacenar el primer número
				double num1;

				// Variable donde almacenar el segundo número
				double num2;

				// Variable donde almacenar la opción
				String opcion;

				// Variable donde almacenar el resultado de la operación
				double resultado = 0;

				// Scanner
				Scanner reader = new Scanner(System.in);

				do {
					// Le pido dos números al usuario
					System.out.println("Introduzca el primer número");
					num1 = reader.nextDouble();

					System.out.println("Introduzca el segundo número");
					num2 = reader.nextDouble();

					do {
						System.out.println("A. SUMAR");
						System.out.println("B. RESTAR");
						System.out.println("C. MULTIPLICAR");
						System.out.println("D. DIVIDIR");
						System.out.println("E. SALIR");

						opcion = reader.next().toUpperCase();

						switch (opcion) {
						case "A" -> {
							resultado = num1 + num2;
							System.out.println("Resultado: " + resultado);
						}
						case "B" -> {
							resultado = num1 - num2;
							System.out.println("Resultado: " + resultado);
						}
						case "C" -> {
							resultado = num1 * num2;
							System.out.println("Resultado: " + resultado);
						}
						case "D" -> {
							if (num2 != 0) {
								resultado = num1 / num2;
								System.out.println("Resultado: " + resultado);
							} else {
								System.out.println("No se puede dividir por 0");
							}
						}
						case "E" -> System.out.println("SALIENDO...");
						default -> {
							System.out.println("OPCIÓN ERRÓNEA");
							opcion = "Z";
						}
						}
					} while (opcion.equals("Z"));
					
					
				} while (!opcion.equals("E"));

				// Cerramos Scanner
				reader.close();
		}

}
