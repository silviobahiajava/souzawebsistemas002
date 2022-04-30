package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.*;
@Entity
@Table(name="contribuicao")
public class Contribuicao extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataContribuicao;
	@ManyToOne
	private Lancamento lancamento;
	
	@OneToOne
	private Membro contribuinte;
	
	@ManyToOne
	private Grupo grupo;
	
	private BigDecimal valorContribuicao;

	public Date getDataContribuicao() {
		return dataContribuicao;
	}

	public void setDataContribuicao(Date dataContribuicao) {
		this.dataContribuicao = dataContribuicao;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public Membro getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(Membro contribuinte) {
		this.contribuinte = contribuinte;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public BigDecimal getValorContribuicao() {
		return valorContribuicao;
	}

	public void setValorContribuicao(BigDecimal valorContribuicao) {
		this.valorContribuicao = valorContribuicao;
	}
	
	
}
