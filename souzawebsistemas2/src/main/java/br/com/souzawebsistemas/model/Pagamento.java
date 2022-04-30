package br.com.souzawebsistemas.model;

import java.util.Date;
import javax.persistence.*;

import br.com.souzawebsistemas.enums.*;
@Entity
@Table(name="Pagamento")
public class Pagamento extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	private double valorTotal;
	@Temporal(TemporalType.DATE)
	private Date dataProcesso;
	private String nomeCliente;
	private String emailCliente;
	private String cpfCliente;
	private String logradouroCliente;
	private String numeroLogradouroCliente;
	private String bairroCliente;
	private String cidadeCliente;
	private String telefone;
	private String celular;
	private String cep;
	@Enumerated(EnumType.STRING)
	private TipoProcessoEnum tipoProcesoEnum;
	
	@OneToOne
	private Cliente cliente;
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Date getDataProcesso() {
		return dataProcesso;
	}
	public void setDataProcesso(Date dataProcesso) {
		this.dataProcesso = dataProcesso;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getLogradouroCliente() {
		return logradouroCliente;
	}
	public void setLogradouroCliente(String logradouroCliente) {
		this.logradouroCliente = logradouroCliente;
	}
	public String getNumeroLogradouroCliente() {
		return numeroLogradouroCliente;
	}
	public void setNumeroLogradouroCliente(String numeroLogradouroCliente) {
		this.numeroLogradouroCliente = numeroLogradouroCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public TipoProcessoEnum getTipoProcesoEnum() {
		return tipoProcesoEnum;
	}
	public void setTipoProcesoEnum(TipoProcessoEnum tipoProcesoEnum) {
		this.tipoProcesoEnum = tipoProcesoEnum;
	}
	
	
	
}
