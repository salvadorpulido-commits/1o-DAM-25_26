package ejercicio04_2;

public class LavadoraIndustrial extends LavadoIndustrial implements Instalable {

    public LavadoraIndustrial(String id, String marca, String modelo, double precioBase, 
                              double consumoHora, int aniosGarantia, double potencia, boolean usoIntensivo) {
        super(id, marca, modelo, precioBase, consumoHora, aniosGarantia, potencia, usoIntensivo);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + 300; 
    }

    @Override
    public double calcularCosteMantenimientoAnual() {
        return 150 + (usoIntensivo ? 100 : 0); 
    }

    @Override
    public double calcularCosteInstalacion() {
        return 120.0; 
    }

    @Override
    public boolean requiereTecnicoEspecializado() {
        return true; 
    }
}