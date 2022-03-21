package poo1.demo11;

public class Cuadrado extends Figura {

	@Override
	public double calcularArea() {
		double area = getBase() * getBase();
		return area;
	}
	
	
}
