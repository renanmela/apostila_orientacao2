package br.com.caelum.contas.main;

import br.com.caelum.contas.exception.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteExeption {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.deposita(10);
		
		cc.deposita(-100);
		
		try {
			cc.saca(100);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
