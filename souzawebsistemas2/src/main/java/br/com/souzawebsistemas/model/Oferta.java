package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="oferta")
public class Oferta extends GenericDomain{
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataOferta;
	@ManyToOne
	private Lancamento lancamento;
	
	@ManyToOne
	private LancamentoLivroCaixa lancamentoLivroCaixa;
	
	@ManyToOne
	private Grupo grupo;
	
	
	@Column(precision=6,scale=2)
	private BigDecimal valorOferta;

	public Date getDataOferta() {
		return dataOferta;
	}

	public void setDataOferta(Date dataOferta) {
		this.dataOferta = dataOferta;
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

	public BigDecimal getValorOferta() {
		return valorOferta;
	}

	public void setValorOferta(BigDecimal valorOferta) {
		this.valorOferta = valorOferta;
	}

	public LancamentoLivroCaixa getLancamentoLivroCaixa() {
		return lancamentoLivroCaixa;
	}

	public void setLancamentoLivroCaixa(LancamentoLivroCaixa lancamentoLivroCaixa) {
		this.lancamentoLivroCaixa = lancamentoLivroCaixa;
	}

	
}
