package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
@Entity
public class DespesaCrianca extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Grupo grupo;
	@ManyToOne
	private Lancamento lancamento;
	
	private String descricao;
	@Column(precision=10,scale=2)
	private BigDecimal valorDespescaCrianca;
	
	@Temporal(TemporalType.DATE)
	private Date dataPagamentoDespesaCrianca;
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public Lancamento getLancamento() {
		return lancamento;
	}
	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValorDespescaCrianca() {
		return valorDespescaCrianca;
	}
	public void setValorDespescaCrianca(BigDecimal valorDespescaCrianca) {
		this.valorDespescaCrianca = valorDespescaCrianca;
	}
	public Date getDataPagamentoDespesaCrianca() {
		return dataPagamentoDespesaCrianca;
	}
	public void setDataPagamentoDespesaCrianca(Date dataPagamentoDespesaCrianca) {
		this.dataPagamentoDespesaCrianca = dataPagamentoDespesaCrianca;
	}
	
	
}
