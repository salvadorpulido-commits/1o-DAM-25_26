package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
   
    private static ArrayList<Producto> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opción: ");
            
            switch (opcion) {
                case 1:
                    anadirProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }

    // --- FUNCIONES MODULARES ---

    private static void mostrarMenu() {
        System.out.println("\n--- GESTIÓN DE PRODUCTOS ---");
        System.out.println("1. Añadir producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Salir");
    }

    private static void anadirProducto() {
        System.out.println("\n--- AÑADIR PRODUCTO ---");
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        double precio = leerDouble("Precio del producto: ");
        
        int tipoProd = leerEntero("¿Es perecedero? (1 = Sí, 2 = No): ");
        Producto nuevoProducto;

        if (tipoProd == 1) {
            int dias = leerEntero("Días a caducar: ");
            nuevoProducto = new Perecedero(nombre, precio, dias);
        } else {
            System.out.print("Tipo (ej. Limpieza, Alimentación): ");
            String tipo = scanner.nextLine();
            nuevoProducto = new NoPerecedero(nombre, precio, tipo);
        }

        // 1. Comprobamos si YA EXISTE (gracias al método equals que hicimos antes)
        if (inventario.contains(nuevoProducto)) {
            System.out.println("Error: El producto ya existe en el inventario.");
        } else {
            // 2. Si no existe, lo añadimos
            inventario.add(nuevoProducto);
            
            // 3. Ordenamos la lista alfabéticamente (gracias a la interfaz Comparable)
            Collections.sort(inventario);
            
            System.out.println("Producto añadido y lista ordenada correctamente.");
        }
    }

    private static void listarProductos() {
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        if (inventario.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        
        // Recorremos el ArrayList igual que antes
        for (Producto p : inventario) {
            System.out.println(p.toString());
        }
    }

    private static void eliminarProducto() {
        System.out.println("\n--- ELIMINAR PRODUCTO ---");
        System.out.print("Introduce el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        // Creamos un producto "falso" solo con el nombre para buscarlo
        Producto pFalso = new Producto(nombre, 0); 
        
        // El método remove() de ArrayList también usa el equals() por detrás para buscarlo
        if (inventario.remove(pFalso)) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se ha encontrado un producto con ese nombre.");
        }
    }

    // --- FUNCIONES AUXILIARES PARA LEER DATOS (Iguales que antes) ---
    
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, introduce un número válido: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return num;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.print("Por favor, introduce un precio válido (usa coma para decimales): ");
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        return num;
    }
}