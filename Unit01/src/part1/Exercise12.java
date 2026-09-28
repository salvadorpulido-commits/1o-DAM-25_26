package part1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
		 *diseña una aplicación que solicite las ventas 
		 *(en kilos, tanto de las peras como de las manzanas). 
		 * La aplicación mostrará el importe total sabiendo que el precio 
		 * del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
		*/
		
		//Creamos scanner		
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variables Manzanas, Peras y Total
		
		double manzanas = sc.nextDouble();
		double peras = sc.nextDouble();
		double total = manzanas * 2.35 + peras * 1.95;
		
		//Pedimos cantidades en Kg vendidas de Manzanas 
		System.out.print("Kilos de manzanas vendidos: ");
		manzanas = sc.nextDouble();
		
		//Pedimos cantidades en Kg vendidas de Peras
		System.out.print("Kilos de peras vendidos: ");
		peras = sc.nextDouble();
		
		//Mostramos el total 
		System.out.println("Beneficio total: " + total + " €");
		
		//Cerramos el scanner
		sc.close();
	}
}
