package br.com.souzawebsistemas.daos;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;

import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class MembroInativoDao extends GenericDaoHibernate<MembroInativo> {
	/*
	 * EntityManager em=Utils.conecar();
	 * 
	 * @SuppressWarnings("unchecked") public List<MembroInativo>listar(){
	 * List<MembroInativo>MembroInativos=null; Query query = em.createQuery(
	 * "select o from MembroInativo o"); MembroInativos = query.getResultList(); return
	 * MembroInativos; }
	 */

	public MembroInativo salvarMembroInativo(MembroInativo MembroInativo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			MembroInativo resposta = (MembroInativo) sessao.merge(MembroInativo);
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

	// @SuppressWarnings("unchecked")
	// public List<MembroInativo>buscarMembroInativo(){
	// Session sessao = utils.HibernateUtil.getFabricaDeSessoes().openSession();
	// try {
	// Query query = sessao.createQuery("select l from MembroInativo l where
	// l.grupo.nome=:nome");
	// //long contador=(long) query.uniqueResult();
	// //query.setString("nome",nome);
	// //query.setDate("data", data);
	// query.setString("nome",nome);
	// //BigDecimal somaOferta=(BigDecimal) query.uniqueResult();
	// List<Lancamento>lancamentos=query.list();
	// return lancamentos;
	// } catch (RuntimeException erro) {
	// throw erro;
	// } finally {
	// sessao.close();
	// }
	// }

	@SuppressWarnings("unchecked")
	public List<MembroInativo> listarMembroInativo() {
		Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(MembroInativo.class);
			List<MembroInativo> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<MembroInativo> buscarPorCargo(Long cargoCodigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(MembroInativo.class);
			consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			
			List<MembroInativo> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

	
	
	@SuppressWarnings("unchecked")
	public List<MembroInativo> buscarPorTipoDeCargo(String tipodecargo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(MembroInativo.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("tipoCargo",tipodecargo));
			List<MembroInativo> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<MembroInativo> buscarPorTipoDeCargoECodigo(String tipodecargo,Long codigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(MembroInativo.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("tipoCargo",tipodecargo));
			consulta.add(Restrictions.eq("codigo",codigo));
			List<MembroInativo>obreiros=consulta.list();
			//MembroInativo resultado = (MembroInativo) consulta.uniqueResult();
			return obreiros;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<MembroInativo> buscarAniversarioAdultosPorData(Date dataNascimento) {
		
		List<MembroInativo> aniversarios = null;

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		if (dataNascimento != null) {

		}
		
		try {  
		
			
			Query consulta = sessao.createQuery("from MembroInativo where dataNascimento=?");
			consulta.setParameter(0, dataNascimento);
			aniversarios = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			sessao.close();
		}
		return aniversarios;
	}
	
	//SELECT * aniversariantes WHERE Month(data_nascimento) = Month(Now())
	
	@SuppressWarnings("unchecked")
	public List<MembroInativo> buscarAniversariantesDoMes() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		List<MembroInativo> aniversarios = null;
		try {
			Query query = sessao.createSQLQuery("select * from MembroInativo where Month(dataNascimento)=Month(Now()");
			
			aniversarios=query.list();
			return aniversarios;

		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	/*
	 * 
	 * public List<Pessoa> listaAniversariantes(int mes) {
  return this.session.createQuery("select pessoa from Pessoa pessoa " +
    "where month(pessoa.dtnascimento) = " + mes +
    "order by day(pessoa.dtnascimento), pessoa.nome").list();
}


public List<SuaClasse>BuscarPorDiaEMes(Date dataInformada){
 Calendar cal = Calendar.getInstance();
 cal.setTime(dataInformada);
 Integer dia = cal.get(Calendar.DAY_OF_MONTH);
 Integer mes = cal.get(Calendar.DAY_OF_MONTH)
 Query q = session.createQuery("SELECT a FROM SuaClasse a WHERE DAY(a.seuBeanData) = ? AND MONTH(a.seuBeanData) = ? " );
 q.setInteger(0,dia);
 q.setInteger(1,mes);
 return q.list();
}


	 * 
	 * 
	 * 
	 * public List<SuaClasse>BuscarPorDiaEMes(Date dataInformada){
 Calendar cal = Calendar.getInstance();
 cal.setTime(dataInformada);
 Integer dia = cal.get(Calendar.DAY_OF_MONTH);
 Integer mes = cal.get(Calendar.DAY_OF_MONTH)
 Query q = session.createQuery("SELECT a FROM SuaClasse a WHERE DAY(a.seuBeanData) = ? AND MONTH(a.seuBeanData) = ? " );
 q.setInteger(0,dia);
 q.setInteger(1,mes);
 return q.list();
}

	 * 
	 * */
	 
	public List<MembroInativo>buscarPorDiaMes(Date dataNascimento){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		
		
		Calendar calendario=Calendar.getInstance();
		calendario.setTime(dataNascimento);
		Integer dia=calendario.get(Calendar.DAY_OF_MONTH);
		Integer mes=calendario.get(Calendar.MONTH);
		Query busca=sessao.createQuery("select m from MembroInativo m where DAY(m.dataNascimento)=? and MONTH(m.dataNascimento)=?");
		
		busca.setInteger(0, dia);
		busca.setInteger(1,mes);
		return busca.list();
		
	}
	
	
	
	
		@SuppressWarnings("unchecked")
		public List<MembroInativo> listarAniversariantesDoMes(int mes){  
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
            try {
            	
                return sessao.createQuery("from MembroInativo where month(dataNascimento) = "+mes).list();   
            } catch(Exception e){
                try {
					throw e;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}            
            } finally {
                if(sessao != null && sessao.isOpen()){}
                sessao.close();
            }
			return null;
        }
		
		
		//este comando  deu certo no sql
		//select nome from MembroInativo where day(dataNascimento)=16 and month(dataNascimento)=05;
		
		//este m�todo deu certo  no JUnit
		@SuppressWarnings("unchecked")
		public List<MembroInativo> buscarAniversariantes(int dia,int mes) {
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				//Query query = sessao.createQuery("select nome from MembroInativo where day(dataNascimento)=:dia and  month(dataNascimento)=:mes");
				Query query = sessao.createQuery("from MembroInativo where day(dataNascimento)=? and  month(dataNascimento)=?");
				query.setParameter(0,dia);
				query.setParameter(1,mes);
				List<MembroInativo>MembroInativos = query.list();
				return MembroInativos;

			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
		
	}
	
	
	
		
	
	
	


