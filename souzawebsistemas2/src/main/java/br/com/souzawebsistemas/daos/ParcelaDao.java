package br.com.souzawebsistemas.daos;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.souzawebsistemas.model.Pagamento;
import br.com.souzawebsistemas.model.Parcela;
import br.com.souzawebsistemas2.utils.HibernateUtil;

public class ParcelaDao extends GenericDaoHibernate<Parcela>{
	@SuppressWarnings("unchecked")
	public Parcela buscarParcela(Date dataVencimentoDaParcela,double valorDaParcela,int numerodaparcela,String emailCliente) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		try {
			//Query query = sessao.createQuery("select nome from membro where day(dataNascimento)=:dia and  month(dataNascimento)=:mes");
			Query query = sessao.createQuery("from Parcela where dataVencimentoDaParcela = ? and valorDaParcela=? and numerodaparcela =? "
					+ "and pagamento.emailCliente = ? ");
			query.setParameter(0,dataVencimentoDaParcela);
			query.setParameter(1, valorDaParcela);
			query.setParameter(2, numerodaparcela);
			query.setParameter(3, emailCliente);
			Parcela parcela=(Parcela) query.uniqueResult();
			return parcela;

		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	//ESTE M�TODO FUNCIONA PERFEITAMENTE
		@SuppressWarnings("unchecked")
		public Parcela buscarParcelaPorDataVencimentoEmail(Date dataVencimentoDaParcela,String emailCliente) {
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				//Query query = sessao.createQuery("select nome from membro where day(dataNascimento)=:dia and  month(dataNascimento)=:mes");
				Query query = sessao.createQuery("from Parcela p where p.dataVencimentoDaParcela =? and p.pagamento.emailCliente = ?");
				query.setParameter(0,dataVencimentoDaParcela);
				query.setParameter(1,emailCliente);
				Parcela parcela=(Parcela) query.uniqueResult();
				return parcela;

			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
		
		
		public Parcela buscarPorCpfNumeroParcela(String cpf,int numerodaparcela) {
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(Parcela.class);
				consulta.add(Restrictions.eq("pagamento.cpf", cpf));
				consulta.add(Restrictions.eq("numerodaparcela",numerodaparcela));
				Parcela parcela=(Parcela) consulta.uniqueResult();
				
				return parcela;
			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
	
		public List<Parcela> buscarPorPagamento(Long codigopagamento) {
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(Parcela.class);
				consulta.add(Restrictions.eq("pagamento.codigo",codigopagamento));
				
				List<Parcela> parcelas=consulta.list();
				
				return parcelas;
			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
		public Pagamento buscarPorCpf(String cpf) {
			Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(Pagamento.class);
				//consulta.add(Restrictions.eq("pagamento.cpfCliente",cpf));
				consulta.add(Restrictions.ilike("cpfCliente",cpf));
				Pagamento pagamento=(Pagamento) consulta.uniqueResult();
				
				return pagamento;
			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
		
		//eq � usado pra numeros ilike � usado pra String
		public Parcela buscarPorCodigoPagamentoNumeroParcela(Long codigopagamento,int numeroparcela) {
			Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(Parcela.class);
				//consulta.add(Restrictions.eq("pagamento.cpfCliente",cpf));
				consulta.add(Restrictions.eq("pagamento.codigo",codigopagamento));
				consulta.add(Restrictions.eq("numerodaparcela",numeroparcela));
				Parcela parcela=(Parcela) consulta.uniqueResult();
				
				return parcela;
			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
		
		
		public Parcela buscarPorNomeNumeroParcela(String nomeCliente,int numeroparcela) {
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(Parcela.class);
				//consulta.add(Restrictions.eq("pagamento.cpfCliente",cpf));
				consulta.add(Restrictions.eqOrIsNull("pagamento.nomeCliente",nomeCliente));
				consulta.add(Restrictions.eq("numerodaparcela",numeroparcela));
				Parcela parcela=(Parcela) consulta.uniqueResult();
				
				return parcela;
			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
		
		
		
		
		
		
		
		
		
		
		/*public List<Cidade> buscarPorEstado(Long estadoCodigo) {
			Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
			try {
				Criteria consulta = sessao.createCriteria(Cidade.class);
				consulta.add(Restrictions.eq("estado.codigo", estadoCodigo));	
				consulta.addOrder(Order.asc("nome"));
				List<Cidade> resultado = consulta.list();
				return resultado;
			} catch (RuntimeException erro) {
				throw erro;
			} finally {
				sessao.close();
			}
		}
	*/
}
