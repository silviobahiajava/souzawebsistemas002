package br.com.souzawebsistemas.model;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.souzawebsistemas.enums.*;
@Entity
@Table(name="receita")
public class Receita extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataLancamento;
	
	private BigDecimal valorDaReceita;
	private String descricaoDaReceita;
	@Enumerated(EnumType.STRING)
	private TipoReceita tipoDeReceita;
	
	@ManyToOne
	private Grupo grupo;
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public BigDecimal getValorDaReceita() {
		return valorDaReceita;
	}
	public void setValorDaReceita(BigDecimal valorDaReceita) {
		this.valorDaReceita = valorDaReceita;
	}
	public String getDescricaoDaReceita() {
		return descricaoDaReceita;
	}
	public void setDescricaoDaReceita(String descricaoDaReceita) {
		this.descricaoDaReceita = descricaoDaReceita;
	}
	public TipoReceita getTipoDeReceita() {
		return tipoDeReceita;
	}
	public void setTipoDeReceita(TipoReceita tipoDeReceita) {
		this.tipoDeReceita = tipoDeReceita;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
}
