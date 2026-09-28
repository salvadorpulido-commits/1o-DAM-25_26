package tiendadiscos.modelo;

/**
 * Clase abstracta que representa un producto genérico de la tienda de discos.
 * Es la base de la jerarquía de productos.
 *
 * @author Salvador Pulido
 * @version 1.0
 */
public abstract class Producto {

    /** Identificador único del producto. */
    private String id;

    /** Nombre del producto. */
    private String nombre;

    /** Precio del producto en euros. */
    private double precio;

    /** Cantidad disponible en stock. */
    private int stock;

    /**
     * Constructor por parámetros.
     *
     * @param id     Identificador único.
     * @param nombre Nombre del producto.
     * @param precio Precio en euros.
     * @param stock  Cantidad en stock.
     */
    public Producto(String id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Constructor de copia.
     *
     * @param otro Producto a copiar.
     */
    public Producto(Producto otro) {
        this.id = otro.id;
        this.nombre = otro.nombre;
        this.precio = otro.precio;
        this.stock = otro.stock;
    }

    // ── Getters y Setters ──────────────────────────────────────

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // ── Métodos abstractos ─────────────────────────────────────

    /**
     * Devuelve el tipo de producto (CD, Vinilo, Merchandising...).
     *
     * @return String con el tipo.
     */
    public abstract String getTipo();

    /**
     * Devuelve una descripción detallada del producto.
     *
     * @return String con la descripción.
     */
    public abstract String getDescripcion();

    // ── Métodos sobreescritos ──────────────────────────────────

    @Override
    public String toString() {
        return String.format("[%s] %s - %.2f€ (Stock: %d)", id, nombre, precio, stock);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto)) return false;
        Producto otro = (Producto) obj;
        return this.id.equals(otro.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}