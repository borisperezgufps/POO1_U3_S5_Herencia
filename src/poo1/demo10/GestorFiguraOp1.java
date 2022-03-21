package poo1.demo10;

public class GestorFiguraOp1 {

	private Cuadrado[] cuadrados;
	private Triangulo[] triangulos;
	private Rectangulo[] rectangulos;
	
	private int indiceCuadrados;
	private int indiceTriangulos;
	private int indiceRectangulos;
	
	public GestorFiguraOp1(int tamanio) {
		cuadrados = new Cuadrado[tamanio];
		triangulos = new Triangulo[tamanio];
		rectangulos = new Rectangulo[tamanio];
	}
	
	
	public void adicionarCuadrado(double base) {
		Cuadrado c = new Cuadrado();
		c.setBase(base);
		cuadrados[indiceCuadrados] = c;
		indiceCuadrados++;
	}
	
	public void adicionarRectangulo(double base, double altura) {
		Rectangulo r = new Rectangulo();
		r.setBase(base);
		r.setAltura(altura);
		rectangulos[indiceRectangulos] = r;
		indiceRectangulos++;
	}
	
	public void adicionarTriangulo(double base, double altura) {
		Triangulo t = new Triangulo();
		t.setBase(base);
		t.setAltura(altura);
		triangulos[indiceTriangulos] = t;
		indiceTriangulos++;
	}
	
	public void imprimirAreaCuadrados() {
		for(int t = 0;t<cuadrados.length;t++) {
			Cuadrado cua = cuadrados[t];
			double area = cua.calcularArea();
			System.out.println("El area de este cuadrado es: "+area);
		}
	}
	
	public void imprimirAreaTriangulos() {
		for(int t = 0;t<triangulos.length;t++) {
			Triangulo tri = triangulos[t];
			double area = tri.calcularArea();
			System.out.println("El area de este triángulo es: "+area);
		}
	}
	
	public void imprimirAreaRectangulos() {
		for(int t = 0;t<rectangulos.length;t++) {
			Rectangulo rec = rectangulos[t];
			double area = rec.calcularArea();
			System.out.println("El area de este rectángulo es: "+area);
		}
	}
	
}
