package br.com.souzawebsistemas.enums;

public enum TipoCadastroEnum {

	ATIVO("ATIVO"),
	INATIVO("INATIVO");
	
	private String descricao;
	private TipoCadastroEnum(String descricao){
		this.descricao=descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
}
