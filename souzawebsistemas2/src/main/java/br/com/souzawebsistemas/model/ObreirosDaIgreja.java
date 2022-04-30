package br.com.souzawebsistemas.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import br.com.souzawebsistemas.enums.*;

public class ObreirosDaIgreja extends GenericDomain{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String nome;
	
	private String nacionalidade;
	private String natualidade;
	@Enumerated(EnumType.STRING)
	private EstadosBrasileirosEnum estadosBrasileirosEnum;
	
	private Long codigoMotivoInatividade;
	
	@Enumerated(EnumType.STRING)
	private MotivoInatividadeEnum motivoSaida;
	
	@Enumerated(EnumType.STRING)
	private CidadesNorteParanaEnum cidadeEnum;
	
	@Temporal(TemporalType.DATE)
	private Date validadeCarterinha;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private BairroCidadeEnum bairroEnum;
	
	private String rg;
	private String statusMembro;
	
	
	private String cpf;
	@Transient
	private String caminho;
	
	@Lob
	private byte[]foto;
	
	/*
	 * no managendbean
	 * private Part arquivofoto;
	 * private Membrmo membro
	 * public void salvar(){
	 * 	Byte[]arquivobyte=(convertido em array de byte)arquivofoto.getInputStream();
	 * membro.setFoto(arquivobyte);
	 * dao.salvar(membro);
	 *testar  amanh�
	*/
	
	@OneToOne
	private Cargo cargo;
	
	private String tipoCargo;
	
	private String nomedamae;
	private String nomedopai;
	
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	

	@Temporal(TemporalType.DATE)
	private Date dataBatismo;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private Contato contato;///classe
	
	@OneToOne(cascade=CascadeType.ALL)
	private Filiacao filiacao;
	
	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;//enum
	
	@Enumerated(EnumType.STRING)
	private Congregacao congregacao;//enum

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNatualidade() {
		return natualidade;
	}

	public void setNatualidade(String natualidade) {
		this.natualidade = natualidade;
	}

	public EstadosBrasileirosEnum getEstadosBrasileirosEnum() {
		return estadosBrasileirosEnum;
	}

	public void setEstadosBrasileirosEnum(EstadosBrasileirosEnum estadosBrasileirosEnum) {
		this.estadosBrasileirosEnum = estadosBrasileirosEnum;
	}

	public Long getCodigoMotivoInatividade() {
		return codigoMotivoInatividade;
	}

	public void setCodigoMotivoInatividade(Long codigoMotivoInatividade) {
		this.codigoMotivoInatividade = codigoMotivoInatividade;
	}

	public MotivoInatividadeEnum getMotivoSaida() {
		return motivoSaida;
	}

	public void setMotivoSaida(MotivoInatividadeEnum motivoSaida) {
		this.motivoSaida = motivoSaida;
	}

	public CidadesNorteParanaEnum getCidadeEnum() {
		return cidadeEnum;
	}

	public void setCidadeEnum(CidadesNorteParanaEnum cidadeEnum) {
		this.cidadeEnum = cidadeEnum;
	}

	public Date getValidadeCarterinha() {
		return validadeCarterinha;
	}

	public void setValidadeCarterinha(Date validadeCarterinha) {
		this.validadeCarterinha = validadeCarterinha;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public BairroCidadeEnum getBairroEnum() {
		return bairroEnum;
	}

	public void setBairroEnum(BairroCidadeEnum bairroEnum) {
		this.bairroEnum = bairroEnum;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getStatusMembro() {
		return statusMembro;
	}

	public void setStatusMembro(String statusMembro) {
		this.statusMembro = statusMembro;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getTipoCargo() {
		return tipoCargo;
	}

	public void setTipoCargo(String tipoCargo) {
		this.tipoCargo = tipoCargo;
	}

	public String getNomedamae() {
		return nomedamae;
	}

	public void setNomedamae(String nomedamae) {
		this.nomedamae = nomedamae;
	}

	public String getNomedopai() {
		return nomedopai;
	}

	public void setNomedopai(String nomedopai) {
		this.nomedopai = nomedopai;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Date getDataBatismo() {
		return dataBatismo;
	}

	public void setDataBatismo(Date dataBatismo) {
		this.dataBatismo = dataBatismo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Filiacao getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(Filiacao filiacao) {
		this.filiacao = filiacao;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Congregacao getCongregacao() {
		return congregacao;
	}

	public void setCongregacao(Congregacao congregacao) {
		this.congregacao = congregacao;
	}
	
	
}
