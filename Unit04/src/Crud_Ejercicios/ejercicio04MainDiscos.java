package Crud_Ejercicios;

// Importamos Scanner
import java.util.Scanner;

// Creamos la clase principal
public class ejercicio04MainDiscos {

    // Método principal
    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Creamos el gestor de discos
        ejercicio04GestionDisco gestion = new ejercicio04GestionDisco();

        // Declaramos variables
        int opcion;
        int codigo;
        int duracion;
        String autor;
        String titulo;
        int genero;

        // Menú principal
        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo Disco");
            System.out.println("3. Borrar");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    gestion.listar();
                    break;

                case 2:
                    System.out.print("Código: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Título: ");
                    titulo = sc.nextLine();
                    System.out.print("Duración (minutos): ");
                    duracion = sc.nextInt();

                    System.out.println("Género:");
                    System.out.println("1. Rock");
                    System.out.println("2. Pop");
                    System.out.println("3. Jazz");
                    System.out.println("4. Blues");
                    genero = sc.nextInt();

                    ejercicio04Disco.Genero generoDisco = ejercicio04Disco.Genero.values()[genero - 1];

                    gestion.añadirDisco(
                        new ejercicio04Disco(codigo, autor, titulo, duracion, generoDisco)
                    );
                    break;

                case 3:
                    System.out.print("Código del disco a borrar: ");
                    codigo = sc.nextInt();

                    if (gestion.borrarDisco(codigo)) {
                        System.out.println("Disco eliminado.");
                    } else {
                        System.out.println("Disco no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 4);

        // Cerramos el Scanner
        sc.close();
    }
}

