package br.com.souzawebsistemas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.souzawebsistemas.enums.*;

public class PedidoRevista implements Serializable{
	@OneToOne
	private Membro membroRevista;
	
	@Temporal(TemporalType.DATE)
	private Date dataPedido;
	
	private Date dataRecebimento;
	
	private SitucaoDaConta situacaoDaConta;
	
	@ManyToOne
	private Grupo grupo;
	
	private BigDecimal valor;
	
	private short quantidade;
	private BigDecimal valorTotal;
	private ClasseEscolaDominical classe;
	public Membro getMembroRevista() {
		return membroRevista;
	}
	public void setMembroRevista(Membro membroRevista) {
		this.membroRevista = membroRevista;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Date getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	public SitucaoDaConta getSituacaoDaConta() {
		return situacaoDaConta;
	}
	public void setSituacaoDaConta(SitucaoDaConta situacaoDaConta) {
		this.situacaoDaConta = situacaoDaConta;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public short getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(short quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public ClasseEscolaDominical getClasse() {
		return classe;
	}
	public void setClasse(ClasseEscolaDominical classe) {
		this.classe = classe;
	}
	
	
	
}
