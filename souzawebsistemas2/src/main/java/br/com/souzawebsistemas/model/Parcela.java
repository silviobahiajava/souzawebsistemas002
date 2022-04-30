package br.com.souzawebsistemas.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Parcela")
public class Parcela extends GenericDomain{
	
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dataVencimentoDaParcela;
	
	private int numerodaparcela;
	
	
	
	private double valorDaParcela;
	
	@ManyToOne
	private Pagamento pagamento;
	
	public Date getDataVencimentoDaParcela() {
		return dataVencimentoDaParcela;
	}
	public void setDataVencimentoDaParcela(Date dataVencimentoDaParcela) {
		this.dataVencimentoDaParcela = dataVencimentoDaParcela;
	}
	
	public double getValorDaParcela() {
		return valorDaParcela;
	}
	public void setValorDaParcela(double valorDaParcela) {
		this.valorDaParcela = valorDaParcela;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public int getNumerodaparcela() {
		return numerodaparcela;
	}
	public void setNumerodaparcela(int numerodaparcela) {
		this.numerodaparcela = numerodaparcela;
	}
	
}
