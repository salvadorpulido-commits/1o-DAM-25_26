package ejercicioAnalisis01Vehiculos;

public class Motocicleta extends Vehiculo {

    private int cilindrada;

    private static final int CILINDRADA_DEFAULT    = 50;
    private static final int LIMITE_CARNET         = 125;

    // Constructores 

    public Motocicleta(String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color, matricula);
        this.cilindrada = CILINDRADA_DEFAULT;
    }

    public Motocicleta(String marca, String modelo, String color, String matricula,
                       int cilindrada) {
        super(marca, modelo, color, matricula);
        this.cilindrada = cilindrada;
    }

    //  Métodos propios 

    public boolean requiereCarnet() {
        return cilindrada >= LIMITE_CARNET;
    }

    //  Getters y Setters

    public int  getCilindrada()              { return cilindrada; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    // toString 

    @Override
    public String toString() {
        return "Motocicleta [marca=" + marca
                + ", modelo=" + modelo
                + ", color=" + color
                + ", matricula=" + matricula
                + ", motor=" + (motorEncendido ? "encendido" : "apagado")
                + ", marcha=" + marchaActual
                + ", velocidad=" + velocidadActual + " km/h"
                + ", cilindrada=" + cilindrada + " CC"
                + ", requiereCarnet=" + requiereCarnet() + "]";
    }
}