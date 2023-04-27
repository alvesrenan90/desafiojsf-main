package br.com.conam.desafiojsf.entity;

public enum PaisOrigem {
	Brasil,
	Outros;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
