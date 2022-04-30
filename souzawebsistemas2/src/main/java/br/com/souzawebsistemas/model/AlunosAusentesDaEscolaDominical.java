package br.com.souzawebsistemas.model;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="aluno_ausente_escola_dominical")//item

public class AlunosAusentesDaEscolaDominical extends GenericDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dataAula;
	
	@ManyToOne
	private AlunosMatriculadosEscolaDominical matriculado;
	
	@ManyToOne
	private AulaEscolaDominical aula;

	public Date getDataAula() {
		return dataAula;
	}

	public void setDataAula(Date dataAula) {
		this.dataAula = dataAula;
	}

	public AlunosMatriculadosEscolaDominical getMatriculado() {
		return matriculado;
	}

	public void setMatriculado(AlunosMatriculadosEscolaDominical matriculado) {
		this.matriculado = matriculado;
	}

	public AulaEscolaDominical getAula() {
		return aula;
	}

	public void setAula(AulaEscolaDominical aula) {
		this.aula = aula;
	}
	
	
	
	
}
