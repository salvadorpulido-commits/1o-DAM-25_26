package part2;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
    	/* (Acepta el reto) El cinquecento es un periodo del arte europeo (principalmente italiano) enclavado en pleno Renacimiento. 
    	 * Aunque su nombre esconde el número cinco, en realidad ¡pertenece al siglo XVI! Cinquecento es, abreviadamente, 
    	 * "años [mil] quinientos", en italiano, y es que el siglo XVI comprendió los años desde el 1501 al 1600, igual que el siglo XXI 
    	 * empezó en el 2001, con un 20 en sus dos primeros dígitos y no un 21.
    	 * Dado un año, ¿de qué siglo es?
    	 */

        // Creamos scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaramos variables
        int año
        int siglo

        // Pedir el año
        System.out.print("Introduce un año: ");
        int año = sc.nextInt();

        // Cálculo del siglo
        // Dividimos entre 100 y sumamos 1 si no es exacto
        int siglo;
        if (año % 100 == 0) {
            siglo = año / 100;
        } else {
            siglo = (año / 100) + 1;
        }

        // Mostrar el resultado
        System.out.println("El año " + año + " pertenece al siglo " + siglo);

        // Cerramos scanner
        sc.close();
    }
}
