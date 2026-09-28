package Poo_Ejercicios;

public class C4Articulo {

	    private String nombre;
	    private double precio;
	    private int iva;
	    private int cuantosQuedan;

	    // Constructor
	    public C4Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
	        setNombre(nombre);
	        setPrecio(precio);
	        setIva(iva);
	        setCuantosQuedan(cuantosQuedan);
	    }

	    // Getters
	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public int getIva() {
	        return iva;
	    }

	    public int getCuantosQuedan() {
	        return cuantosQuedan;
	    }

	    // Setters con validación
	    public void setNombre(String nombre) {
	        if (nombre != null && !nombre.isEmpty()) {
	            this.nombre = nombre;
	        }
	    }

	    public void setPrecio(double precio) {
	        if (precio >= 0) {
	            this.precio = precio;
	        }
	    }

	    public void setIva(int iva) {
	        if (iva == 4 || iva == 10 || iva == 21) {
	            this.iva = iva;
	        }
	    }

	    public void setCuantosQuedan(int cuantosQuedan) {
	        if (cuantosQuedan >= 0) {
	            this.cuantosQuedan = cuantosQuedan;
	        }
	    }

	    // Método útil
	    public double getPrecioFinal() {
	        return precio + (precio * iva / 100.0);
	    }
	}

