package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;



import javax.persistence.*;
@Entity
@Table(name="oferta_escola_dominical")
public class OfertaEscolaDominical extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataOfertaEescolaDominical;
	@ManyToOne
	private Lancamento lancamento;
	
	
	
	@ManyToOne
	private Grupo grupo;
	
	@Column(precision=6,scale=2)
	private BigDecimal valorOfertaEscolaDominical;
	
	@OneToOne
	private ClasseEscolaDominical classe;

	public Date getDataOfertaEescolaDominical() {
		return dataOfertaEescolaDominical;
	}

	public void setDataOfertaEescolaDominical(Date dataOfertaEescolaDominical) {
		this.dataOfertaEescolaDominical = dataOfertaEescolaDominical;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public BigDecimal getValorOfertaEscolaDominical() {
		return valorOfertaEscolaDominical;
	}

	public void setValorOfertaEscolaDominical(BigDecimal valorOfertaEscolaDominical) {
		this.valorOfertaEscolaDominical = valorOfertaEscolaDominical;
	}

	public ClasseEscolaDominical getClasse() {
		return classe;
	}

	public void setClasse(ClasseEscolaDominical classe) {
		this.classe = classe;
	}
	
	
	
	
	
	
	
	
}
