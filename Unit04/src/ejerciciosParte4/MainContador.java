package ejerciciosParte4;

public class MainContador {
	
	  public static void main(String[] args) {
	        Contador c = new Contador();       // cont = 0

	        c.incrementar();                   // cont = 1
	        c.incrementar();                   // cont = 2
	        c.decrementar();                   // cont = 1
	        c.decrementar();                   // cont = 0
	        c.decrementar();                   // cont = 0 (no baja de 0)

	        System.out.println(c);             // Contador{cont=0}

	        Contador c2 = new Contador(-5);    // cont = 0 (negativo rechazado)
	        Contador c3 = new Contador(10);    // cont = 10
	        c3.setCont(-3);                    // cont = 0 (setter rechaza negativo)
	    }
	}