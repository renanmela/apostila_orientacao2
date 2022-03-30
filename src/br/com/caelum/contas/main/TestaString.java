package br.com.caelum.contas.main;

public class TestaString {

	public static void main(String[] args) {
		
		String s = "fj11";
		String outra = s.replaceAll("1", "2");
		System.out.println(s);
		System.out.println(outra);
		
		StringBuilder invertido = new StringBuilder(outra).reverse();
		System.out.println(invertido);

	}

}
