package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import javax.persistence.*;
@Entity
@Table(name="ProdutoFabricado")
public class ProdutoFabricado extends GenericDomain{

	private static final long serialVersionUID = 1L;
	private String descricao;
	private BigDecimal precoDeVenda;
	private int quantidadeMateriaPrimaUsada;
	private int quantidadeFabricada;
	
	@ManyToOne
	private Grupo grupo;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPrecoDeVenda() {
		return precoDeVenda;
	}
	public void setPrecoDeVenda(BigDecimal precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	public int getQuantidadeFabricada() {
		return quantidadeFabricada;
	}
	public void setQuantidadeFabricada(int quantidadeFabricada) {
		this.quantidadeFabricada = quantidadeFabricada;
	}
	public int getQuantidadeMateriaPrimaUsada() {
		return quantidadeMateriaPrimaUsada;
	}
	public void setQuantidadeMateriaPrimaUsada(int quantidadeMateriaPrimaUsada) {
		this.quantidadeMateriaPrimaUsada = quantidadeMateriaPrimaUsada;
	}
	
	
}
