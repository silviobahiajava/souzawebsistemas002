package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="boleto_pagamento_clientes")
public class BoletoDePagamentoDeClientes extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	private String nomeCedente;
	private String documentoCedente;
	private String  numeroDocumento;
	private String nossoNumero;
	private String digitoNossoNumero;
	private BigDecimal valorBoleto;
	private BigDecimal desconto;
	private BigDecimal deducao;
	private BigDecimal mora;
	private BigDecimal acrescimo;
	private BigDecimal valorcobrado;
	private Date dataDocumento;
	private Date dataVencimento;
	private Date dataGeracaoBoleto;
	private String localPreferidoPagamento;
	private String nomeSacado;
	private String documentoSacado;
	private String cepSacado;
	private String enderecoSacado;
	private String numeroSacado;
	private String bairroSacado;
	private String cidadeSacado;
	private String estadoSacado;
	private boolean pessoaFisica;
	private boolean pessoaJuridica;
	private String localidadeSacado;
	private String numeroLocalidade;
	
	public String getNomeCedente() {
		return nomeCedente;
	}
	public void setNomeCedente(String nomeCedente) {
		this.nomeCedente = nomeCedente;
	}
	public String getDocumentoCedente() {
		return documentoCedente;
	}
	public void setDocumentoCedente(String documentoCedente) {
		this.documentoCedente = documentoCedente;
	}
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getNossoNumero() {
		return nossoNumero;
	}
	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	public String getDigitoNossoNumero() {
		return digitoNossoNumero;
	}
	public void setDigitoNossoNumero(String digitoNossoNumero) {
		this.digitoNossoNumero = digitoNossoNumero;
	}
	public BigDecimal getValorBoleto() {
		return valorBoleto;
	}
	public void setValorBoleto(BigDecimal valorBoleto) {
		this.valorBoleto = valorBoleto;
	}
	public BigDecimal getDesconto() {
		return desconto;
	}
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	public BigDecimal getDeducao() {
		return deducao;
	}
	public void setDeducao(BigDecimal deducao) {
		this.deducao = deducao;
	}
	public BigDecimal getMora() {
		return mora;
	}
	public void setMora(BigDecimal mora) {
		this.mora = mora;
	}
	public BigDecimal getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(BigDecimal acrescimo) {
		this.acrescimo = acrescimo;
	}
	public BigDecimal getValorcobrado() {
		return valorcobrado;
	}
	public void setValorcobrado(BigDecimal valorcobrado) {
		this.valorcobrado = valorcobrado;
	}
	public Date getDataDocumento() {
		return dataDocumento;
	}
	public void setDataDocumento(Date dataDocumento) {
		this.dataDocumento = dataDocumento;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getLocalPreferidoPagamento() {
		return localPreferidoPagamento;
	}
	public void setLocalPreferidoPagamento(String localPreferidoPagamento) {
		this.localPreferidoPagamento = localPreferidoPagamento;
	}
	public Date getDataGeracaoBoleto() {
		return dataGeracaoBoleto;
	}
	public void setDataGeracaoBoleto(Date dataGeracaoBoleto) {
		this.dataGeracaoBoleto = dataGeracaoBoleto;
	}
	public String getNomeSacado() {
		return nomeSacado;
	}
	public void setNomeSacado(String nomeSacado) {
		this.nomeSacado = nomeSacado;
	}
	public String getDocumentoSacado() {
		return documentoSacado;
	}
	public void setDocumentoSacado(String documentoSacado) {
		this.documentoSacado = documentoSacado;
	}
	public String getCepSacado() {
		return cepSacado;
	}
	public void setCepSacado(String cepSacado) {
		this.cepSacado = cepSacado;
	}
	public String getEnderecoSacado() {
		return enderecoSacado;
	}
	public void setEnderecoSacado(String enderecoSacado) {
		this.enderecoSacado = enderecoSacado;
	}
	public String getNumeroSacado() {
		return numeroSacado;
	}
	public void setNumeroSacado(String numeroSacado) {
		this.numeroSacado = numeroSacado;
	}
	public String getBairroSacado() {
		return bairroSacado;
	}
	public void setBairroSacado(String bairroSacado) {
		this.bairroSacado = bairroSacado;
	}
	public String getCidadeSacado() {
		return cidadeSacado;
	}
	public void setCidadeSacado(String cidadeSacado) {
		this.cidadeSacado = cidadeSacado;
	}
	public String getEstadoSacado() {
		return estadoSacado;
	}
	public void setEstadoSacado(String estadoSacado) {
		this.estadoSacado = estadoSacado;
	}
	public boolean isPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(boolean pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public boolean isPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(boolean pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public String getLocalidadeSacado() {
		return localidadeSacado;
	}
	public void setLocalidadeSacado(String localidadeSacado) {
		this.localidadeSacado = localidadeSacado;
	}
	public String getNumeroLocalidade() {
		return numeroLocalidade;
	}
	public void setNumeroLocalidade(String numeroLocalidade) {
		this.numeroLocalidade = numeroLocalidade;
	}
	
	
}
