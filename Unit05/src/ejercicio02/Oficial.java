package ejercicio02;

public class Oficial extends Operario {

    public Oficial(String nombre) {
        super(nombre); // Llama al constructor de Operario
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}