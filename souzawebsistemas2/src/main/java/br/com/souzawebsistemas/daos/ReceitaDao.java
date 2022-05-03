package br.com.souzawebsistemas.daos;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;
public class ReceitaDao extends GenericDaoHibernate<Receita>{
	@SuppressWarnings("unchecked")
	public List<Receita> buscarReceitaPorData(Date dataLancamento) {
		List<Receita> receitas = null;

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		if (dataLancamento != null) {

		}
		try {
			Query consulta = sessao.createQuery("from Receita where dataLancamento=? ");
			consulta.setParameter(0, dataLancamento);
			receitas = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return receitas;
	}
	
	@SuppressWarnings("unchecked")
	public List<Receita> buscarReceitaPorCodigo(Long codigo) {
		List<Receita> receitas = null;

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		if (codigo != null) {

		}
		try {
			Query consulta = sessao.createQuery("from Receita where grupo.codigo=? ");
			consulta.setParameter(0, codigo);
			receitas = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return receitas;
	}
}
