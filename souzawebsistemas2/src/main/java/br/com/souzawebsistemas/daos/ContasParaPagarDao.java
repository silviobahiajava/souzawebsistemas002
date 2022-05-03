package br.com.souzawebsistemas.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class ContasParaPagarDao extends GenericDaoHibernate<ContasParaPagar>{
	
	@SuppressWarnings("unchecked")
	public List<ContasParaPagar> buscarContasPorGrupo(Long codigo) {
		List<ContasParaPagar> contas = null;

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		if (codigo != null) {

		}
		try {
			Query consulta = sessao.createQuery("from Compra where grupo.codigo=? ");
			consulta.setParameter(0, codigo);
			contas = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return contas;
	}
	
}
