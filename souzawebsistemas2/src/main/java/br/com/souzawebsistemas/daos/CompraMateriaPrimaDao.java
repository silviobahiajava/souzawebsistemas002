package br.com.souzawebsistemas.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;
public class CompraMateriaPrimaDao extends GenericDaoHibernate<CompraMateriaPrima> {
	
	public Long buscaUlitmoCodigo() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			Criteria c=sessao.createCriteria(CompraMateriaPrima.class);
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
	
	
	public void salvarCompraMateriaPrima(CompraMateriaPrima compra,List<ItemCompraMateriaPrima>listaItemCompra) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			sessao.save(compra);
			for (int posicao = 0; posicao < listaItemCompra.size(); posicao++) {
				ItemCompraMateriaPrima itemCompra = listaItemCompra.get(posicao);
				itemCompra.setCompraMateriaPrima(compra);
				sessao.save(itemCompra);
			}
			transacao.commit();
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
