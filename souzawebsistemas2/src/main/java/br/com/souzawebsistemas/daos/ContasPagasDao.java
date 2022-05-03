package br.com.souzawebsistemas.daos;

import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class ContasPagasDao extends GenericDaoHibernate<ContasPagas>{
	public ContasPagas salvarContasPagas(ContasPagas contasPagas) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			ContasPagas resposta = (ContasPagas) sessao.merge(contasPagas);
			transacao.commit();
			return resposta;
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
