package poo1.demo7;

public class Ahorros extends CuentaBancaria{

	private double interes;
	
	public Ahorros(double interes) {
		this.interes = interes;
	}
	
	public void depositar(int valor) {
		
		int saldo = getSaldo();
		
		int valorInteres = (int)(saldo * interes);
		
		int valorFinal = valorInteres + valor;
		
		super.depositar(valorFinal);
		
	}
	
}
