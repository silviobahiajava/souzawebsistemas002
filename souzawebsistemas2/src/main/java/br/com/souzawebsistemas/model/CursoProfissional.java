package br.com.souzawebsistemas.model;
import javax.persistence.*;
@Entity
public class CursoProfissional extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	private String instituicaoCurso;
	private String nomeCurso;
	private String  dataInicioCurso;
	private String dataConclusaoCurso;
	private String cargaHorariaCurso;
	@ManyToOne(cascade=CascadeType.ALL)
	private CurriculoProfissional curriculo;
	
	
	public String getInstituicaoCurso() {
		return instituicaoCurso;
	}
	public void setInstituicaoCurso(String instituicaoCurso) {
		this.instituicaoCurso = instituicaoCurso;
	}
	public CurriculoProfissional getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(CurriculoProfissional curriculo) {
		this.curriculo = curriculo;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getDataInicioCurso() {
		return dataInicioCurso;
	}
	public void setDataInicioCurso(String dataInicioCurso) {
		this.dataInicioCurso = dataInicioCurso;
	}
	public String getDataConclusaoCurso() {
		return dataConclusaoCurso;
	}
	public void setDataConclusaoCurso(String dataConclusaoCurso) {
		this.dataConclusaoCurso = dataConclusaoCurso;
	}
	public String getCargaHorariaCurso() {
		return cargaHorariaCurso;
	}
	public void setCargaHorariaCurso(String cargaHorariaCurso) {
		this.cargaHorariaCurso = cargaHorariaCurso;
	}
	
	
	
	
	
}
