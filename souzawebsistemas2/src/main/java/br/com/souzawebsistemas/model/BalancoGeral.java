package br.com.souzawebsistemas.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="balanco_geral")
public class BalancoGeral extends GenericDomain {
	
	
	private static final long serialVersionUID = 1L;
	private BigDecimal resultadoGeral;

	public BigDecimal getResultadoGeral() {
		return resultadoGeral;
	}

	public void setResultadoGeral(BigDecimal resultadoGeral) {
		this.resultadoGeral = resultadoGeral;
	}
	
	
}
