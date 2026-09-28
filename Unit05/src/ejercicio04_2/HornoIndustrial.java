package ejercicio04_2;

public class HornoIndustrial extends CoccionIndustrial implements Instalable {

    public HornoIndustrial(String id, String marca, String modelo, double precioBase, 
                           double consumoHora, int aniosGarantia, double potencia, boolean usoIntensivo) {
        super(id, marca, modelo, precioBase, consumoHora, aniosGarantia, potencia, usoIntensivo);
    }

    @Override
    public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + 500; 
    }

    @Override
    public double calcularCosteMantenimientoAnual() {
        return 200 + (potencia * 5); 
    }

    @Override
    public double calcularCosteInstalacion() {
        return 250.0; 
    }

    @Override
    public boolean requiereTecnicoEspecializado() {
        return true; 
    }
}