package br.com.souzawebsistemas.model;

import javax.persistence.*;
@Entity
@Table(name="igreja")
public class Igreja extends GenericDomain{

	private static final long serialVersionUID = 1L;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
}
