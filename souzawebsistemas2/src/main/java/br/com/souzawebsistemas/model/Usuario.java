package br.com.souzawebsistemas.model;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="usuario")
public class Usuario extends GenericDomain{
	private static final long serialVersionUID = 1L;
	
	
	private String login;
	private String senha;
	private String cpf;
	private Grupo grupo;
	
	@OneToOne(cascade=CascadeType.ALL)
	private FuncaoUsuario funcaoUsuario;
	
	@ManyToOne
	private Estabelecimento estabelecimento;

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public FuncaoUsuario getFuncaoUsuario() {
		return funcaoUsuario;
	}
	public void setFuncaoUsuario(FuncaoUsuario funcaoUsuario) {
		this.funcaoUsuario = funcaoUsuario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
	
}
