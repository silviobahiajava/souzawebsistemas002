package br.com.souzawebsistemas.model;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="MateriaPrima")
public class MateriaPrima extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private String descricao;
	
	private BigDecimal precoUnitario;
	private BigDecimal precoTotal;
	private short quantidadeComprada;
	@ManyToOne
	private ProdutoFabricado produtoFabricado;
	@ManyToOne
	private Grupo grupo;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}
	public short getQuantidadeComprada() {
		return quantidadeComprada;
	}
	public void setQuantidadeComprada(short quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}
	public ProdutoFabricado getProdutoFabricado() {
		return produtoFabricado;
	}
	public void setProdutoFabricado(ProdutoFabricado produtoFabricado) {
		this.produtoFabricado = produtoFabricado;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
}
