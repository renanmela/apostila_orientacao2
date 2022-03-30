package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class TestaContas {

	public static void main(String[] args) {
		
		SistemaBancario.mostraTela(true);
		//TelaDeContas.main(args);
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

	}

}
