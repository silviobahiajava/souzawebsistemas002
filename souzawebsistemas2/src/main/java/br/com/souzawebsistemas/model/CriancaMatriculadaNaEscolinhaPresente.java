package br.com.souzawebsistemas.model;

import javax.persistence.*;
@Entity
@Table(name="crianca_na_escolinha_presente")
public class CriancaMatriculadaNaEscolinhaPresente extends GenericDomain{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private CriancaMatriculadaNaEscolinha matriculado;//produto
	
	@ManyToOne
	private AulaEscolinhaCrianca aula;//venda

	public CriancaMatriculadaNaEscolinha getMatriculado() {
		return matriculado;
	}

	public void setMatriculado(CriancaMatriculadaNaEscolinha matriculado) {
		this.matriculado = matriculado;
	}

	public AulaEscolinhaCrianca getAula() {
		return aula;
	}

	public void setAula(AulaEscolinhaCrianca aula) {
		this.aula = aula;
	}


}
