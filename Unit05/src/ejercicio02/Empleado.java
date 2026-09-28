package ejercicio02;

public class Empleado {
    private String nombre;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString base
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
