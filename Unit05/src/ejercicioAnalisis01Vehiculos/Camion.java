package ejercicioAnalisis01Vehiculos;

public class Camion extends Vehiculo {

    private double  pesoMaxAutorizado;
    private boolean mercanciaPeligrosa;

    private static final double  PESO_MAX_DEFAULT      = 1000.0;
    private static final boolean MERC_PELIGROSA_DEFAULT = false;

    // Constructores 

    public Camion(String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color, matricula);
        this.pesoMaxAutorizado  = PESO_MAX_DEFAULT;
        this.mercanciaPeligrosa = MERC_PELIGROSA_DEFAULT;
    }

    public Camion(String marca, String modelo, String color, String matricula,
                  double pesoMaxAutorizado, boolean mercanciaPeligrosa) {
        super(marca, modelo, color, matricula);
        this.pesoMaxAutorizado  = pesoMaxAutorizado;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    // Getters y Setters 

    public double  getPesoMaxAutorizado()                      { return pesoMaxAutorizado; }
    public void    setPesoMaxAutorizado(double pesoMax)        { this.pesoMaxAutorizado = pesoMax; }

    public boolean isMercanciaPeligrosa()                      { return mercanciaPeligrosa; }
    public void    setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    //  toString 
    @Override
    public String toString() {
        return "Camion [marca=" + marca
                + ", modelo=" + modelo
                + ", color=" + color
                + ", matricula=" + matricula
                + ", motor=" + (motorEncendido ? "encendido" : "apagado")
                + ", marcha=" + marchaActual
                + ", velocidad=" + velocidadActual + " km/h"
                + ", pesoMax=" + pesoMaxAutorizado + " kg"
                + ", mercanciaPeligrosa=" + mercanciaPeligrosa + "]";
    }
}