package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaLista {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		Random random = new Random();
		ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "Caio");
		c1.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c1);
		ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Adriano");
		c2.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c2);
		ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Victor");
		c3.deposita(random.nextInt(10000) + random.nextDouble());
		contas.add(c3);
		
		System.out.println(contas);
	}

}
