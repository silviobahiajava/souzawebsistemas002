package br.com.souzawebsistemas.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="classe")
public class ClasseEscolaDominical extends GenericDomain{

	private static final long serialVersionUID = 1L;
	private String nomeClasse;
	
	
	
	public String getNomeClasse() {
		return nomeClasse;
	}
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	

}
