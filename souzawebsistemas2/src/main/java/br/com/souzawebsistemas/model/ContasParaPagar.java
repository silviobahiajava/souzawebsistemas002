package br.com.souzawebsistemas.model;

import java.math.BigDecimal;

import java.util.Date;


import javax.persistence.*;
@Entity
@Table(name="contas_para_pagar")
public class ContasParaPagar extends GenericDomain{
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataVencimento;
	private String credor;
	private String nota;
	
	@OneToOne
	private ContasPagas contaPaga;
	
	
	
	private BigDecimal valorContaParaPagar;
	
	private String descricaoConta;
	private String observacao;
	private boolean pago;
	@ManyToOne
	private Grupo grupo;
	
	@ManyToOne
	private Lancamento lancamento;
	
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public BigDecimal getValorContaParaPagar() {
		return valorContaParaPagar;
	}
	public void setValorContaParaPagar(BigDecimal valorContaParaPagar) {
		this.valorContaParaPagar = valorContaParaPagar;
	}
	public String getDescricaoConta() {
		return descricaoConta;
	}
	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
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
	public String getCredor() {
		return credor;
	}
	public void setCredor(String credor) {
		this.credor = credor;
	}
	public String getNota() {
		return nota;
	}
	public void setNota(String nota) {
		this.nota = nota;
	}
	public ContasPagas getContaPaga() {
		return contaPaga;
	}
	public void setContaPaga(ContasPagas contaPaga) {
		this.contaPaga = contaPaga;
	}
	
	
	
}
