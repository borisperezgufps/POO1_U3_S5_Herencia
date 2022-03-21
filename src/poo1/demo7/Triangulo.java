package poo1.demo7;

public class Triangulo {

	private double base;
	private double altura;
	
	public double calcularArea() {
		double area = base * altura / 2;
		
		return area;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
