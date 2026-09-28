package ejercicio02;

public class Tecnico extends Operario {

    public Tecnico(String nombre) {
        super(nombre); // Llama al constructor de Operario
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}