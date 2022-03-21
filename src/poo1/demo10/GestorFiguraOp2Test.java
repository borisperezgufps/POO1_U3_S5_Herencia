package poo1.demo10;

public class GestorFiguraOp2Test {

	public static void main(String[] args) {
		
		GestorFiguraOp2 gf2 = new GestorFiguraOp2(3);
		
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
		
		// Y se podría simplificar aún más la implementación?
		// Rta= Vuelve a slides
		
	}
	
}
