package br.com.souzawebsistemas.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name="ItemCompraMateriaPrima")
public class ItemCompraMateriaPrima extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private BigDecimal precoParcial;
	@ManyToOne
	private MateriaPrima materiaPrima;
	@ManyToOne
	private CompraMateriaPrima compraMateriaPrima;
	
	private int quantidade;
	
	public BigDecimal getPrecoParcial() {
		return precoParcial;
	}
	public void setPrecoParcial(BigDecimal precoParcial) {
		this.precoParcial = precoParcial;
	}
	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public CompraMateriaPrima getCompraMateriaPrima() {
		return compraMateriaPrima;
	}
	public void setCompraMateriaPrima(CompraMateriaPrima compraMateriaPrima) {
		this.compraMateriaPrima = compraMateriaPrima;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
