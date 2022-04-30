package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="campanha_do_pe_crianca")
public class CampanhaDoPeCriancas extends GenericDomain{
	
	 
	private static final long serialVersionUID = 1L;
	private String descricao;
	@Column(precision=2,scale=2)
	private BigDecimal taxaContribuicao;
	private int numeroParcelasPagas;
	@Column(precision=6,scale=2)
	private BigDecimal valorRecebido;
	@Column(precision=6,scale=2)
	private BigDecimal valorPraPagar;
	@Column(precision=6,scale=2)
	private BigDecimal trocoPraDevolver;
	@OneToOne
	private OfertaDasCriancas trocoParaOferta;
	private String objetivoCampanha;
	@ManyToOne
	private Grupo grupo;
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	@OneToOne
	private Membro contribuinte;
	
	@ManyToOne
	private Lancamento lancamento;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getTaxaContribuicao() {
		return taxaContribuicao;
	}
	public void setTaxaContribuicao(BigDecimal taxaContribuicao) {
		this.taxaContribuicao = taxaContribuicao;
	}
	public int getNumeroParcelasPagas() {
		return numeroParcelasPagas;
	}
	public void setNumeroParcelasPagas(int numeroParcelasPagas) {
		this.numeroParcelasPagas = numeroParcelasPagas;
	}
	public BigDecimal getValorRecebido() {
		return valorRecebido;
	}
	public void setValorRecebido(BigDecimal valorRecebido) {
		this.valorRecebido = valorRecebido;
	}
	public BigDecimal getValorPraPagar() {
		return valorPraPagar;
	}
	public void setValorPraPagar(BigDecimal valorPraPagar) {
		this.valorPraPagar = valorPraPagar;
	}
	public BigDecimal getTrocoPraDevolver() {
		return trocoPraDevolver;
	}
	public void setTrocoPraDevolver(BigDecimal trocoPraDevolver) {
		this.trocoPraDevolver = trocoPraDevolver;
	}
	public OfertaDasCriancas getTrocoParaOferta() {
		return trocoParaOferta;
	}
	public void setTrocoParaOferta(OfertaDasCriancas trocoParaOferta) {
		this.trocoParaOferta = trocoParaOferta;
	}
	public String getObjetivoCampanha() {
		return objetivoCampanha;
	}
	public void setObjetivoCampanha(String objetivoCampanha) {
		this.objetivoCampanha = objetivoCampanha;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public Membro getContribuinte() {
		return contribuinte;
	}
	public void setContribuinte(Membro contribuinte) {
		this.contribuinte = contribuinte;
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
