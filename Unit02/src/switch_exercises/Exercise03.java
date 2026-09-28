package switch_exercises;

import java.util.Scanner;

public class Exercise03 {
	
	/*Escribe un algoritmo que le pida al usuario dos números. 
	 * A continuación debe mostrar el siguiente menú por pantalla:
	 * A - SUMAR LOS NÚMEROS
     * B - RESTAR LOS NÚMEROS
     * C - MULTIPLICAR LOS NÚMEROS
     * D - DIVIDIR LOS NÚMEROS
     *Después, el algoritmo debe pedirle al usuario que seleccione una opción 
     *y que haga la operación que marca esa opción, 
     *mostrando por último el resultado de la operación elegida por el usuario. 
     *Si el usuario elige una opción incorrecta, 
     *el algoritmo se lo hace saber al usuario	y no haría nada.
	 */

	public static void main(String[] args) {
		//Declaramos variables 
		
		double num1;
		double num2;
		double resultado;
		String opcion;
		
		
		Scanner reader = new Scanner(System.in);

		//Pedimos que introduzca dos numeros       
		
		System.out.print("Introduce el primer numero: ");
		num1 = reader.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		num2 = reader.nextDouble();
		
        //Mostrar el menú
        
        System.out.println("A. Sumar los numeros");
        System.out.println("B. Restar los numeros");
        System.out.println("C. Multiplicar los numeros");
        System.out.println("D. Dividir los numeros");

        //Pedir la opcion
        System.out.print("Selecciona una opcion (A-D): ");
        
        opcion = reader.next().toUpperCase();

        //Realizar operacion segun la opcion elegida
        switch (opcion) {
            case "A":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "B":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "C":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "D":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre 0.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        reader.close();
        }
        
	}
			
