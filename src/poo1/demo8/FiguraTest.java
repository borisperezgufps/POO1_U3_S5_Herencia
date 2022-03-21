package poo1.demo8;

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
		t.calcularAreaTriangulo();
		
		Cuadrado c = new Cuadrado();
		c.setBase(10);
		c.calcularArea();
		c.calcularAreaCuadrado();
		
		// Como se puede ver, es posible hacerlo utilizando herencia.
		// Pero, es deseable este comportamiento?
		// Rta= Vuelve a los slides
	}
	
}
