package ejercicio04_2;

public abstract class EquipoHosteleria {
    protected String id;
    protected String marca;
    protected String modelo;
    protected double precioBase;
    protected double consumoHora;
    protected int aniosGarantia;
    protected double potencia;
    protected boolean usoIntensivo;

    public EquipoHosteleria(String id, String marca, String modelo, double precioBase, 
                            double consumoHora, int aniosGarantia, double potencia, boolean usoIntensivo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.consumoHora = consumoHora;
        this.aniosGarantia = aniosGarantia;
        this.potencia = potencia;
        this.usoIntensivo = usoIntensivo;
    }

    public double calcularPrecioFinal() {
        double precio = precioBase;
        if (usoIntensivo) {
            precio += precioBase * 0.20; 
        }
        precio += potencia * 15; 
        return precio;
    }

    public abstract double calcularCosteMantenimientoAnual();
    
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}