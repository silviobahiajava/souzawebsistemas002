package br.com.souzawebsistemas.model;

import javax.persistence.*;
@Entity
@Table(name="grupo")
public class Grupo extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	@OneToOne
	private Usuario usuario;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
