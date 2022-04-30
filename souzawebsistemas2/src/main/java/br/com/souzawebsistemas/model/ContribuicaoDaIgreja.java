package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.*;
@Entity
@Table(name="contribuicao_da_igreja")
public class ContribuicaoDaIgreja extends GenericDomain{
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Membro contribuinte;
	
	@Column(precision=6,scale=2)
	private BigDecimal valorQuePodeContribuir;
	
	@Temporal(TemporalType.DATE)
	private Date dataPrevistaPraContribuir;
	
	@ManyToOne
	private CampanhaDaIgreja campanha;
	
	@ManyToOne
	private Lancamento lancamento;

	@ManyToOne
	private Grupo grupo;
	
	public Membro getContribuinte() {
		return contribuinte;
	}
	public void setContribuinte(Membro contribuinte) {
		this.contribuinte = contribuinte;
	}
	public BigDecimal getValorQuePodeContribuir() {
		return valorQuePodeContribuir;
	}
	public void setValorQuePodeContribuir(BigDecimal valorQuePodeContribuir) {
		this.valorQuePodeContribuir = valorQuePodeContribuir;
	}
	public Date getDataPrevistaPraContribuir() {
		return dataPrevistaPraContribuir;
	}
	public void setDataPrevistaPraContribuir(Date dataPrevistaPraContribuir) {
		this.dataPrevistaPraContribuir = dataPrevistaPraContribuir;
	}
	public CampanhaDaIgreja getCampanha() {
		return campanha;
	}
	public void setCampanha(CampanhaDaIgreja campanha) {
		this.campanha = campanha;
	}
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
	
	
	
	
}
