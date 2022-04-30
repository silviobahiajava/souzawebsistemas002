package br.com.souzawebsistemas.model;

import java.math.BigDecimal;

import javax.persistence.*;
@Entity
@Table(name="produto")
public class Produto extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private String descricao;
	
	@Column(precision=7,scale=2)
	private BigDecimal preco;
	private Integer quantidade;
	private BigDecimal total;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
	

}
