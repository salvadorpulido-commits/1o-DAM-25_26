package Crud_Ejercicios;

// Importamos ArrayList
import java.util.ArrayList;

// Creamos la clase de gestión de pizzas
public class ejercicio03GestionPizza {

    // Creamos la lista de pizzas pedidas
    private ArrayList<ejercicio03Pizza> listaPizzas;

    // Creamos el constructor
    public ejercicio03GestionPizza() {
        // Inicializamos la lista
        listaPizzas = new ArrayList<ejercicio03Pizza>();
    }

    // Método para listar las pizzas
    public void listar() {
        // Comprobamos si la lista está vacía
        if (listaPizzas.isEmpty()) {
            System.out.println("No hay pizzas registradas.");
        } else {
            // Recorremos la lista
            for (ejercicio03Pizza p : listaPizzas) {
                System.out.println(p);
            }
        }
    }

    // Método para añadir un nuevo pedido
    public void nuevoPedido(ejercicio03Pizza pizza) {
        // Añadimos la pizza a la lista
        listaPizzas.add(pizza);
    }

    // Método para marcar una pizza como servida
    public boolean servirPizza(int codigo) {
        // Recorremos la lista
        for (ejercicio03Pizza p : listaPizzas) {
            // Buscamos por código
            if (p.getCodigo() == codigo) {
                // Comprobamos que no esté ya servida
                if (p.getEstado().equalsIgnoreCase("Pedida")) {
                    // Cambiamos el estado
                    p.setEstado("Servida");
                    return true;
                }
            }
        }
        return false;
    }
}
