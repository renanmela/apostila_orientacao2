package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 *
 * @author Renan
 */

public class Conta {

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
     * @param valor
     */
	public void deposita(double valor) {
		this.saldo += valor;
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
	
	public String getTipo() {
		return "Conta";
		}
}
