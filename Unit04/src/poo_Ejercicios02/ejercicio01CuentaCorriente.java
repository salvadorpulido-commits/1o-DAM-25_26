package poo_Ejercicios02;

// Creamos la clase ejercicio01CuentaCorriente
public class ejercicio01CuentaCorriente {

    // Declaramos los atributos de la clase
    private String dni;
    private String nombre;
    private double saldo;
    private String nacionalidad; // Española o Extranjera

    // Constructor con DNI y saldo inicial
    public ejercicio01CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nacionalidad = "Española";
    }

    // Constructor con DNI, nombre y saldo inicial
    public ejercicio01CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.nacionalidad = "Española";
    }

    // Constructor con DNI, nombre, saldo inicial y nacionalidad
    public ejercicio01CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
        this.nacionalidad = nacionalidad;
    }

    // Getter del DNI
    public String getDni() {
        return dni;
    }

    // Setter del DNI
    public void setDni(String dni) {
        this.dni = dni;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter del saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Getter de la nacionalidad
    public String getNacionalidad() {
        return nacionalidad;
    }

    // Setter de la nacionalidad
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {

        // Comprobamos que haya saldo suficiente
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Método para ingresar dinero
    public boolean ingresarDinero(double cantidad) {

        // Comprobamos que la cantidad sea positiva
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "DNI: " + dni +
               ", Nombre: " + nombre +
               ", Saldo: " + saldo +
               ", Nacionalidad: " + nacionalidad;
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {

        // Comprobamos si es el mismo objeto
        if (this == obj) {
            return true;
        }

        // Comprobamos si el objeto es nulo o de otra clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Convertimos el objeto a ejercicio01CuentaCorriente
        ejercicio01CuentaCorriente otra = (ejercicio01CuentaCorriente) obj;

        // Comparamos DNI y nombre
        return this.dni.equals(otra.dni) && this.nombre.equals(otra.nombre);
    }
}


