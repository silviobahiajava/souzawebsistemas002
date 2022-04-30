package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="campanha_da_igreja")
public class CampanhaDaIgreja extends GenericDomain{
	
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCampanha;
	
	@ManyToOne
	private Lancamento lancamento;
	private String nomeCampanhaIgreja;
	private String objetivoCampanhaIgreja;
	
	
	
	
	//private Membro contribuinte;
	
	
	
	@ManyToOne
	private Grupo grupo;
	
	private BigDecimal valorCampanhaIgreja;

	public Date getDataCampanha() {
		return dataCampanha;
	}

	public void setDataCampanha(Date dataCampanha) {
		this.dataCampanha = dataCampanha;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public String getNomeCampanhaIgreja() {
		return nomeCampanhaIgreja;
	}

	public void setNomeCampanhaIgreja(String nomeCampanhaIgreja) {
		this.nomeCampanhaIgreja = nomeCampanhaIgreja;
	}

	public String getObjetivoCampanhaIgreja() {
		return objetivoCampanhaIgreja;
	}

	public void setObjetivoCampanhaIgreja(String objetivoCampanhaIgreja) {
		this.objetivoCampanhaIgreja = objetivoCampanhaIgreja;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public BigDecimal getValorCampanhaIgreja() {
		return valorCampanhaIgreja;
	}

	public void setValorCampanhaIgreja(BigDecimal valorCampanhaIgreja) {
		this.valorCampanhaIgreja = valorCampanhaIgreja;
	}

	
	
	
}
