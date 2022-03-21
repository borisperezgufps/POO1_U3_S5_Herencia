package poo1.demo6;

public class DemoTest {

	public static void main(String[] args) {
		
		// ------------------------------
		
		Persona p1 = new Persona();
		
		p1.setApellidos("Rodriguez");
		p1.setNombres("Raul");
		p1.setEdad(22);
		
		// ------------------------------
		
		Empleado e1 = new Empleado();
		
		e1.setApellidos("Menendez");
		e1.setNombres("Marcela");
		e1.setEdad(25);
		
		e1.setSalario(25000);
		e1.setCodigoEmpleado(2234);
		
		// ------------------------------
		
		System.out.println(p1.calcularAnioNacimiento());
		System.out.println(e1.calcularAnioNacimiento());
		
	}
	
}
