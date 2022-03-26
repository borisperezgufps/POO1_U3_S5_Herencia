package poo1.demo7;

public class ClienteCuenta {

	public static void main(String[] args) {
		Ahorros ah = new Ahorros(0.1);
		
		ah.depositar(1500);
		ah.depositar(2500);
		ah.depositar(500);
		
		System.out.println(ah.getSaldo());
	}
	
}
