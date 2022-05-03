package br.com.souzawebsistemas.daos;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class CurriculoDao extends GenericDaoHibernate<Curriculo>{
	public Curriculo salvarCurriculo(Curriculo curriculo) {
		Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			Curriculo resposta = (Curriculo) sessao.merge(curriculo);
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
