package poo1.demo5;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {	
		this("Boris", "Perez", 20);
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, 
			String apellido) {
		
		this(nombre);
		this.apellido = apellido;
	}
	
	public Persona(String nombre, 
			String apellido, int edad) {
		
		this(nombre, apellido);
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}

