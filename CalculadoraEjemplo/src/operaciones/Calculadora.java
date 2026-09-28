package operaciones;

public class Calculadora {
	private int num1;
	private int num2;

	public Calculadora() {
	}

	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int suma() {
		return num1 + num2;
	}

	// Método resta modificado
	
	public int resta() {
		int resul;
		if (resta2())
			resul = num1 - num2;
		else
			resul = num2 - num1;
		return resul;
	}

	// Nuevo método resta2
	
	public boolean resta2() {
		if (num1 >= num2)
			return true;
		else
			return false;
	}

	public int multiplica() {
		return num1 * num2;
	}

	public int divide() {
		return num1 / num2;
	}

	// Nuevo método divide2 (devuelve un objeto Integer, por eso puede ser null)
	
	public Integer divide2() {
		Integer resul;
		if (num2 == 0)
			resul = null;
		else
			resul = num1 / num2;
		return resul;
	}

	// Nuevo método divide0 (lanza excepción explícita)
	
	public int divide0() {
		if (num2 == 0)
			throw new java.lang.ArithmeticException("Division por 0");
		else {
			int resul = num1 / num2;
			return resul;
		}
	}
}
