package br.com.souzawebsistemas.model;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import br.com.souzawebsistemas.enums.*;
@Entity
@Table(name="compra_das_criancas")

	public class CompraDasCriancas extends GenericDomain{
		private static final long serialVersionUID = 1L;
		private Date dataCompraCrianca;
		//private boolean compraAvistaCrianca;
		//private boolean compraAprazoCrianca;
		//private String tipoCompra;
		private BigDecimal valorCompraCrianca;
		private TipoCompra tipodecompra;
		private String descricao;
		private String numeroNota;
		   @ManyToOne
			private Grupo grupo;
			
			@ManyToOne
			private Lancamento lancamento;
			
		public Date getDataCompraCrianca() {
				return dataCompraCrianca;
			}
			public void setDataCompraCrianca(Date dataCompraCrianca) {
				this.dataCompraCrianca = dataCompraCrianca;
			}
			
			
			public BigDecimal getValorCompraCrianca() {
				return valorCompraCrianca;
			}
			public void setValorCompraCrianca(BigDecimal valorCompraCrianca) {
				this.valorCompraCrianca = valorCompraCrianca;
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
		public TipoCompra getTipodecompra() {
			return tipodecompra;
		}
		public void setTipodecompra(TipoCompra tipodecompra) {
			this.tipodecompra = tipodecompra;
		}
		
		
}
