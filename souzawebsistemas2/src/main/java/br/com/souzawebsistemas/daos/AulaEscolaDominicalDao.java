package br.com.souzawebsistemas.daos;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;
import filtros.AulaEscolaDominicalFiltro;

public class AulaEscolaDominicalDao extends GenericDaoHibernate<AulaEscolaDominical> {
	public Long salvarAula(AulaEscolaDominical aula) {
		Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		Long codigo = null;

		try {
			transacao = sessao.beginTransaction();
			codigo = (Long) sessao.save(aula);
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
		return codigo;
	}

	@SuppressWarnings("unchecked")
	public List<AulaEscolaDominical> buscarAulaPorData(Date dataAula) {
		List<AulaEscolaDominical> aulas = null;

		Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
		if (dataAula != null) {

		}
		try {
			Query consulta = sessao.createQuery("from AulaEscolaDominical where dataAula=? ");
			consulta.setParameter(0, dataAula);
			aulas = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return aulas;
	}

	// pesquisar por data da aula

	/*
	 * public List<AulaEscolaDominical>buscar(AulaEscolaDominicalFiltro filtro){
	 * List<AulaEscolaDominical>aulas=null; StringBuilder sql=new
	 * StringBuilder(); sql.append("select aula from AulaEscolaDominical aula "
	 * ); Session sessao =
	 * utils.HibernateUtil.getFabricaDeSessoes().openSession();
	 * if(filtro.getDataInical()!=null && filtro.getDataFinal()!=null){
	 * sql.append("where aula.dataAula between :dataInicial and :dataFinal " );
	 * sql.append("order by aula.dataAula "); } try{ Query consulta =
	 * sessao.createQuery(sql.toString());
	 * consulta.setDate("dataInicial",filtro.getDataInical());
	 * consulta.setDate("dataFinal",filtro.getDataFinal());
	 * aulas=consulta.list(); }catch(RuntimeException e){ throw e; }finally{
	 * sessao.close(); } return aulas; }
	 */
	
	
	@SuppressWarnings("unchecked")
	public List<AulaEscolaDominical> buscarAulaEscolaDominicalPorGrupo(Long codigo) {
		List<AulaEscolaDominical> aulas = null;

		Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
		if (codigo != null) {

		}
		try {
			Query consulta = sessao.createQuery("from AulaEscolaDominical where grupo.codigo=? ");
			consulta.setParameter(0, codigo);
			aulas = consulta.list();
			
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return aulas;
	}


}
