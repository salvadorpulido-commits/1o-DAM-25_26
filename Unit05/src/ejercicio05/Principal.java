package ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // leer datos
        ArrayList<Poligono> lista = new ArrayList<>(); // guardar polígonos

        int opcion;

        do {
            // menu
        	
            System.out.println("\n1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            // introducir triangulo
            
            if (opcion == 1) {
                double l1, l2, l3;

                System.out.print("Lado1: ");
                l1 = sc.nextDouble();
                System.out.print("Lado2: ");
                l2 = sc.nextDouble();
                System.out.print("Lado3: ");
                l3 = sc.nextDouble();

                lista.add(new Triangulo(l1, l2, l3));
            }

            // introducir rectangulo
            
            if (opcion == 2) {
                double l1, l2;

                System.out.print("Lado1: ");
                l1 = sc.nextDouble();
                System.out.print("Lado2: ");
                l2 = sc.nextDouble();

                lista.add(new Rectangulo(l1, l2));
            }

            // mostrar todos los polígonos
            
            if (opcion == 3) {
                for (Poligono p : lista) {
                    System.out.println(p); // datos
                    System.out.println("Area: " + p.area()); // área
                }
            }

        } while (opcion != 0);

        sc.close(); // cerrar scanner
    }
}