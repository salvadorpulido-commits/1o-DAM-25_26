package ejercicio04_2;

public abstract class CoccionIndustrial extends EquipoHosteleria {
    public CoccionIndustrial(String id, String marca, String modelo, double precioBase, 
                             double consumoHora, int aniosGarantia, double potencia, boolean usoIntensivo) {
        super(id, marca, modelo, precioBase, consumoHora, aniosGarantia, potencia, usoIntensivo);
    }
}