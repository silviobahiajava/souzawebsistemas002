package br.com.souzawebsistemas.model;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="estabelecimento_de_compras")
public class EstabelecimentoDeCompra extends GenericDomain{
	private static final long serialVersionUID = 1L;
	private String cnpjEstabelecimento;
	private String nomeEstabelcimento;
	private String enderecoEstabelecimento;
	public String getCnpjEstabelecimento() {
		return cnpjEstabelecimento;
	}
	public void setCnpjEstabelecimento(String cnpjEstabelecimento) {
		this.cnpjEstabelecimento = cnpjEstabelecimento;
	}
	public String getNomeEstabelcimento() {
		return nomeEstabelcimento;
	}
	public void setNomeEstabelcimento(String nomeEstabelcimento) {
		this.nomeEstabelcimento = nomeEstabelcimento;
	}
	public String getEnderecoEstabelecimento() {
		return enderecoEstabelecimento;
	}
	public void setEnderecoEstabelecimento(String enderecoEstabelecimento) {
		this.enderecoEstabelecimento = enderecoEstabelecimento;
	}
	
	
	
}
