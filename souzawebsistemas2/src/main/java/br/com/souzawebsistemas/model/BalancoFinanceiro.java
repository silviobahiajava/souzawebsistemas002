package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.*;


@Entity
@Table(name="balanco_financeiro")
public class BalancoFinanceiro extends GenericDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal valorEntrada;
	private BigDecimal valorSaida;
	private BigDecimal resultado;
	@Temporal(TemporalType.DATE)
	private Date dataIncial;
	@Temporal(TemporalType.DATE)
	private Date dataFinal;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private BalancoGeral balancoGeral;
	
	public BigDecimal getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(BigDecimal valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public BigDecimal getValorSaida() {
		return valorSaida;
	}
	public void setValorSaida(BigDecimal valorSaida) {
		this.valorSaida = valorSaida;
	}
	public BigDecimal getResultado() {
		return resultado;
	}
	public void setResultado(BigDecimal resultado) {
		this.resultado = resultado;
	}
	public Date getDataIncial() {
		return dataIncial;
	}
	public void setDataIncial(Date dataIncial) {
		this.dataIncial = dataIncial;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	//get and seters
	
	
}
