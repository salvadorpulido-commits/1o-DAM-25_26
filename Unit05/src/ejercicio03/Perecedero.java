package ejercicio03;

public class Perecedero extends Producto {
    private int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public double calcular(int cantidad) {
        double precioFinal = super.calcular(cantidad); // Calculamos el precio base
        
        // Aplicamos las reducciones según los días
        switch (diasACaducar) {
            case 1:
                precioFinal /= 4;
                break;
            case 2:
                precioFinal /= 3;
                break;
            case 3:
                precioFinal /= 2;
                break;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Perecedero | Caduca en: " + diasACaducar + " días";
    }
}