package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.*;
@Entity
@Table(name="vendas")
public class Vendas extends GenericDomain{
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataVenda;
	@ManyToOne
	private Lancamento lancamento;
	private String descricao;
	private String produto;
	private Membro comprador;
	private String vendedor;
	private boolean pago;
	private BigDecimal dataRecebimento;
	
	private BigDecimal preco;
	private Integer quantidade;
	@ManyToOne
	private Grupo grupo;
	private BigDecimal valorVenda;
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
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

	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public BigDecimal getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Membro getComprador() {
		return comprador;
	}
	public void setComprador(Membro comprador) {
		this.comprador = comprador;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public BigDecimal getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(BigDecimal dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	
	
	
 
}
