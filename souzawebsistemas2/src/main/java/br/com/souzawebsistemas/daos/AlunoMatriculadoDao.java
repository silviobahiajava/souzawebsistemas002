package br.com.souzawebsistemas.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class AlunoMatriculadoDao extends GenericDaoHibernate<AlunosMatriculadosEscolaDominical> {

	@SuppressWarnings("unchecked")
	public List<AlunosMatriculadosEscolaDominical> buscarPorClasse(Long classeCodigo) {
		Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(AlunosMatriculadosEscolaDominical.class);
			consulta.add(Restrictions.eq("classe.codigo", classeCodigo));
			// consulta.addOrder(Order.asc("nome"));
			List<AlunosMatriculadosEscolaDominical> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

}
