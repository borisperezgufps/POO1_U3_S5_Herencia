package poo1.demo7;

public class FiguraTest {

	public static void main(String[] args) {
		Figura f = new Figura();
		f.setAltura(12);
		f.setBase(10);
		f.calcularArea();
		
		Triangulo t = new Triangulo();
		t.setAltura(12);
		t.setBase(10);
		t.calcularArea();
		
		Cuadrado c = new Cuadrado();
		c.setBase(10);
		c.calcularArea();
		
		// Como se puede ver, es posible hacerlo sin utilizar herencia.
		// Pero, qué aspectos identifica que podrían no ser deseables?
		// Rta= Vuelve a los slides
	}
	
}
