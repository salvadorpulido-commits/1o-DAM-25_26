package Poo_Ejercicios;

		
		public class PrincipalPunto {
		    public static void main(String[] args) {

		        Punto p1 = new Punto();
		        p1.x = 5;
		        p1.y = 0;

		        Punto p2 = new Punto();
		        p2.x = 10;
		        p2.y = 10;

		        Punto p3 = new Punto();
		        p3.x = -3;
		        p3.y = 7;

		        System.out.println("(" + p1.x + "," + p1.y + ")");
		        System.out.println("(" + p2.x + "," + p2.y + ")");
		        System.out.println("(" + p3.x + "," + p3.y + ")");

		        p1.x += 2;
		        p1.y *= 2;

		        p2.x -= 5;
		        p2.y += 1;

		        p3.x = 0;
		        p3.y = -1;

		        System.out.println("(" + p1.x + "," + p1.y + ")");
		        System.out.println("(" + p2.x + "," + p2.y + ")");
		        System.out.println("(" + p3.x + "," + p3.y + ")");
		    }
		}

