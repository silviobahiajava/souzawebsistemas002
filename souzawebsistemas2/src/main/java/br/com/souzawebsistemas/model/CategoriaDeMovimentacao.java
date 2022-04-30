package br.com.souzawebsistemas.model;
import javax.persistence.*;

@Entity
@Table(name="categoria_movimentacao_financeira")
public class CategoriaDeMovimentacao extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private String nomeMovimentacao;
	public String getNomeMovimentacao() {
		return nomeMovimentacao;
	}
	public void setNomeMovimentacao(String nomeMovimentacao) {
		this.nomeMovimentacao = nomeMovimentacao;
	}
	
}
