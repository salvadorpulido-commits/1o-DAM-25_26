package Crud_Ejercicios;

// Importamos la clase ArrayList
import java.util.ArrayList;

// Creamos la clase de gestión de alumnos
public class ejercicio01GestionAlumno {

    // Creamos la lista donde se guardarán los alumnos
    private ArrayList<ejercicio01Alumnos> listaAlumnos;

    // Creamos el constructor
    public ejercicio01GestionAlumno() {
        // Inicializamos la lista de alumnos
        listaAlumnos = new ArrayList<ejercicio01Alumnos>();
    }

    // Método para mostrar el listado de alumnos
    public void listarAlumnos() {
        // Comprobamos si la lista está vacía
        if (listaAlumnos.isEmpty()) {
            // Mostramos mensaje si no hay alumnos
            System.out.println("No hay alumnos.");
        } else {
            // Recorremos la lista de alumnos
            for (ejercicio01Alumnos a : listaAlumnos) {
                // Mostramos cada alumno
                System.out.println(a);
            }
        }
    }

    // Método para añadir un alumno
    public void añadirAlumno(ejercicio01Alumnos alumno) {
        // Añadimos el alumno a la lista
        listaAlumnos.add(alumno);
    }

    // Método para modificar la nota de un alumno
    public boolean modificarNota(String nombre, double nuevaNota) {
        // Recorremos la lista de alumnos
        for (ejercicio01Alumnos a : listaAlumnos) {
            // Comparamos el nombre del alumno
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                // Modificamos la nota
                a.setNota(nuevaNota);
                // Devolvemos true si se ha modificado
                return true;
            }
        }
        // Devolvemos false si no se encuentra el alumno
        return false;
    }

    // Método para borrar un alumno
    public boolean borrarAlumno(String nombre) {
        // Recorremos la lista de alumnos
        for (ejercicio01Alumnos a : listaAlumnos) {
            // Comprobamos el nombre del alumno
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                // Eliminamos el alumno de la lista
                listaAlumnos.remove(a);
                // Devolvemos true si se ha eliminado
                return true;
            }
        }
        // Devolvemos false si no se encuentra el alumno
        return false;
    }
}
