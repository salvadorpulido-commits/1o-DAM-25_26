package switch_exercises;

import java.util.Scanner;

public class Exercise02 {
	
	/*Idear un programa que solicite al usuario un número 
	 * comprendido entre 1 y 7, correspondiente a un día de la semana. 
	 * Se debe mostrar el nombre del día de la semana al que corresponde. 
	 * Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.
	 */

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		//Pedimos que introduzca un numero       
				System.out.print("Introduce un numero (1 a 7): ");
				int diaSemana = reader.nextInt();
				
				//Calcula y asigna valor
				switch (diaSemana) {
	            case 1:
	            System.out.println("Lunes");
	                break;
	            case 2:
		            System.out.println("Martes");
		                break;
	            case 3:
		            System.out.println("Miercoles");
		                break;        
	            case 4:
		            System.out.println("Jueves");
		                break;
	            case 5:
		            System.out.println("Viernes");
		                break;
	            case 6:
		            System.out.println("Sabado");
		                break;
	            case 7:
		            System.out.println("Domingo");
		                break;
	            default:
	                System.out.println("Numero no valido. Debe estar entre 1 y 7.");
	                break;
	        }
				
				//Cerramos Scanner 
				
	        reader.close();         
		
	}

}
