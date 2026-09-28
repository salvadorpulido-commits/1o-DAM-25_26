package conditional_exercises;

import java.util.Scanner;

public class Exercise06 {
    /*
    Pruebas realizadas (mínimas):
    Entrada: mes=2, año=2020
      - Esperado: 29 días (bisiesto)
      - Obtenido: 29 días
    Entrada: mes=2, año=2019
      - Esperado: 28 días
      - Obtenido: 28 días
    Entrada: mes=4, año=2023
      - Esperado: 30 días
      - Obtenido: 30 días
    Entrada: mes=12, año=2021
      - Esperado: 31 días
      - Obtenido: 31 días
    Entrada: mes=13, año=2022
      - Esperado: error (mes inválido)
      - Obtenido: error (mes inválido)
    Entrada: mes=0, año=2022
      - Esperado: error (mes inválido)
      - Obtenido: error (mes inválido)
    Entrada: mes=5, año=-1
      - Esperado: error (año inválido)
      - Obtenido: error (año inválido)
    */
	
	    
    public static void main(String[] args) {
        
    	//Declaramos variables
    	
    	int mes;
	    int año;
	    int dias;
	    boolean bisiesto;
    	
    	// Crear Scanner 
        Scanner reader = new Scanner(System.in);

        // Pedir al usuario el número de mes (1-12)
        System.out.print("Introduce el número de mes (1-12): ");
        mes = reader.nextInt();

        // Pedir al usuario el año
        System.out.print("Introduce el año: ");
        año = reader.nextInt();

        // Validar mes y año
        if (mes < 1 || mes > 12) {
            System.out.println("Error: mes inválido. Debe estar entre 1 y 12.");
        } else if (año <= 0) {
            System.out.println("Error: año inválido. Debe ser mayor que 0.");
        } else {
        	
            // Comprobar si el año es bisiesto
            bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

            // Determinar los días según el mes
            switch (mes) {
            
            // Meses con 31 días
                case 1, 3, 5, 7, 8, 10, 12:
                    dias = 31; 
                    break;
            // Meses con 30 días        
                case 4, 6, 9, 11:
                    dias = 30; 
                    break;
            // Febrero        
                case 2:
                    dias = bisiesto ? 29 : 28; 
                    break;
            // Nunca se dará, pero por seguridad
                default:
                    dias = 0; 
            }

            // Mostrar resultado
            System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
        }

        // Cerrar el Scanner
        reader.close();
    }
}