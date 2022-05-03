package br.com.souzawebsistemas.daos;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class UsuarioDao extends GenericDaoHibernate<Usuario> {
	public Usuario autenticar(String login, String senha) {
		Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Query query = sessao.createQuery("select Usuario  from Usuario u where u.login=:login and u.senha=:senha");
			// long contador=(long) query.uniqueResult();
			query.setString("login", login);
			query.setString("senha", senha);
			Usuario user = (Usuario) query.uniqueResult();
			return user;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

	public Usuario autenticarUsuario(String cpf, String senha) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();

		try {
			Criteria consulta = sessao.createCriteria(Usuario.class);

			consulta.add(Restrictions.eq("cpf", cpf));

			// SimpleHash hash = new SimpleHash("md5", senha);
			// consulta.add(Restrictions.eq("senha", hash.toHex()));

			consulta.add(Restrictions.eq("senha", senha));
			Usuario resultado = (Usuario) consulta.uniqueResult();

			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
}
