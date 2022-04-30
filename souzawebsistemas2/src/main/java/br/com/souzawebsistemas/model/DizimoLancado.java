package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity

public class DizimoLancado extends GenericDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal valorDizimo;
	private Date dataLancamento;
	private Membro dizimista;
	public BigDecimal getValorDizimo() {
		return valorDizimo;
	}
	public void setValorDizimo(BigDecimal valorDizimo) {
		this.valorDizimo = valorDizimo;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public Membro getDizimista() {
		return dizimista;
	}
	public void setDizimista(Membro dizimista) {
		this.dizimista = dizimista;
	}
	
	
}
