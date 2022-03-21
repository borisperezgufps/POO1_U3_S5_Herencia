package poo1.demo10;

public class GestorFiguraOp1Test {

	public static void main(String[] args) {
		
		GestorFiguraOp1 gf1 = new GestorFiguraOp1(3);
		gf1.adicionarCuadrado(10);
		gf1.adicionarCuadrado(15);
		gf1.adicionarCuadrado(20);
		
		gf1.adicionarRectangulo(5, 15);
		gf1.adicionarRectangulo(3, 13);
		gf1.adicionarRectangulo(2, 25);
		
		gf1.adicionarTriangulo(7, 75);
		gf1.adicionarTriangulo(2, 53);
		gf1.adicionarTriangulo(4, 15);
		
		gf1.imprimirAreaCuadrados();
		gf1.imprimirAreaTriangulos();
		gf1.imprimirAreaRectangulos();
		
		// Antes de revisar la segunda alternativa, es importante
		// conocer el concepto de polimorfismo. 
		// Vuelve a los slides.
	}
	
}
