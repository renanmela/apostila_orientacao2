package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, String agencia, String titular, double saldo) {
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}

	public ContaCorrente() {
		this.saldo = saldo;
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public ContaCorrente(int saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public double getValorImposto() {

		return this.getSaldo() * 0.01;
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void saca(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor de saque não pode ser negativo"); //usar exception do java sempre q possivel é uma boa prática
		}
		else if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor); //usado apenas para exemplo de exception criada
		}
		else this.saldo -= (valor + 0.10);
	}
}
