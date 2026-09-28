package ejercicioAnalisis02Biblioteca;

public class Libro extends Ficha {

    private String autor;
    private String editorial;

    private static final int DIAS_PRESTAMO = 15;

    //Constructor

    public Libro(int id, String titulo, String autor, String editorial) {
        super(id, titulo);
        this.autor     = autor;
        this.editorial = editorial;
    }

    // Días de préstamo

    @Override
    public int diasPrestamo() {
        return DIAS_PRESTAMO;
    }

    //  Getters y Setters 

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    //  toString

    @Override
    public String toString() {
        return "Libro [" + super.toString()
                + ", autor=" + autor
                + ", editorial=" + editorial + "]";
    }
}

