package br.com.souzawebsistemas.daos;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;
public class MateriaPrimaDao extends GenericDaoHibernate<MateriaPrima>{
	
	public Long buscaUlitmoCodigo() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			Criteria c=sessao.createCriteria(MateriaPrima.class);
			Long codigo=(Long) c.setProjection(Projections.max("codigo")).uniqueResult();
			return codigo;
			
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
}
