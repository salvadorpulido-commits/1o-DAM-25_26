package Poo_Ejercicios;

public class B1Rectangulo {

	
	    int x1, y1, x2, y2;

	    // Constructor con validación de esquina inferior izquierda y superior derecha
	    public B1Rectangulo(int x1, int y1, int x2, int y2) {
	        if (x1 < x2 && y1 < y2) {
	            this.x1 = x1;
	            this.y1 = y1;
	            this.x2 = x2;
	            this.y2 = y2;
	        } else {
	            System.out.println("Coordenadas inválidas. Se usan valores por defecto (0,0,1,1).");
	            this.x1 = 0;
	            this.y1 = 0;
	            this.x2 = 1;
	            this.y2 = 1;
	        }
	    }

	    public int getAncho() {
	        return x2 - x1;
	    }

	    public int getAlto() {
	        return y2 - y1;
	    }

	    public int getPerimetro() {
	        return 2 * (getAncho() + getAlto());
	    }

	    public int getArea() {
	        return getAncho() * getAlto();
	    }

	    public String toString() {
	        return "Rectángulo: (" + x1 + "," + y1 + ") a (" + x2 + "," + y2 + ")";
	    }
	}
