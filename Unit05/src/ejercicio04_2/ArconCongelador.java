package ejercicio04_2;

public class ArconCongelador extends RefrigeracionIndustrial {

    public ArconCongelador(String id, String marca, String modelo, double precioBase, 
                           double consumoHora, int aniosGarantia, double potencia, boolean usoIntensivo) {
        super(id, marca, modelo, precioBase, consumoHora, aniosGarantia, potencia, usoIntensivo);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + 150; 
    }

    @Override
    public double calcularCosteMantenimientoAnual() {
        return consumoHora * 24 * 30 * 0.1; 
    }
}