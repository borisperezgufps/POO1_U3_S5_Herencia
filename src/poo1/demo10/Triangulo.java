package poo1.demo10;

public class Triangulo extends Figura{

	@Override
	public double calcularArea() {
		double area = getBase() * getAltura() / 2;		
		return area;
	}
		
}
