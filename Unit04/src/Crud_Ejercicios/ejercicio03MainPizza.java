package Crud_Ejercicios;

// Importamos Scanner
import java.util.Scanner;

// Creamos la clase principal
public class ejercicio03MainPizza {

    // Método principal
    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Creamos el gestor de pizzas
        ejercicio03GestionPizza gestion = new ejercicio03GestionPizza();

        // Declaramos variables
        int opcion;
        int codigo;
        String tipo;
        String tamaño;

        // Menú principal
        do {
            System.out.println("\nPEDIDOS DE PIZZA");
            System.out.println("===================");
            System.out.println("1. Listado de pizzas");
            System.out.println("2. Nuevo pedido");
            System.out.println("3. Pizza servida");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            // Leemos la opción
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    // Mostramos el listado
                    gestion.listar();
                    break;

                case 2:
                    // Pedimos los datos del pedido
                    System.out.print("Código del pedido: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo de pizza: ");
                    tipo = sc.nextLine();
                    System.out.print("Tamaño (Pequeña/Mediana/Familiar): ");
                    tamaño = sc.nextLine();

                    // Creamos y añadimos la pizza
                    gestion.nuevoPedido(new ejercicio03Pizza(codigo, tipo, tamaño));
                    break;

                case 3:
                    // Pedimos el código del pedido
                    System.out.print("Código de la pizza servida: ");
                    codigo = sc.nextInt();

                    // Marcamos la pizza como servida
                    if (gestion.servirPizza(codigo)) {
                        System.out.println("Pizza marcada como servida.");
                    } else {
                        System.out.println("Pizza no encontrada o ya servida.");
                    }
                    break;

                case 4:
                    // Salida del programa
                    System.out.println("Fin del programa.");
                    break;

                default:
                    // Opción incorrecta
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        // Cerramos el Scanner
        sc.close();
    }
}

