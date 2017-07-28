package br.com.threeway.locadora.domain;

public enum TipoFilme {

	CATALOGO("Catálogo"), LANCAMENTO("Lançamento"), SUPER_LANCAMENTO("Super Lançamento");

	private String nome;

	TipoFilme(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}