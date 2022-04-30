package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.*;
@Entity
@Table(name="compra_dos_varoes")
public class CompraDosVaroes extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private Date dataCompraVarao;
	private boolean compraAvistaVarao;
	private boolean compraAprazoVarao;
	private String tipoCompra;
	private BigDecimal valorCompraVarao;
	private String descricao;
	private String numeroNota;
	   @ManyToOne
		private Grupo grupo;
		
		@ManyToOne
		private Lancamento lancamento;
		
	public Date getDataCompraVarao() {
			return dataCompraVarao;
		}
		public void setDataCompraVarao(Date dataCompraVarao) {
			this.dataCompraVarao = dataCompraVarao;
		}
		public boolean isCompraAvistaVarao() {
			return compraAvistaVarao;
		}
		public void setCompraAvistaVarao(boolean compraAvistaVarao) {
			this.compraAvistaVarao = compraAvistaVarao;
		}
		public boolean isCompraAprazoVarao() {
			return compraAprazoVarao;
		}
		public void setCompraAprazoVarao(boolean compraAprazoVarao) {
			this.compraAprazoVarao = compraAprazoVarao;
		}
		public BigDecimal getValorCompraVarao() {
			return valorCompraVarao;
		}
		public void setValorCompraVarao(BigDecimal valorCompraVarao) {
			this.valorCompraVarao = valorCompraVarao;
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
