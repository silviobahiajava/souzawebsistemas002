package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import br.com.souzawebsistemas.enums.*;
@Entity
@Table(name="lancamento")
public class Lancamento extends GenericDomain {
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipo;
	
	@Enumerated(EnumType.STRING)
	private TipoReceita tipoReceita;
	
	@Enumerated(EnumType.STRING)
	private TipoDespesa tipoDespesa;
	
	@Enumerated(EnumType.STRING)
	private CaixaEnum caixaEnum;
	
	private String historico;
	
	private String descricao;
	@ManyToOne
	private Grupo grupo;
	
	@ManyToOne
	private DataLancamento dataLancamento;
	
	
	@Column(precision = 6, scale = 2)
	private BigDecimal receita;
	
	@Column(precision = 6, scale = 2)
	private BigDecimal despesa;
	
	@Column(precision = 6, scale = 2)
	private BigDecimal saldo;
	
	@Column(precision = 6, scale = 2)
   private BigDecimal saldoInicial;
	
	
	@Column(precision = 6, scale = 2)
   private BigDecimal saldoFinal;
	
	
	
	private boolean caixaAberto=false;
	
	private boolean caixaFechado=true;
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public BigDecimal getReceita() {
		return receita;
	}
	public void setReceita(BigDecimal receita) {
		this.receita = receita;
	}
	public BigDecimal getDespesa() {
		return despesa;
	}
	public void setDespesa(BigDecimal despesa) {
		this.despesa = despesa;
	}
	
	public TipoReceita getTipoReceita() {
		return tipoReceita;
	}
	public void setTipoReceita(TipoReceita tipoReceita) {
		this.tipoReceita = tipoReceita;
	}
	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}
	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	public DataLancamento getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(DataLancamento dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public boolean isCaixaAberto() {
		return caixaAberto;
	}
	public void setCaixaAberto(boolean caixaAberto) {
		this.caixaAberto = caixaAberto;
	}
	public boolean isCaixaFechado() {
		return caixaFechado;
	}
	public void setCaixaFechado(boolean caixaFechado) {
		this.caixaFechado = caixaFechado;
	}
	public CaixaEnum getCaixaEnum() {
		return caixaEnum;
	}
	public void setCaixaEnum(CaixaEnum caixaEnum) {
		this.caixaEnum = caixaEnum;
	}
	public BigDecimal getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(BigDecimal saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public BigDecimal getSaldoFinal() {
		return saldoFinal;
	}
	public void setSaldoFinal(BigDecimal saldoFinal) {
		this.saldoFinal = saldoFinal;
	}
	

}
