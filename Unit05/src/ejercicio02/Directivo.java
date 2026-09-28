package ejercicio02;

public class Directivo extends Empleado {

    // Constructor
    public Directivo(String nombre) {
        super(nombre); // Llama al constructor Empleado
    }

    @Override
    public String toString() {
        // toString de Empleado y concatena su parte
        return super.toString() + " -> Directivo";
    }
}