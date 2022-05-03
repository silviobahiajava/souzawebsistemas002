package br.com.souzawebsistemas.daos;

import org.hibernate.Session;

import br.com.souzawebsistemas.model.Produto;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class ProdutoDao extends GenericDaoHibernate<Produto> {
	public Produto salvarproduto(Produto prod) throws Exception {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();

		try {

			sessao.save(prod);
			return prod;
		} catch (Exception e) {

			throw e;
		}

	}
}
