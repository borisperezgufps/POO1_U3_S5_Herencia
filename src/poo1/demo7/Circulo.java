package poo1.demo7;

public class Circulo extends Figura{

	/**
	 * Se calcula el area
	 * @param radio Se usa para el cálculo del área
	 * @param otro Se ignora por completo. No sirve.
	 */
	public double calcularArea(int radio) {
		double area = 3.1416 * Math.pow(radio, 2);
		return area;
	}
	
}
