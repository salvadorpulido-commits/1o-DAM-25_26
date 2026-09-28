package EjerciciosVarios;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Exception_ejemplo01 {

	public static void main(String[] args) {
	
		//Creamos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos edad al usuario
		System.out.println(" Introduce tu edad ");
		
		try {
			
			// --------
			// Bloque try
			//----------
			// Aqui va el codigo que puede fallar,
			//si cualquier instruccion de este bloque genera una excepcion,
			//Java va a saltar al bloque CATCH correspondiente
			
			int edad; 
			edad = sc.nextInt(); 
			
			assert (edad >= 0 && edad <= 130) : "Edad fuera del rango logico humano. ";
			
			//Si no hay error , llegamos aqui
			
			System.out.println("Registro completado correctamente ");
			System.out.println("Edad intoducida: " + edad);
			
		} catch (InputMismatchException e) {
			//Primer catch
			//este bloque captura errores del tipo InputMismatchException, es decir
			//cuando el usuario introduce algo que no es un nuero entero
			
			System.out.println("Error, debes introducir un numero entero valido" );
			
		} catch (AssertionError e) {
			//Segundo catch
			//Captura los errores de asercoin. Esto ocurre si la edad no esta 
			//dentro del rango definido
			
			System.out.println("Error de validacion interna " + e.getMessage());
					
		} catch (Exception e) {
		    //Ultimo catch (General)
			//CAptura cualquier otro tipo de excepcion no prevista en los casos anteriores
			System.out.println("Error no identificado ");
		} finally {
			//Bloque Finally
			//Se ejecuta siempre
			//Haya o no excepcion
			// SE hayan cumplido o no las aserciones
			//DA igual cuantos catch se ejecuten
			
			System.out.println("Cerrando recursos ....");
			sc.close();
		}
		    //Ya fuera de Try-catch-finally el programa se ejecuta normalmente
		
		System.out.println("Programa terminado!");
		
		
	}

}
