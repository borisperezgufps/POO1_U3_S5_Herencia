package poo1.demo11;

public class GestorFiguraTest {

	public static void main(String[] args) {
		
		GestorFigura gf2 = new GestorFigura(3);
		
		gf2.adicionarFigura('C', 10, 0);
		gf2.adicionarFigura('C', 15, 0);
		gf2.adicionarFigura('C', 20, 0);
		
		gf2.adicionarFigura('T', 5, 15);
		gf2.adicionarFigura('T', 3, 13);
		gf2.adicionarFigura('T', 2, 25);
		
		gf2.adicionarFigura('R', 7, 75);
		gf2.adicionarFigura('R', 2, 53);
		gf2.adicionarFigura('R', 4, 15);
		
		gf2.imprimirAreaFiguras();
		
		
	}
	
}
