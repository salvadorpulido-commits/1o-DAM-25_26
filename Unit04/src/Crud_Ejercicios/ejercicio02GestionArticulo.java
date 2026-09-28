package Crud_Ejercicios;

// Importamos ArrayList
import java.util.ArrayList;

// Creamos la clase de gestión del almacén
public class ejercicio02GestionArticulo {

    // Creamos la lista de artículos
    private ArrayList<ejercicio02Articulo> listaArticulos;

    // Creamos el constructor
    public ejercicio02GestionArticulo() {
        // Inicializamos la lista
        listaArticulos = new ArrayList<ejercicio02Articulo>();
    }

    // Método para listar artículos
    public void listar() {
        // Comprobamos si la lista está vacía
        if (listaArticulos.isEmpty()) {
            System.out.println("No hay artículos.");
        } else {
            // Recorremos la lista
            for (ejercicio02Articulo a : listaArticulos) {
                System.out.println(a);
            }
        }
    }

    // Método para dar de alta un artículo
    public void alta(ejercicio02Articulo articulo) {
        listaArticulos.add(articulo);
    }

    // Método para dar de baja un artículo por código
    public boolean baja(int codigo) {
        for (ejercicio02Articulo a : listaArticulos) {
            if (a.getCodigo() == codigo) {
                listaArticulos.remove(a);
                return true;
            }
        }
        return false;
    }

    // Método para modificar el stock directamente
    public boolean modificarStock(int codigo, int nuevoStock) {
        for (ejercicio02Articulo a : listaArticulos) {
            if (a.getCodigo() == codigo) {
                a.setStock(nuevoStock);
                return true;
            }
        }
        return false;
    }

    // Método para entrada de mercancía
    public boolean entradaMercancia(int codigo, int cantidad) {
        for (ejercicio02Articulo a : listaArticulos) {
            if (a.getCodigo() == codigo) {
                a.setStock(a.getStock() + cantidad);
                return true;
            }
        }
        return false;
    }

    // Método para salida de mercancía
    public boolean salidaMercancia(int codigo, int cantidad) {
        for (ejercicio02Articulo a : listaArticulos) {
            if (a.getCodigo() == codigo) {
                // Comprobamos que hay stock suficiente
                if (a.getStock() >= cantidad) {
                    a.setStock(a.getStock() - cantidad);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
