package diagramas;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		String nombre;
		int numHoras;
		double tarifaHora;
		double tasas=0;
		double salBruto;
		double salNeto;
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("introduzca el nombre del empleado");
		nombre = reader.nextLine();
		
		System.out.println("introduzca numero de horas trabajadas");
		numHoras = reader.nextInt();
		
		System.out.println("introduzca el la tarifa por hora");
		tarifaHora = reader.nextDouble();
		
		if(numHoras <= 35) {
			salBruto = numHoras * tarifaHora;
			
		} else { 
			salBruto = 35 * tarifaHora + (numHoras - 35) * tarifaHora * 1.5;
			
		}
		
		if(salBruto < 500 && salBruto <= 900){ 
			tasas = (salBruto-500)*0.25;
						
		} else if(salBruto > 900) {
			tasas = (salBruto-900)*0.45 + 400*0.25;
			
			salNeto = salBruto-tasas;
		
			System.out.println("Resumen de: " + nombre);
			System.out.println("Salario Bruto: " + salBruto);
			System.out.println("Tasas: " + tasas);
			System.out.println("Salario Neto: " + salNeto);
			
			reader.close();
			
		}
		
	}

}
