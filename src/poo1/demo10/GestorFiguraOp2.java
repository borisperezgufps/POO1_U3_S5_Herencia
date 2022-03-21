package poo1.demo10;

public class GestorFiguraOp2 {

	private Figura[] figuras;
	
	private int indiceFiguras;
	
	public GestorFiguraOp2(int tamanio) {
		figuras = new Figura[tamanio];
	}
	
	/**
	 * 
	 * @param tipoFigura 'C' Cuadrado, 'T' Triangulo, 'R' Rectangulo
	 * @param base
	 * @param altura
	 */
	public void adicionarFigura(char tipoFigura, double base, double altura) {
		
		Figura f = null;
		
		if(tipoFigura=='C') {
			f = new Cuadrado();
			f.setBase(base);
			// No se guarda la altura porque no es requerida.
			// Simplemente se ignora.
		}else if(tipoFigura=='T') {
			f = new Triangulo();
			f.setBase(base);
			f.setAltura(altura);
		}else if(tipoFigura=='R') {
			f = new Rectangulo();
			f.setBase(base);
			f.setAltura(altura);
		}
		
		figuras[indiceFiguras] = f;
		indiceFiguras++;
	}
	
	public void imprimirAreaFiguras() {
		for(int t = 0;t<figuras.length;t++) {
			Figura fig = figuras[t];
			double area = fig.calcularArea(); 	// Esta invocación solo fue posible por la 
												// sobreescritura de métodos del polimorfismo.
												// Con métodos particulares no se hubiera podido.
			System.out.println("El area de esta figura es: "+area);
		}
	}
	
}
