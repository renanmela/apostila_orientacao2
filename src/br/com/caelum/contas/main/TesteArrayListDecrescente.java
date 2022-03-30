package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteArrayListDecrescente {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		Collections.sort(lista);
		Collections.reverse(lista);
		for (Integer i : lista) {
			System.out.print(i + " ");
		}

	}

}
