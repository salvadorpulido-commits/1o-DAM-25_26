package ejercicioAnalisis02Biblioteca;

public class DVD extends Ficha {

    private String director;
    private int    anio;
    private String tipo;

    private static final int    DIAS_PRESTAMO = 5;
    private static final String TIPO_DEFAULT  = "película";

    // Constructor

    public DVD(int id, String titulo, String director, int anio, String tipo) {
        super(id, titulo);
        this.director = director;
        this.anio     = anio;
        this.tipo     = comprobarTipo(tipo);
    }

    //  Validación de tipo 

    private String comprobarTipo(String tipo) {
        if (tipo == null) return TIPO_DEFAULT;
        switch (tipo.toLowerCase()) {
            case "película":
            case "pelicula":
            case "documental":
            case "serie":
                return tipo.toLowerCase();
            default:
                return TIPO_DEFAULT;
        }
    }

    //  Días de préstamo

    @Override
    public int diasPrestamo() {
        return DIAS_PRESTAMO;
    }

    // Getters y Setters

    public String getDirector() { return director; }
    public void   setDirector(String director) { this.director = director; }

    public int  getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getTipo() { return tipo; }
    public void   setTipo(String tipo) { this.tipo = comprobarTipo(tipo); }

    //  toString 

    @Override
    public String toString() {
        return "DVD [" + super.toString()
                + ", director=" + director
                + ", anio=" + anio
                + ", tipo=" + tipo + "]";
    }
}

