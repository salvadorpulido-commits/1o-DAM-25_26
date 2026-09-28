package Crud_Ejercicios;

		// Creamos la clase Alumno

public class ejercicio01Alumnos {

	
        // Creamos el atributo nombre
	    private String nombre;

	    // Creamos el atributo nota
	    private double nota;

	    // Creamos el constructor con nombre y nota
	    public ejercicio01Alumnos(String nombre, double nota) {
	        // Asignamos el nombre recibido al atributo nombre
	        this.nombre = nombre;
	        // Asignamos la nota recibida al atributo nota
	        this.nota = nota;
	    }

	    // Creamos el método getNombre
	    public String getNombre() {
	        // Devolvemos el nombre del alumno
	        return nombre;
	    }

	    // Creamos el método getNota
	    public double getNota() {
	        // Devolvemos la nota del alumno
	        return nota;
	    }

	    // Creamos el método setNota
	    public void setNota(double nota) {
	        // Modificamos la nota del alumno
	        this.nota = nota;
	    }

	    // Sobrescribimos el método toString
	    @Override
	    public String toString() {
	        // Devolvemos el alumno en formato texto
	        return nombre + " - Nota: " + nota;
	    }
	}

