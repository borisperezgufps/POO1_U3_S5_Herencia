package poo1.demo6;

public class Persona {

	private String nombres;
	private String apellidos;
	private int edad;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int calcularAnioNacimiento() {
		int anioActual = 2021;
		int anioNacimiento = anioActual - edad;
		return anioNacimiento;
	}
	
}
