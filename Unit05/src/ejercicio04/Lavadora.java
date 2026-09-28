package ejercicio04;
 
public class Lavadora extends Electrodomestico {
 
    private double carga;

    private static final double CARGA_DEFAULT = 5.0;

    // Constructores
    
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(double precioBase, String color,
                    char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Getters & Setters 

    public double getCarga()              { return carga; }
    public void   setCarga(double carga)  { this.carga = carga; }

    // precioFinal

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30) precio += 50;
        return precio;
    }

    @Override
    public String toString() {
        return "Lavadora [precioBase=" + precioBase
                + ", color=" + color
                + ", consumo=" + consumoEnergetico
                + ", peso=" + peso
                + ", carga=" + carga + "]";
    }
}