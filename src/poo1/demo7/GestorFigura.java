package poo1.demo7;

public class GestorFigura {

	private Figura[] figuras;
	private int cont;
	
	public GestorFigura() {
		figuras = new Figura[5];
	}
	
	public void agregar(Figura f) {
		figuras[cont] = f;
		cont++;
	}
	
}
