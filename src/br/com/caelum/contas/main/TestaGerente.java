package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());

	}

}
