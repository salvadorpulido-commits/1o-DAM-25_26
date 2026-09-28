package Crud_Ejercicios;

// Creamos la clase Disco
public class ejercicio04Disco {

    // Creamos el atributo codigo
    private int codigo;

    // Creamos el atributo autor
    private String autor;

    // Creamos el atributo titulo
    private String titulo;

    // Creamos el atributo duracion
    private int duracion;

    // Creamos el atributo genero
    private Genero genero;

    // Creamos el enum para el género musical
    public enum Genero {
        Rock, Pop, Jazz, Blues
    }

    // Creamos el constructor con todos los atributos
    public ejercicio04Disco(int codigo, String autor, String titulo, int duracion, Genero genero) {
        
    	this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    // Getter del código
    public int getCodigo() {
        return codigo;
    }

    // Getter del autor
    public String getAutor() {
        return autor;
    }

    // Setter del autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter del título
    public String getTitulo() {
        return titulo;
    }

    // Setter del título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter de la duración
    public int getDuracion() {
        return duracion;
    }

    // Setter de la duración
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Getter del género
    public Genero getGenero() {
        return genero;
    }

    // Setter del género
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    // Sobrescribimos el método toString
    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Autor: " + autor +
               " | Título: " + titulo +
               " | Duración: " + duracion + " min" +
               " | Género: " + genero;
    }

    // Sobrescribimos el método equals
    @Override
    public boolean equals(Object obj) {
        // Comprobamos si es el mismo objeto
        if (this == obj) {
            return true;
        }
        // Comprobamos si el objeto es null
        if (obj == null) {
            return false;
        }
        // Comprobamos si son de la misma clase
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Convertimos el objeto a Disco
        ejercicio04Disco other = (ejercicio04Disco) obj;
        // Comparamos los códigos
        return codigo == other.codigo;
    }
}
