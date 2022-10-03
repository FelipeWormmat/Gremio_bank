package model;

public class Saldo {
	public double saldo;
	public Moeda moeda;
	
	public Saldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Moeda getMoeda() {
		return moeda;
	}
	
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
}
