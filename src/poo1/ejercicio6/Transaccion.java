package poo1.ejercicio6;

public class Transaccion {

	private CuentaBancaria origen;
	private CuentaBancaria destino;
	
	public CuentaBancaria getOrigen() {
		return origen;
	}
	public void setOrigen(CuentaBancaria origen) {
		this.origen = origen;
	}
	public CuentaBancaria getDestino() {
		return destino;
	}
	public void setDestino(CuentaBancaria destino) {
		this.destino = destino;
	}
	
	public boolean realizarTransaccion(double monto) {
		boolean exito = false;
		
		double saldoOrigen = origen.getSaldo();
		if(monto<saldoOrigen) {
			double nuevoSaldo = saldoOrigen - monto;
			origen.setSaldo(nuevoSaldo);
			
			destino.setSaldo(destino.getSaldo() + monto);
			exito = true;
		}
		
		return exito;
	}
	
}
