package persona;

public class CuentaBancaria {
	private String numero;
	private double saldo;
	
	public double recarga(double importe){
		return saldo = importe + this.getSaldo();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
