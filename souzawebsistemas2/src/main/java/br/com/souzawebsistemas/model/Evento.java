package br.com.souzawebsistemas.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="evento")
public class Evento implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String local;
	private String data;
	private String horario;
	@OneToMany
	private List <Convidado> convidados;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public List<Convidado> getConvidados() {
		return convidados;
	}
	public void setConvidados(List<Convidado> convidados) {
		this.convidados = convidados;
	}
	
	
}
