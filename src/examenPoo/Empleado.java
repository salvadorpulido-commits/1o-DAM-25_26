package examenPoo;


public class Empleado {

	// Iniciamos atributos.	
	
    private String dni;
    private String nombre;
    private double salarioBase;
    private double porcentajeBonificacion;
    private int horasExtra;

   // Precio hora extra static
    public static double precioHoraExtra = 10.5;

    // Constructor 
    
    public Empleado(String dni, String nombre, double salarioBase, double porcentajeBonificacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.porcentajeBonificacion = porcentajeBonificacion;
        this.horasExtra = 0;
    }

    // Getters - Setters
    public String getDni() {
        return dni;
    }

    public double getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void  setPorcentajeBonificacion(double porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }

    // calculamosd bonificacion
    public double calcularBonificacion() {
        return salarioBase * porcentajeBonificacion / 100;
    }

    // calculamos importe horas extra
    
    public double calcularHorasExtra() {
        return horasExtra * precioHoraExtra;
    }

    // salario total
    
    public double calcularSalarioTotal() {
        return salarioBase + calcularBonificacion() + calcularHorasExtra();
    }

    // alto desempeño
    
    public boolean esAltoDesempeño() {
        return porcentajeBonificacion > 15;
    }
    
    //

    @Override
    public String toString() {
    	
        return dni + " - " + nombre + "\nSalario Base: " + salarioBase +
                "  Bonificacion: " + calcularBonificacion()  +
                " (" + porcentajeBonificacion + "%)\nHoras Extra: " + horasExtra  +
                "  Total Bruto: " + calcularSalarioTotal();
    }

   
  
}


