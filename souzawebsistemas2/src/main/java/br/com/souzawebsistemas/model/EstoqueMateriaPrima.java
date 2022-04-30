package br.com.souzawebsistemas.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="EstoqueMateriaPrima")
public class EstoqueMateriaPrima extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private String descricao;
	private int quantidadeComprada;
	private int quantidadeVendida;
	private int quantidadeAtual;
	private int quantidadeMinina;
	
	@OneToOne
	private Grupo grupo;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}
	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}
	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}
	public void setQuantidadeAtual(int quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}
	public int getQuantidadeMinina() {
		return quantidadeMinina;
	}
	public void setQuantidadeMinina(int quantidadeMinina) {
		this.quantidadeMinina = quantidadeMinina;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
}
