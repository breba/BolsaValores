package com.br.joseAntonio;

public class Acao {
	private Long id;
	private float preco;
	
	public Acao(Long id, float preco){
		this.id = id;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
