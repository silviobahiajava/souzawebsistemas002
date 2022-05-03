package br.com.souzawebsistemas.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;
public class DespesasDaIgrejaPagasDao extends GenericDaoHibernate<DespesasPagasDaIgreja>{
	@SuppressWarnings("unchecked")
	public List<DespesasPagasDaIgreja> buscarPorGrupo(Long grupoCodigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(DespesasPagasDaIgreja.class);
			consulta.add(Restrictions.eq("grupo.codigo", grupoCodigo));
			// consulta.addOrder(Order.asc("nome"));
			List<DespesasPagasDaIgreja> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
}
