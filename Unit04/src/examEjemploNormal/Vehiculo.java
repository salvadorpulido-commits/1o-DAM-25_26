package examEjemploNormal;

public class Vehiculo {

    // ─── ATRIBUTOS DE INSTANCIA ───────────────────────────────────────────────

    private String matricula;          // Identificador único del vehículo
    private String modelo;             // Nombre comercial del vehículo
    private double precioBaseDia;      // Precio base del alquiler por día
    private double porcentajeRecargo;  // Recargo premium entre 0 y 25%
    private int diasAlquilados;        // Número de días que ha sido alquilado

    // ─── ATRIBUTO ESTÁTICO (COMPARTIDO POR TODOS LOS VEHÍCULOS) ──────────────

    // "static" significa que este valor es el mismo para TODOS los objetos Vehiculo.
    // Si se cambia en uno, cambia en todos. Es ideal para el precio del seguro.
    private static double precioSeguroDiario = 5.0; // Valor inicial por defecto

    // ─── CONSTRUCTORES ────────────────────────────────────────────────────────

    // Constructor completo: permite crear un vehículo con todos sus datos
    public Vehiculo(String matricula, String modelo, double precioBaseDia, double porcentajeRecargo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.precioBaseDia = precioBaseDia;
        this.porcentajeRecargo = porcentajeRecargo;
        this.diasAlquilados = 0; // Al crear el vehículo, aún no ha sido alquilado
    }

    // ─── GETTERS Y SETTERS ────────────────────────────────────────────────────

    // La matrícula es única e inmutable → solo getter, sin setter
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBaseDia() {
        return precioBaseDia;
    }

    public void setPrecioBaseDia(double precioBaseDia) {
        this.precioBaseDia = precioBaseDia;
    }

    public double getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    // Validamos que el porcentaje esté entre 0 y 25 antes de asignarlo
    public void setPorcentajeRecargo(double porcentajeRecargo) {
        if (porcentajeRecargo >= 0 && porcentajeRecargo <= 25) {
            this.porcentajeRecargo = porcentajeRecargo;
        }
    }

    public int getDiasAlquilados() {
        return diasAlquilados;
    }

    public void setDiasAlquilados(int diasAlquilados) {
        this.diasAlquilados = diasAlquilados;
    }

    // El precio del seguro es estático → su getter y setter también son estáticos
    public static double getPrecioSeguroDiario() {
        return precioSeguroDiario;
    }

    // Al ser estático, cambiar este valor afecta a TODOS los vehículos
    public static void setPrecioSeguroDiario(double precio) {
        precioSeguroDiario = precio;
    }

    // ─── MÉTODOS DE NEGOCIO ───────────────────────────────────────────────────

    // Calcula el importe del recargo premium
    // Fórmula: precioBaseDia × porcentajeRecargo / 100
    public double getImporteRecargoPremium() {
        return precioBaseDia * porcentajeRecargo / 100;
    }

    // Calcula el coste total del seguro para los días alquilados
    // Fórmula: diasAlquilados × precioSeguroDiario
    public double getImporteTotalSeguro() {
        return diasAlquilados * precioSeguroDiario;
    }

    // Calcula el ingreso total generado por el vehículo
    // Fórmula: precioBase(por días) + recargo premium + seguro
    public double getIngresoTotal() {
        return (precioBaseDia * diasAlquilados) + getImporteRecargoPremium() + getImporteTotalSeguro();
    }

    // Devuelve true si el porcentaje de recargo premium es mayor al 12%
    // Se usa para identificar vehículos "premium"
    public boolean esPremium() {
        return porcentajeRecargo > 12;
    }

    // ─── EQUALS ───────────────────────────────────────────────────────────────

    // Dos vehículos son iguales si tienen la misma matrícula (identificador único)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                    // Es el mismo objeto en memoria
        if (obj == null) return false;                   // El otro objeto es nulo
        if (!(obj instanceof Vehiculo)) return false;    // No es un Vehiculo
        Vehiculo otro = (Vehiculo) obj;
        return this.matricula.equals(otro.matricula);    // Comparamos matrículas
    }

    // ─── TOSTRING ─────────────────────────────────────────────────────────────

    // Define cómo se muestra el objeto al imprimirlo con System.out.println()
    // Formato especificado en el enunciado
    @Override
    public String toString() {
        return matricula + " - " + modelo + "\n"
             + "Precio Base/Día: " + precioBaseDia
             + " | Recargo Premium: " + getImporteRecargoPremium()
             + " (" + porcentajeRecargo + "%)\n"
             + "Días alquilado: " + diasAlquilados
             + " | Total generado: " + getIngresoTotal();
    }
}