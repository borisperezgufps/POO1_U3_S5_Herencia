package poo1.demo8;

public class Cuadrado extends Figura {

	public double calcularAreaCuadrado() {
		double area = getBase() * getBase();
		// Por qué no se podría hacer esto:
		// double area = base * base; 
		
		return area;
	}
	
	
}
