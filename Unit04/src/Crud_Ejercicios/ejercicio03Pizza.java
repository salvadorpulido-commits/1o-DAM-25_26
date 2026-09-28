package Crud_Ejercicios;

// Creamos la clase Pizza
public class ejercicio03Pizza {

    // Creamos el atributo codigo
    private int codigo;

    // Creamos el atributo tipo
    private String tipo;

    // Creamos el atributo tamaño
    private String tamaño;

    // Creamos el atributo estado (pedida o servida)
    private String estado;

    // Creamos el constructor
    public ejercicio03Pizza(int codigo, String tipo, String tamaño) {
        // Asignamos el código
        this.codigo = codigo;
        // Asignamos el tipo
        this.tipo = tipo;
        // Asignamos el tamaño
        this.tamaño = tamaño;
        // Inicializamos el estado como pedida
        this.estado = "Pedida";
    }

    // Creamos el método getCodigo
    public int getCodigo() {
        return codigo;
    }

    // Creamos el método getEstado
    public String getEstado() {
        return estado;
    }

    // Creamos el método setEstado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Sobrescribimos el método toString
    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Tipo: " + tipo +
               " | Tamaño: " + tamaño +
               " | Estado: " + estado;
    }
}
