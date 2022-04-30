package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.souzawebsistemas.enums.*;
public class CompraEscolaDominical {
	@Temporal(TemporalType.DATE)
	private Date dataCompraEBD;
	
	@ManyToOne
	private Lancamento lancamento;
	
	private PedidoRevista pedidoRevista;
	
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private TipoCompraEBDEnum tipoCompraEBDEnum;
	
	@Enumerated(EnumType.STRING)
	private TipoCompra tipoCompra;
	
	
	@ManyToOne
	private Grupo grupo;
	
	private String numeroNota;
	
	private short quantidade;
	
	
	@Column(precision=6,scale=2)
	private BigDecimal valor;


	public Date getDataCompraEBD() {
		return dataCompraEBD;
	}


	public void setDataCompraEBD(Date dataCompraEBD) {
		this.dataCompraEBD = dataCompraEBD;
	}


	public Lancamento getLancamento() {
		return lancamento;
	}


	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public TipoCompraEBDEnum getTipoCompraEBDEnum() {
		return tipoCompraEBDEnum;
	}


	public void setTipoCompraEBDEnum(TipoCompraEBDEnum tipoCompraEBDEnum) {
		this.tipoCompraEBDEnum = tipoCompraEBDEnum;
	}


	public TipoCompra getTipoCompra() {
		return tipoCompra;
	}


	public void setTipoCompra(TipoCompra tipoCompra) {
		this.tipoCompra = tipoCompra;
	}


	public Grupo getGrupo() {
		return grupo;
	}


	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public String getNumeroNota() {
		return numeroNota;
	}


	public void setNumeroNota(String numeroNota) {
		this.numeroNota = numeroNota;
	}


	public short getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(short quantidade) {
		this.quantidade = quantidade;
	}


	public PedidoRevista getPedidoRevista() {
		return pedidoRevista;
	}


	public void setPedidoRevista(PedidoRevista pedidoRevista) {
		this.pedidoRevista = pedidoRevista;
	}
	
	

}
