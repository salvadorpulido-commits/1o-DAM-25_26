package ejercicioAnalisis01Vehiculos;

public class Turismo extends Vehiculo {

    private int    numPlazas;
    private String tipoUso;

    private static final int    PLAZAS_DEFAULT   = 5;
    private static final String TIPO_USO_DEFAULT = "particular";

    // Constructores

    public Turismo(String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color, matricula);
        this.numPlazas = PLAZAS_DEFAULT;
        this.tipoUso   = TIPO_USO_DEFAULT;
    }

    public Turismo(String marca, String modelo, String color, String matricula,
                   int numPlazas, String tipoUso) {
        super(marca, modelo, color, matricula);
        this.numPlazas = numPlazas;
        this.tipoUso   = tipoUso;
    }

    // Getters y Setters

    public int    getNumPlazas()               { return numPlazas; }
    public void   setNumPlazas(int numPlazas)  { this.numPlazas = numPlazas; }

    public String getTipoUso()               { return tipoUso; }
    public void   setTipoUso(String tipoUso) { this.tipoUso = tipoUso; }

    // toString

    @Override
    public String toString() {
        return "Turismo [marca=" + marca
                + ", modelo=" + modelo
                + ", color=" + color
                + ", matricula=" + matricula
                + ", motor=" + (motorEncendido ? "encendido" : "apagado")
                + ", marcha=" + marchaActual
                + ", velocidad=" + velocidadActual + " km/h"
                + ", plazas=" + numPlazas
                + ", uso=" + tipoUso + "]";
    }
}
