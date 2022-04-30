package br.com.souzawebsistemas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="aniversario")
public class Aniversario extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dataAniversario;
	
	private boolean adulto;
	private boolean crianca;
	
	@OneToOne
	private Membro aniversarianteAdulto;
	
	@OneToOne
	private Crianca aniversarianteInfantil;
	public Date getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(Date date) {
		this.dataAniversario = date;
	}
	public Membro getAniversarianteAdulto() {
		return aniversarianteAdulto;
	}
	public void setAniversarianteAdulto(Membro aniversarianteAdulto) {
		this.aniversarianteAdulto = aniversarianteAdulto;
	}
	public Crianca getAniversarianteInfantil() {
		return aniversarianteInfantil;
	}
	public void setAniversarianteInfantil(Crianca aniversarianteInfantil) {
		this.aniversarianteInfantil = aniversarianteInfantil;
	}
	public boolean isAdulto() {
		return adulto;
	}
	public void setAdulto(boolean adulto) {
		this.adulto = adulto;
	}
	public boolean isCrianca() {
		return crianca;
	}
	public void setCrianca(boolean crianca) {
		this.crianca = crianca;
	}
	
	
}
