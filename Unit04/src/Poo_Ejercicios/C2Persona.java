package Poo_Ejercicios;

public class C2Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public C2Persona(String dni, String nombre, String apellidos, int edad) {
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    // Setters con validación básica
    public void setDni(String dni) {
        if (dni != null && !dni.isEmpty()) {
            this.dni = dni;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setApellidos(String apellidos) {
        if (apellidos != null && !apellidos.isEmpty()) {
            this.apellidos = apellidos;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
}
