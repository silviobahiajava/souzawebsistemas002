package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import java.util.Date;



import javax.persistence.*;

@Entity
@Table(name="campanha_das_criancas")
public class CampanhaDasCriancas  extends GenericDomain{
	
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCampanha;
	
	@ManyToOne
	private Lancamento lancamento;
	private String nomeCampanhaDasCriancas;
	private String objetivoCampanhaDasCriancas;
	private boolean campanhaDoPe;
	private boolean outroTipoDeCampanha;
	
	
	
	
	//private Membro contribuinte;
	
	
	
	@ManyToOne
	private Grupo grupo;
	
	private BigDecimal valorCampanhaDasCriancas;

	public Date getDataCampanha() {
		return dataCampanha;
	}

	public void setDataCampanha(Date dataCampanha) {
		this.dataCampanha = dataCampanha;
	}

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public String getNomeCampanhaDasCriancas() {
		return nomeCampanhaDasCriancas;
	}

	public void setNomeCampanhaDasCriancas(String nomeCampanhaDasCriancas) {
		this.nomeCampanhaDasCriancas = nomeCampanhaDasCriancas;
	}

	public String getObjetivoCampanhaDasCriancas() {
		return objetivoCampanhaDasCriancas;
	}

	public void setObjetivoCampanhaDasCriancas(String objetivoCampanhaDasCriancas) {
		this.objetivoCampanhaDasCriancas = objetivoCampanhaDasCriancas;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public BigDecimal getValorCampanhaDasCriancas() {
		return valorCampanhaDasCriancas;
	}

	public void setValorCampanhaDasCriancas(BigDecimal valorCampanhaDasCriancas) {
		this.valorCampanhaDasCriancas = valorCampanhaDasCriancas;
	}

	public boolean isCampanhaDoPe() {
		return campanhaDoPe;
	}

	public void setCampanhaDoPe(boolean campanhaDoPe) {
		this.campanhaDoPe = campanhaDoPe;
	}

	public boolean isOutroTipoDeCampanha() {
		return outroTipoDeCampanha;
	}

	public void setOutroTipoDeCampanha(boolean outroTipoDeCampanha) {
		this.outroTipoDeCampanha = outroTipoDeCampanha;
	}
	
	
}
