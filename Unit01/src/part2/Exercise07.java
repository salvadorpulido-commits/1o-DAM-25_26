package part2;

import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        /* Una empresa que gestiona un parque acuático solicita una aplicación
         * que les ayude a calcular el importe que hay que cobrar en la taquilla
         * por la compra de una serie de entradas (cuyo número será introducido por el usuario).
         * 
         * Existen dos tipos de entradas:
         *  - Infantiles: 15,50€
         *  - Adultos: 20€
         * 
         * En el caso de que el importe total sea igual o superior a 100€,
         * se aplicará automáticamente un bono descuento del 5%.
         */

        // Creamos scanner
        Scanner sc = new Scanner(System.in);
        
        //Variables
        int entradasInfantiles
        int entradasAdultos

        // Pedir número de entradas infantiles
        System.out.print("Introduce el número de entradas infantiles: ");
        int entradasInfantiles = sc.nextInt();

        // Pedir número de entradas de adultos
        System.out.print("Introduce el número de entradas de adultos: ");
        int entradasAdultos = sc.nextInt();

        // Precios
        double precioInfantil = 15.50;
        double precioAdulto = 20.00;

        // Cálculo del importe total
        double total = (entradasInfantiles * precioInfantil) + (entradasAdultos * precioAdulto);

        // Aplicar descuento si procede 
        if (total >= 100) 
            total = total - (total * 0.05); // 5% de descuento

        // Mostrar el resultado
        System.out.println("El importe total a pagar es: " + total + " €");

        // Cerramos scanner
        sc.close();
    }
}
