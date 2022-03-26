package poo1.demo7;

public class CuentaBancaria {

	private int saldo;
	
	public void depositar(int valor){
		if(valor>0) {
			saldo += valor;
		}
	}
	
	public void retirar(int valor) {
		if(valor>0) {
			saldo -= valor;
		}
	}
	
	public int getSaldo() {
		return saldo;
	}
	
}
