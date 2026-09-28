package ejercicioAnalisis02Biblioteca;

public class Revista extends Ficha {

    private int numeroRevista;
    private int anioPublicacion;

    private static final int DIAS_PRESTAMO = 10;

    //  Constructor 

    public Revista(int id, String titulo, int numeroRevista, int anioPublicacion) {
        super(id, titulo);
        this.numeroRevista   = numeroRevista;
        this.anioPublicacion = anioPublicacion;
    }

    //  Días de préstamo

    @Override
    public int diasPrestamo() {
        return DIAS_PRESTAMO;
    }

    //  Getters y Setters 

    public int  getNumeroRevista() { return numeroRevista; }
    public void setNumeroRevista(int numero) { this.numeroRevista = numero; }

    public int  getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(int anio) { this.anioPublicacion = anio; }

    // toString 

    @Override
    public String toString() {
        return "Revista [" + super.toString()
                + ", numero=" + numeroRevista
                + ", anio=" + anioPublicacion + "]";
    }
}
