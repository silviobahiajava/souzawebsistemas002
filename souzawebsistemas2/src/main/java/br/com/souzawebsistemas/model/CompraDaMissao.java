package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="compra_da_missao")
public class CompraDaMissao extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private Date dataCompraMissao;
	private boolean compraAvistaMissao;
	private boolean compraAprazoMissao;
	private String tipoCompra;
	private BigDecimal valorCompraMissao;
	private String descricao;
	private String numeroNota;
	   @ManyToOne
		private Grupo grupo;
		
		@ManyToOne
		private Lancamento lancamento;
		
	
	public Date getDataCompraMissao() {
			return dataCompraMissao;
		}
		public void setDataCompraMissao(Date dataCompraMissao) {
			this.dataCompraMissao = dataCompraMissao;
		}
		public boolean isCompraAvistaMissao() {
			return compraAvistaMissao;
		}
		public void setCompraAvistaMissao(boolean compraAvistaMissao) {
			this.compraAvistaMissao = compraAvistaMissao;
		}
		public boolean isCompraAprazoMissao() {
			return compraAprazoMissao;
		}
		public void setCompraAprazoMissao(boolean compraAprazoMissao) {
			this.compraAprazoMissao = compraAprazoMissao;
		}
		public BigDecimal getValorCompraMissao() {
			return valorCompraMissao;
		}
		public void setValorCompraMissao(BigDecimal valorCompraMissao) {
			this.valorCompraMissao = valorCompraMissao;
		}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNumeroNota() {
		return numeroNota;
	}
	public void setNumeroNota(String numeroNota) {
		this.numeroNota = numeroNota;
	}
	public String getTipoCompra() {
		return tipoCompra;
	}
	public void setTipoCompra(String tipoCompra) {
		this.tipoCompra = tipoCompra;
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
