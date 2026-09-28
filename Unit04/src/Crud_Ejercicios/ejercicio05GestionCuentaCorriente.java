package Crud_Ejercicios;

import java.util.ArrayList;

// Creamos la clase gestora del CRUD
public class ejercicio05GestionCuentaCorriente {

    // Creamos la colección de cuentas
    private ArrayList<ejercicio05CuentaCorriente> lista;

    // Constructor
    public ejercicio05GestionCuentaCorriente() {
        lista = new ArrayList<>();
    }

    // Método para listar las cuentas
    public void listarCuentas() {

        if (lista.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
        } else {
            for (ejercicio05CuentaCorriente c : lista) {
                System.out.println(c);
            }
        }
    }

    // Método para añadir una cuenta
    public boolean altaCuenta(ejercicio05CuentaCorriente cuenta) {

        if (lista.contains(cuenta)) {
            return false;
        } else {
            lista.add(cuenta);
            return true;
        }
    }

    // Método para buscar una cuenta por DNI
    public ejercicio05CuentaCorriente buscarPorDni(String dni) {

        ejercicio05CuentaCorriente aux = new ejercicio05CuentaCorriente(dni);
        int posicion = lista.indexOf(aux);

        if (posicion != -1) {
            return lista.get(posicion);
        } else {
            return null;
        }
    }

    // Método para borrar una cuenta
    public boolean borrarCuenta(String dni) {

        ejercicio05CuentaCorriente aux = new ejercicio05CuentaCorriente(dni);
        return lista.remove(aux);
    }
}

