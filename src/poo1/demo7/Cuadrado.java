package poo1.demo7;

public class Cuadrado extends Figura{

	/**
	 * 
	 * @param lado Corresponde a uno de los dos lados del cuadrado, y son 4 lados.
	 * @param ninguno No se usa en este métdo, pero fue heredado.
	 */
	public double calcularArea(int lado) {
		double area = lado * lado;		
		return area;
	}
	
	
}
