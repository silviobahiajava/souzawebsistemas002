package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.*;

@Entity
@Table(name="oferta_das_criancas")
public class OfertaDasCriancas extends GenericDomain{
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataOfertaCrianca;
	@ManyToOne
	private Lancamento lancamento;
	
	private String descricao;
	
	@ManyToOne
	private Grupo grupo;
	
	
	@Column(precision=6,scale=2)
	private BigDecimal valorOfertaCrianca;

	

	public Date getDataOfertaCrianca() {
		return dataOfertaCrianca;
	}

	public void setDataOfertaCrianca(Date dataOfertaCrianca) {
		this.dataOfertaCrianca = dataOfertaCrianca;
	}

	public BigDecimal getValorOfertaCrianca() {
		return valorOfertaCrianca;
	}

	public void setValorOfertaCrianca(BigDecimal valorOfertaCrianca) {
		this.valorOfertaCrianca = valorOfertaCrianca;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

	

}
