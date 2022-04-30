package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.souzawebsistemas.enums.*;

@Entity
@Table(name="conta_a_pagar")
public class ContaAPagar extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	
	//UMA CONTA A PAGAR TEM UMA DATA DE VENCIMENTO
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	//UMA CONTA A PAGAR DEVE SER PAGA A ALGUEM(EMPRESA OU PESSOA)
	private String credor;
	//UMA CONTA A PAGAR TEM UM VALOR
	private BigDecimal valor;
	private String descricao;
	
	
	
	@Enumerated(EnumType.STRING)
	private SitucaoDaConta situacaoDaConta;
	private boolean pago;
	private boolean aPagar;
	private boolean temDesconto;
	private BigDecimal valorComDesconto;
	private BigDecimal totalAPagar;
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencmento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public boolean isaPagar() {
		return aPagar;
	}
	public void setaPagar(boolean aPagar) {
		this.aPagar = aPagar;
	}
	public boolean isTemDesconto() {
		return temDesconto;
	}
	public void setTemDesconto(boolean temDesconto) {
		this.temDesconto = temDesconto;
	}
	public BigDecimal getValorComDesconto() {
		return valorComDesconto;
	}
	public void setValorComDesconto(BigDecimal valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}
	public BigDecimal getTotalAPagar() {
		return totalAPagar;
	}
	public void setTotalAPagar(BigDecimal totalAPagar) {
		this.totalAPagar = totalAPagar;
	}
	public SitucaoDaConta getSituacaoDaConta() {
		return situacaoDaConta;
	}
	public void setSituacaoDaConta(SitucaoDaConta situacaoDaConta) {
		this.situacaoDaConta = situacaoDaConta;
	}
	
}
