package br.com.souzawebsistemas.model;

import javax.persistence.*;
@Entity
@Table(name="filicacao")
public class Filiacao extends GenericDomain {
	
	private static final long serialVersionUID = 1L;
	private String nomeDoPai;
	private String nomeDaMae;
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	
}
