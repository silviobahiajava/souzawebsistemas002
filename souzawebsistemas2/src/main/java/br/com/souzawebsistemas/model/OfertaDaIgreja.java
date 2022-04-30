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
@Table(name="oferta_da_igreja")
public class OfertaDaIgreja extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataOfertaIgreja;
	
	@ManyToOne
	private Lancamento lancamento;
	
	private String descricao;
	
	private String tipodeoferta;
	
	
	@ManyToOne
	private Grupo grupo;
	
	
	@Column(precision=6,scale=2)
	private BigDecimal valorOfertaIgreja;


	public Date getDataOfertaIgreja() {
		return dataOfertaIgreja;
	}


	public void setDataOfertaIgreja(Date dataOfertaIgreja) {
		this.dataOfertaIgreja = dataOfertaIgreja;
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


	public BigDecimal getValorOfertaIgreja() {
		return valorOfertaIgreja;
	}


	public void setValorOfertaIgreja(BigDecimal valorOfertaIgreja) {
		this.valorOfertaIgreja = valorOfertaIgreja;
	}


	public String getDescricao() {
		return descricao;
	}
	
	


	public String getTipodeoferta() {
		return tipodeoferta;
	}


	public void setTipodeoferta(String tipodeoferta) {
		this.tipodeoferta = tipodeoferta;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
