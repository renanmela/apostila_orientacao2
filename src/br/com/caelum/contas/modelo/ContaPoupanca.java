package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}

	public ContaPoupanca() {
		this.saldo = saldo;
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public ContaPoupanca(int saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}

	public String getTipo() {
		return "Conta Poupança";
	}
}
