package org.lessons.lambda;

public class Gift {
	private String nome;

	private int prezzo;
	
	public Gift(String nome, int prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
}
