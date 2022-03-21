package poo1.demo11;

public class Figura {

	private double base;
	private double altura;
	
	/**
	 * Este método establece un comportamiento esperado
	 * o deseado por los hijos. Se espera entonces
	 * que los hijos sobreescriban este método de acuerdo
	 * con los requerimientos propios de cada figura geométrica.
	 * @return
	 */
	public double calcularArea() {
		double area = base * altura;
		
		return area;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}

