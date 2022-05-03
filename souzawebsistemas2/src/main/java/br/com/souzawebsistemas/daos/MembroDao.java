package br.com.souzawebsistemas.daos;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.souzawebsistemas.enums.TipoCadastroEnum;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;
import filtros.LancamentoIgrejaFilter;


public class MembroDao extends GenericDaoHibernate<Membro> {
	
	public Long buscaUlitmoCodigo() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			Criteria c=sessao.createCriteria(Membro.class);
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
	
	/*
	 * EntityManager em=Utils.conecar();
	 * 
	 * @SuppressWarnings("unchecked") public List<Membro>listar(){
	 * List<Membro>membros=null; Query query = em.createQuery(
	 * "select o from Membro o"); membros = query.getResultList(); return
	 * membros; }
	 */

	public Membro salvarMembro(Membro membro) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
			Membro resposta = (Membro) sessao.merge(membro);
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
	// public List<Membro>buscarMembro(){
	// Session sessao = utils.HibernateUtil.getFabricaDeSessoes().openSession();
	// try {
	// Query query = sessao.createQuery("select l from Membro l where
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
	public List<Membro> listarMembro() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorCargo(Long cargoCodigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorTipoDeCargo(String tipodecargo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("tipoCargo",tipodecargo));
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorStatusMembro(String statusMembro) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("statusMembro",statusMembro));
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorStatusMembroTipo(String statusMembro) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("statusMembro",statusMembro));
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorStatusCadastroTipoCargo(TipoCadastroEnum tipoCadastro,String tipoCargo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("tipoCadastro", tipoCadastro));
			consulta.add(Restrictions.eq("tipoCargo",tipoCargo));
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	public List<Membro>buscarPorStatusMembroTipoCargo(String statusMembro,String tipoCargo){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("statusMembro", statusMembro));
			consulta.add(Restrictions.ilike("tipoCargo",tipoCargo));
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorJustificativaDeExclusao(String justificativaDeExclusao) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("justificativaDeExclusao",justificativaDeExclusao));
			List<Membro> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorTipoDeCargoECodigo(String tipodecargo,Long codigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("tipoCargo",tipodecargo));
			consulta.add(Restrictions.eq("codigo",codigo));
			List<Membro>obreiros=consulta.list();
			//Membro resultado = (Membro) consulta.uniqueResult();
			return obreiros;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarPorCpfENumeroCartao(String cpf,Long codigo) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(Membro.class);
			//consulta.add(Restrictions.eq("cargo.codigo", cargoCodigo));	
			consulta.add(Restrictions.ilike("cpf",cpf));
			consulta.add(Restrictions.eq("codigo",codigo));
			List<Membro>obreiros=consulta.list();
			//Membro resultado = (Membro) consulta.uniqueResult();
			return obreiros;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<Membro> buscarAniversarioAdultosPorData(Date dataNascimento) {
		
		List<Membro> aniversarios = null;

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		if (dataNascimento != null) {

		}
		
		try {  
		
			
			Query consulta = sessao.createQuery("from membro where dataNascimento=?");
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
	public List<Membro> buscarAniversariantesDoMes() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		List<Membro> aniversarios = null;
		try {
			Query query = sessao.createSQLQuery("select * from membro where Month(dataNascimento)=Month(Now()");
			
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
	 
	public List<Membro>buscarPorDiaMes(Date dataNascimento){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		
		
		Calendar calendario=Calendar.getInstance();
		calendario.setTime(dataNascimento);
		Integer dia=calendario.get(Calendar.DAY_OF_MONTH);
		Integer mes=calendario.get(Calendar.MONTH);
		Query busca=sessao.createQuery("select m from Membro m where DAY(m.dataNascimento)=? and MONTH(m.dataNascimento)=?");
		
		busca.setInteger(0, dia);
		busca.setInteger(1,mes);
		return busca.list();
		
	}
	
	
	
	
		@SuppressWarnings("unchecked")
		public List<Membro> listarAniversariantesDoMes(int mes){  
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
            try {
            	
                return sessao.createQuery("from Membro where month(dataNascimento) = "+mes).list();   
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
		//select nome from membro where day(dataNascimento)=16 and month(dataNascimento)=05;
		
		//este m�todo deu certo  no JUnit
		@SuppressWarnings("unchecked")
		public List<Membro> buscarAniversariantes(int dia,int mes) {
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				//Query query = sessao.createQuery("select nome from membro where day(dataNascimento)=:dia and  month(dataNascimento)=:mes");
				Query query = sessao.createQuery("from Membro where day(dataNascimento)=? and  month(dataNascimento)=?");
				query.setParameter(0,dia);
				query.setParameter(1,mes);
				List<Membro>membros = query.list();
				return membros;

			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
		
	}
	
	
	
		
	
	
	


