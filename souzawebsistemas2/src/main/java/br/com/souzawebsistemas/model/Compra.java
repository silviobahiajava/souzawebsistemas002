package br.com.souzawebsistemas.model;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import br.com.souzawebsistemas.enums.*;
@Entity
@Table(name="compra")
public class Compra extends GenericDomain{

	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataCompra;
	private String numeroPedido;
	
	private String descricao;
	private String observacao;
	
	
	@Column(name="precodacompra",precision = 6, scale = 2)
	private BigDecimal precodacompra;
	
	@ManyToOne
	private LancamentoLivroCaixa lancamentoLivroCaixa;
	
	@ManyToOne
	private DataLancamento dataLancamentoCompra;
	
     @ManyToOne
	private Grupo grupo;
	
	@ManyToOne
	private Lancamento lancamento;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Loja loja;
	
     @Enumerated(EnumType.STRING)
	private TipoPagamento tipoPagamento;
	
	@Enumerated(EnumType.STRING)
	private TipoCompra tipoCompra;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ContaAPagar contaAPagar;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private ContasPagas contasPagas;

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public DataLancamento getDataLancamentoCompra() {
		return dataLancamentoCompra;
	}

	public void setDataLancamentoCompra(DataLancamento dataLancamentoCompra) {
		this.dataLancamentoCompra = dataLancamentoCompra;
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

	

	public BigDecimal getPrecodacompra() {
		return precodacompra;
	}

	public void setPrecodacompra(BigDecimal precodacompra) {
		this.precodacompra = precodacompra;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public TipoCompra getTipoCompra() {
		return tipoCompra;
	}

	public void setTipoCompra(TipoCompra tipoCompra) {
		this.tipoCompra = tipoCompra;
	}

	public ContaAPagar getContaAPagar() {
		return contaAPagar;
	}

	public void setContaAPagar(ContaAPagar contaAPagar) {
		this.contaAPagar = contaAPagar;
	}

	public ContasPagas getContasPagas() {
		return contasPagas;
	}

	public void setContasPagas(ContasPagas contasPagas) {
		this.contasPagas = contasPagas;
	}

	public LancamentoLivroCaixa getLancamentoLivroCaixa() {
		return lancamentoLivroCaixa;
	}

	public void setLancamentoLivroCaixa(LancamentoLivroCaixa lancamentoLivroCaixa) {
		this.lancamentoLivroCaixa = lancamentoLivroCaixa;
	}


}
