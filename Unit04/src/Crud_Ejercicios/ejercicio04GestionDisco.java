package Crud_Ejercicios;

// Importamos ArrayList

import java.util.ArrayList;

// Creamos la clase de gestión de discos
public class ejercicio04GestionDisco {

    // Creamos la lista de discos
    private ArrayList<ejercicio04Disco> listaDiscos;

    // Creamos el constructor
    
    public ejercicio04GestionDisco() {
        // Inicializamos la lista
        listaDiscos = new ArrayList<ejercicio04Disco>();
    }

    // Método para listar los discos
    
    public void listar() {
        if (listaDiscos.isEmpty()) {
            System.out.println("No hay discos en la colección.");
        } else {
            for (ejercicio04Disco d : listaDiscos) {
                System.out.println(d);
            }
        }
    }

    // Método para añadir un disco
    
    public void añadirDisco(ejercicio04Disco disco) {
        listaDiscos.add(disco);
    }

    // Método para borrar un disco por código
    
    public boolean borrarDisco(int codigo) {
        for (ejercicio04Disco d : listaDiscos) {
            if (d.getCodigo() == codigo) {
                listaDiscos.remove(d);
                return true;
            }
        }
        return false;
    }
}

