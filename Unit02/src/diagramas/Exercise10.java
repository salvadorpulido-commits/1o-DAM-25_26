package diagramas;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		int horas;
		int minutos;
		int segundos;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("introduzca las horas");
		horas = reader.nextInt();
		
		System.out.println("introduzca los minutos");
		minutos = reader.nextInt();
		
		System.out.println("introduzca los segundos");
		segundos = reader.nextInt();
				
		if(segundos < 59) {
			segundos++;
			} else {
			segundos = 0;
			if(minutos < 59) {
				minutos++;
			} else {
				minutos = 0;
				if(horas < 59) {
					horas++;
				} else {
					horas = 0;
					
				}	
				
			}
					
		}
		
		System.out.println( horas + ":" + minutos + ":" + segundos );
	
	reader.close();
	
	}

}
