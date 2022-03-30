package br.com.caelum.contas.modelo;

import java.util.Objects;

/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author Renan
 */

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	String titular;
	int numero;
	String agencia;
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * Metodo que incrementa o saldo.
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor de deposito inválido");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public abstract String getTipo();

	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(agencia, other.agencia) && numero == other.numero;
	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

	@Override
	public String toString() {
		return "[titular=" + titular.toUpperCase() + ", numero=" + numero + ", agencia=" + agencia + "]";
	}
}
