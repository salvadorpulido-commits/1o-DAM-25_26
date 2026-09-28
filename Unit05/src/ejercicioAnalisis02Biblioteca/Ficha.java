package ejercicioAnalisis02Biblioteca;

public abstract class Ficha {

    protected int id;
    protected String titulo;

    // Constructor
    
    public Ficha(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    // Método abstracto de préstamo 

    public abstract int diasPrestamo();

    // Getters y Setters 

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    // toString 

    @Override
    public String toString() {
        return "id=" + id + ", titulo=" + titulo;
    }
}
