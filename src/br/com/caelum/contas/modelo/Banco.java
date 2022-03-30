package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private String nome;
	private int numero;
	private List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> indexadoPorNome = new HashMap<>();

	// Outros atributos que você achar necessário.
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	// Getters para nome e número. Não colocar os setters, pois já recebemos no
	// construtor

	public void adiciona(Conta conta) {
		contas.add(conta);
		indexadoPorNome.put(conta.getTitular(), conta);
	}

	public Conta pega(int posicao) {
		return contas.get(posicao);
	}

	public void mostraContas() {
		for (int i = 0; i < this.contas.size(); i++) {
			Conta conta = this.contas.get(i);
			if (conta != null) {
				System.out.println("Conta na posição: " + i);
				System.out.println("Dados da conta: " + conta);
			}
		}
	}

	public Conta buscaPorTitular(String nomeDoTitular) {
		return indexadoPorNome.get(nomeDoTitular);
	}

	public int getQuantidadeDeContas() {
		return contas.size();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
}
