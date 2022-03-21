package poo1.demo10;

public class Rectangulo extends Figura {

	@Override
	public double calcularArea() {
		double area = getBase() * getAltura();
		return area;
	}
	
}
