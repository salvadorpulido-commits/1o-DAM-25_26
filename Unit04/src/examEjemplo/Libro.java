package examEjemplo;

public class Libro {

    String id;
    String titulo;
    String autor;
    int ejemplaresDisponibles;

    public Libro(String id, String titulo, String autor, int ej) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ej;
    }

    public boolean disponible() {
        return ejemplaresDisponibles > 0;
    }

    public void prestar() {
        ejemplaresDisponibles--;
    }

    public void devolver() {
        ejemplaresDisponibles++;
    }
}
