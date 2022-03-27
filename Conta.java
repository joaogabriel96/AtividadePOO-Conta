package entites;

public class Conta {
	
	private String titular;
	private int numconta;
	private double saldo;
	
	
	public String getTitular() {
		return titular;
	
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumconta() {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Saque (float numSaque) {
		this.saldo = this.saldo - numSaque;
		
	}
	
	public void Deposito (float numDepos) {
		this.saldo = this.saldo + numDepos;
	}

}
