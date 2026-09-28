package ejercicio04;
 
public class Electrodomestico {
 
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Valores por defecto
    
    private static final String COLOR_DEFAULT       = "blanco";
    private static final char   CONSUMO_DEFAULT     = 'F';


    //Constructores
    
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase        = precioBase;
        this.peso              = peso;
        this.color             = COLOR_DEFAULT;
        this.consumoEnergetico = CONSUMO_DEFAULT;
    }

    public Electrodomestico(double precioBase, String color,
                            char consumoEnergetico, double peso) {
        this.precioBase        = precioBase;
        this.peso              = peso;
        this.color             = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    //Metodos privados de validacion

    private char comprobarConsumoEnergetico(char letra) {
        char l = Character.toUpperCase(letra);
        if (l >= 'A' && l <= 'F') return l;
        return CONSUMO_DEFAULT;
    }

    private String comprobarColor(String color) {
        if (color == null) return COLOR_DEFAULT;
        switch (color.toLowerCase()) {
            case "blanco": case "negro":
            case "rojo":   case "azul": case "gris":
                return color.toLowerCase();
            default:
                return COLOR_DEFAULT;
        }
    }

    // Getters & Setters

    public double getPrecioBase()          { return precioBase; }
    public void   setPrecioBase(double p)  { this.precioBase = p; }

    public String getColor()               { return color; }
    public void   setColor(String color)   { this.color = comprobarColor(color); }

    public char   getConsumoEnergetico()   { return consumoEnergetico; }
    public void   setConsumoEnergetico(char c) {
        this.consumoEnergetico = comprobarConsumoEnergetico(c);
    }

    public double getPeso()                { return peso; }
    public void   setPeso(double peso)     { this.peso = peso; }

    //precioFinal 

    public double precioFinal() {
        double precio = precioBase;

        // Incremento por consumo energético
        switch (consumoEnergetico) {
            case 'A': precio += 100; break;
            case 'B': precio +=  80; break;
            case 'C': precio +=  60; break;
            case 'D': precio +=  50; break;
            case 'E': precio +=  30; break;
            case 'F': precio +=  10; break;
        }

        // Incremento por peso
        if      (peso <= 19)              precio +=  10;
        else if (peso >= 20 && peso <= 49) precio +=  50;
        else if (peso >= 50 && peso <= 79) precio +=  80;
        else                               precio += 100;

        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico [precioBase=" + precioBase
                + ", color=" + color
                + ", consumo=" + consumoEnergetico
                + ", peso=" + peso + "]";
    }
}