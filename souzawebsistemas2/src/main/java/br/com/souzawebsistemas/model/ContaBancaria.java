package br.com.souzawebsistemas.model;

import javax.persistence.ManyToOne;
import javax.persistence.*;
@Entity
@Table(name="conta_bancaria")
public class ContaBancaria extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	private Integer numeroConta;
	private String digitoConta;
	
	private Integer carteira;
	
	private Integer agencia;
	private String digitoAgencia;
	
	@ManyToOne
	private Membro membro;
	
	
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getDigitoConta() {
		return digitoConta;
	}
	public void setDigitoConta(String digitoConta) {
		this.digitoConta = digitoConta;
	}
	
	
	public Integer getCarteira() {
		return carteira;
	}
	public void setCarteira(Integer carteira) {
		this.carteira = carteira;
	}
	
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public String getDigitoAgencia() {
		return digitoAgencia;
	}
	public void setDigitoAgencia(String digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}
	public Membro getMembro() {
		return membro;
	}
	public void setMembro(Membro membro) {
		this.membro = membro;
	}
	
	
	
}
