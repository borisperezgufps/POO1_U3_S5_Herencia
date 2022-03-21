package poo1.demo5;

public class PersonaTest {
	
	public static void main(String[] args) {
		Persona p0 = new Persona();
		Persona p1 = new Persona("Carlos");
		Persona p2 = new Persona("Rafael", "Martinez");
		Persona p3 = new Persona("Maribel", "Sepulveda", 45);
		
		System.out.println("Nombre = " + p0.getNombre());
		System.out.println("Nombre = " + p1.getNombre());
		System.out.println("Nombre = " + p2.getNombre());
		System.out.println("Nombre = " + p3.getNombre());
	}

}
