package ejercicio04;

public class Television extends Electrodomestico {

    private int     resolucion;
    private boolean sintonizadorTDT;

    private static final int     RESOLUCION_DEFAULT      = 20;
    private static final boolean SINTONIZADOR_DEFAULT    = false;

    // Constructores

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion      = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
    }

    public Television(double precioBase, String color,
                      char consumoEnergetico, double peso,
                      int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion      = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Getters & Setters
    public int     getResolucion()                    { return resolucion; }
    public void    setResolucion(int resolucion)      { this.resolucion = resolucion; }

    public boolean isSintonizadorTDT()                { return sintonizadorTDT; }
    public void    setSintonizadorTDT(boolean s)      { this.sintonizadorTDT = s; }

    //precioFinal 

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40)   precio *= 1.30;
        if (sintonizadorTDT)   precio += 50;
        return precio;
    }

    @Override
    public String toString() {
        return "Television [precioBase=" + precioBase
                + ", color=" + color
                + ", consumo=" + consumoEnergetico
                + ", peso=" + peso
                + ", resolucion=" + resolucion
                + ", TDT=" + sintonizadorTDT + "]";
    }
}