package ejercicioAnalisis01Vehiculos;

public abstract class Vehiculo {

    protected String  marca;
    protected String  modelo;
    protected String  color;
    protected String  matricula;
    protected boolean motorEncendido;
    protected int     marchaActual;     // 0 = punto muerto
    protected int     velocidadActual;

    // Constructor 

    public Vehiculo(String marca, String modelo, String color, String matricula) {
        this.marca           = marca;
        this.modelo          = modelo;
        this.color           = color;
        this.matricula       = matricula;
        this.motorEncendido  = false;
        this.marchaActual    = 0;
        this.velocidadActual = 0;
    }

    // Acciones comunes 

    public void arrancar() {
        if (!motorEncendido && velocidadActual == 0) {
            motorEncendido = true;
            System.out.println("Motor encendido.");
        } else if (motorEncendido) {
            System.out.println("El motor ya está encendido.");
        } else {
            System.out.println("No se puede arrancar con el vehículo en movimiento.");
        }
    }

    public void parar() {
        velocidadActual = 0;
        marchaActual    = 0;
        motorEncendido  = false;
        System.out.println("Vehículo parado. Motor apagado. Punto muerto.");
    }

    public void subirMarcha() {
        if (!motorEncendido) {
            System.out.println("El motor está apagado.");
            return;
        }
        if (marchaActual < 5) {
            marchaActual++;
            System.out.println("Subida a marcha " + marchaActual + "ª.");
        } else {
            System.out.println("Ya estás en la marcha más alta (5ª).");
        }
    }

    public void bajarMarcha() {
        if (!motorEncendido) {
            System.out.println("El motor está apagado.");
            return;
        }
        if (marchaActual > 0) {
            marchaActual--;
            String marcha = marchaActual == 0 ? "punto muerto" : marchaActual + "ª";
            System.out.println("Bajada a " + marcha + ".");
        } else {
            System.out.println("Ya estás en punto muerto.");
        }
    }

    // Getters y Setters
    
    public String  getMarca()              { return marca; }
    public void    setMarca(String marca)  { this.marca = marca; }

    public String  getModelo()               { return modelo; }
    public void    setModelo(String modelo)  { this.modelo = modelo; }

    public String  getColor()              { return color; }
    public void    setColor(String color)  { this.color = color; }

    public String  getMatricula()                  { return matricula; }
    public void    setMatricula(String matricula)  { this.matricula = matricula; }

    public boolean isMotorEncendido()              { return motorEncendido; }
    public void    setMotorEncendido(boolean m)    { this.motorEncendido = m; }

    public int     getMarchaActual()               { return marchaActual; }
    public void    setMarchaActual(int m)          { this.marchaActual = m; }

    public int     getVelocidadActual()            { return velocidadActual; }
    public void    setVelocidadActual(int v)       { this.velocidadActual = v; }

    // toString
    
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca
                + ", modelo=" + modelo
                + ", color=" + color
                + ", matricula=" + matricula
                + ", motor=" + (motorEncendido ? "encendido" : "apagado")
                + ", marcha=" + marchaActual
                + ", velocidad=" + velocidadActual + " km/h]";
    }
}