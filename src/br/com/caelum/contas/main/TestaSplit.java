package br.com.caelum.contas.main;

public class TestaSplit {

	public static void main(String[] args) {

		String frase = "Uma mensagem qualquer";
		invertePalavrasDaFrase(frase);

	}

	public static void invertePalavrasDaFrase(String texto) {
		String[] palavras = texto.split(" ");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}
		System.out.println("");
	}
}