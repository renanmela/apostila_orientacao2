package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(100.0);

		System.out.println(conta.getSaldo());
		conta.saca(50.0);

		System.out.println(conta.getSaldo());
	}
}
