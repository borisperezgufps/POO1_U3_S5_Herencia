package poo1.demo11;

public class Triangulo extends Figura{

	@Override
	public double calcularArea() {
		double area = super.calcularArea() / 2;
		return area;
	}
		
}
