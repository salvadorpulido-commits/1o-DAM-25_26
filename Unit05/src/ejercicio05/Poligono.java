package ejercicio05;

// Clase abstracta 

public abstract class Poligono {

    protected int numeroLados; // número de lados

    // Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Getter
    public int getNumeroLados() {
        return numeroLados;
    }

    // Método abstracto (lo implementan las clases hijas)
    public abstract double area();

    // Muestra el número de lados
    public String toString() {
        return "Numero de lados: " + numeroLados;
    }
}