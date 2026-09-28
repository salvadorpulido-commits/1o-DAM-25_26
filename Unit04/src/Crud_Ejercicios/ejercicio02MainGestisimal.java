package Crud_Ejercicios;

// Importamos Scanner
import java.util.Scanner;

// Creamos la clase principal
public class ejercicio02MainGestisimal {

    // Método principal
    public static void main(String[] args) {

        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Creamos el gestor de artículos
        ejercicio02GestionArticulo gestion = new ejercicio02GestionArticulo();

        // Declaramos variables
        int opcion;
        int codigo;
        int stock;
        int cantidad;
        String descripcion;
        double precioCompra;
        double precioVenta;

        // Menú principal
        do {
            System.out.println("\nGESTISIMAL");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    gestion.listar();
                    break;

                case 2:
                    System.out.print("Código: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Descripción: ");
                    descripcion = sc.nextLine();
                    System.out.print("Precio compra: ");
                    precioCompra = sc.nextDouble();
                    System.out.print("Precio venta: ");
                    precioVenta = sc.nextDouble();
                    System.out.print("Stock inicial: ");
                    stock = sc.nextInt();

                    gestion.alta(new ejercicio02Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
                    break;

                case 3:
                    System.out.print("Código del artículo: ");
                    codigo = sc.nextInt();

                    if (gestion.baja(codigo)) {
                        System.out.println("Artículo eliminado.");
                    } else {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Código del artículo: ");
                    codigo = sc.nextInt();
                    System.out.print("Nuevo stock: ");
                    stock = sc.nextInt();

                    if (gestion.modificarStock(codigo, stock)) {
                        System.out.println("Stock modificado.");
                    } else {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Código del artículo: ");
                    codigo = sc.nextInt();
                    System.out.print("Cantidad a añadir: ");
                    cantidad = sc.nextInt();

                    if (gestion.entradaMercancia(codigo, cantidad)) {
                        System.out.println("Entrada registrada.");
                    } else {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Código del artículo: ");
                    codigo = sc.nextInt();
                    System.out.print("Cantidad a sacar: ");
                    cantidad = sc.nextInt();

                    if (gestion.salidaMercancia(codigo, cantidad)) {
                        System.out.println("Salida registrada.");
                    } else {
                        System.out.println("No hay stock suficiente o artículo no encontrado.");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 7);

        // Cerramos el Scanner
        sc.close();
    }
}
