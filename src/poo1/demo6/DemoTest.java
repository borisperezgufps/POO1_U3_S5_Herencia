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
		
		Directivo d1 = new Directivo();
		
		d1.setNombres("Katerine");
		d1.setApellidos("Duran");
		d1.setEdad(18);
		
		d1.setSalario(12000);
		d1.setCodigoEmpleado(12312);
		
		d1.setValorBonificacion(1212);
		
		
		// ------------------------------
		
		System.out.println(p1.calcularAnioNacimiento());
		System.out.println(e1.calcularAnioNacimiento());
		System.out.println(d1.calcularAnioNacimiento());
		
	}
	
}
