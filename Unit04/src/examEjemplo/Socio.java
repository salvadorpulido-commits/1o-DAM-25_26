package examEjemplo;

public class Socio {

    String id;
    String nombre;
    int prestamosActuales;
    int maxPrestamos;

    public Socio(String id, String nombre, int p, int max) {
        this.id = id;
        this.nombre = nombre;
        this.prestamosActuales = p;
        this.maxPrestamos = max;
    }

    public boolean puedePrestar() {
        return prestamosActuales < maxPrestamos;
    }

    public void sumarPrestamo() {
        prestamosActuales++;
    }

    public void restarPrestamo() {
        prestamosActuales--;
    }
}