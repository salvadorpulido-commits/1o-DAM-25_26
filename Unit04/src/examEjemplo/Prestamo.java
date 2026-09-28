package examEjemplo;

public class Prestamo {

    String idLibro;
    String idSocio;
    boolean devuelto;

    public Prestamo(String idLibro, String idSocio) {
        this.idLibro = idLibro;
        this.idSocio = idSocio;
        this.devuelto = false;
    }

    public void devolver() {
        devuelto = true;
    }
}