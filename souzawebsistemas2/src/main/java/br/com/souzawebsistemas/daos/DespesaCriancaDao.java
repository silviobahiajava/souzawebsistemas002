package br.com.souzawebsistemas.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;



import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class DespesaCriancaDao extends GenericDaoHibernate<DespesaCrianca>{
	@SuppressWarnings("unchecked")
	public List<DespesaCrianca> buscarDespesasDasCriancasPorGrupo(Long codigo) {
		List<DespesaCrianca> despesasDasCriancas = null;

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		if (codigo != null) {

		}
		try {
			Query consulta = sessao.createQuery("from DespesaCrianca where grupo.codigo=? ");
			consulta.setParameter(0, codigo);
			despesasDasCriancas = consulta.list();
			
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return despesasDasCriancas;
	}
	
	
	
}
