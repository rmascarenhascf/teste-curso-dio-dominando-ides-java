package br.com.dio;

import br.com.dio.model.*;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato(null, null, null);
		livros livros = new livros();
		
		System.out.println(gato);
		System.out.println(livros);

		/*
		 * int a = 2; int b = 3; System.out.println("Hello World!");
		 */

	}

}

class livros {
	private String nome;
	private String npag;
	
}