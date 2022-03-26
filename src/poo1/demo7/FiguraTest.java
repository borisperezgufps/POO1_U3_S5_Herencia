package poo1.demo7;

public class FiguraTest {

	public static void main(String[] args) {
		Figura f = new Figura();
		System.out.println(f.calcularArea(10, 10));
		
		Triangulo t = new Triangulo();
		System.out.println(t.calcularArea(10,10));
		
		Cuadrado c = new Cuadrado();
		System.out.println(c.calcularArea(10,10));
		
		Circulo ci = new Circulo();
		System.out.println(ci.calcularArea(10));
		
		// Como se puede ver, es posible hacerlo sin utilizar herencia.
		// Pero, qué aspectos identifica que podrían no ser deseables?
		// Rta= Vuelve a los slides
		
		GestorFigura gf = new GestorFigura();
		
		gf.agregar(f);
		gf.agregar(t);
		gf.agregar(ci);
		gf.agregar(c);
		
		
		Figura fg = new Figura();
		Figura fc = new Cuadrado();
		Figura ft = new Triangulo();
		Figura fci = new Circulo();
		
		Cuadrado c2 = new Cuadrado();
		
		calcular(fg, 10, 10);
		calcular(fc, 10, 10);
		calcular(ft, 10, 10);
		calcular(c2, 10, 10);
		System.out.println("---");
		calcular(fci, 10, 10);
		
	}
	
	public static void calcular(Figura f, int v1, int v2){
		System.out.println(f.calcularArea(v1, v2));
	}
	
	
	
	public static void calcularCirculo(Circulo t, int v1, int v2) {
		System.out.println(t.calcularArea(v1, v2));
	}
	
	public static void calcularTriangulo(Triangulo t, int v1, int v2) {
		System.out.println(t.calcularArea(v1, v2));
	}
	
	public static void calcularCuadrado(Cuadrado t, int v1, int v2) {
		System.out.println(t.calcularArea(v1, v2));
	}
	
}











