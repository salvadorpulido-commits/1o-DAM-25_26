package ejercicio04_2;

public abstract class RefrigeracionIndustrial extends EquipoHosteleria {
    public RefrigeracionIndustrial(String id, String marca, String modelo, double precioBase, 
                                   double consumoHora, int aniosGarantia, double potencia, boolean usoIntensivo) {
        super(id, marca, modelo, precioBase, consumoHora, aniosGarantia, potencia, usoIntensivo);
    }
}