package br.com.souzawebsistemas.daos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import br.com.souzawebsistemas.model.*;
import br.com.souzawebsistemas2.utils.HibernateUtil;
import filtros.AniversarioFilter;

public class AniversarioDao extends GenericDaoHibernate<Aniversario>{
	//este comando  deu certo no sql
			//select nome from membro where day(dataNascimento)=16 and month(dataNascimento)=05;
			
			//este m�todo deu certo  no JUnit pega todos que fazem aniversario no dia e mes passado no parametro qualquer ano
			@SuppressWarnings("unchecked")
			public List<Membro> buscarAniversariantes(int dia,int mes) {
				Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
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
			
			//este m�todo deu certo  no JUnit pega todos que fazem aniversario no mes passado no parametro qualquer ano
			@SuppressWarnings("unchecked")
			public List<Membro> buscarAniversariantes2(int mes) {
				Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
				try {
					//Query query = sessao.createQuery("select nome from membro where day(dataNascimento)=:dia and  month(dataNascimento)=:mes");
					Query query = sessao.createQuery("from Membro where  month(dataNascimento)=?");
					query.setParameter(0,mes);
					List<Membro>membros = query.list();
					return membros;

				} catch (RuntimeException erro) {
					throw erro;
				} finally {
					sessao.close();
				}
			}
			
			
			
			@SuppressWarnings("unchecked")
			public List<Membro>buscarAniversariantesDoMes(Date primeiroDiaDoMes,Date ultimoDiaDoMes){
				Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
				try {
					//Query query = sessao.createQuery("select nome from membro where day(dataNascimento)=:dia and  month(dataNascimento)=:mes");
//					Query query = sessao.createQuery("from Membro where day(dataNascimento) between :primeiroDiaDoMes and :ultimoDiaDoMes ");
//					query.setDate("primeiroDiaDoMes",primeiroDiaDoMes);
//					query.setDate("ultimoDiaDoMes", ultimoDiaDoMes);
					Query query=sessao.createQuery("from Membro where day(dataNascimento)between "+primeiroDiaDoMes+"and "+ultimoDiaDoMes);
					List<Membro>membros = query.list();
					return membros;

				} catch (RuntimeException erro) {
					throw erro;
				} finally {
					sessao.close();
				}
			}
			
			
			//deu certo passo como parametro o primeiro dia e o ultimo dia do mes atual fatos que
			//aconteceram no mes atual e ano atual
			@SuppressWarnings("unchecked")
			public List<Membro>buscarAniversariantesDoMes2(AniversarioFilter filter){
				
				List<Membro>membros=new ArrayList<Membro>();
				StringBuilder sbd=new StringBuilder();
				//sbd.append("select membro from Membro membro ");
				sbd.append("from Membro ");
				if(filter.getDataInical()!=null && filter.getDataFinal()!=null){
					//sbd.append(" where day(membro.dataNascimento) between :dataInicial and :dataFinal ");
					sbd.append(" where dataNascimento between :dataInicial and :dataFinal ");
				}
				//sbd.append(" order by day(membro.dataNascimento) ");
				Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
				try {
					Query consulta=sessao.createQuery(sbd.toString());
					consulta.setDate("dataInicial", filter.getDataInical());
					consulta.setDate("dataFinal",filter.getDataFinal());
					membros=consulta.list();
					return membros;

				} catch (RuntimeException erro) {
					throw erro;
				} finally {
					sessao.close();
				}
			}
			
			
			
			@SuppressWarnings("unchecked")
			public List<Membro>buscarAniversariantesDoMes3(AniversarioFilter filter){
				
				List<Membro>membros=new ArrayList<Membro>();
				StringBuilder sbd=new StringBuilder();
				//sbd.append("select membro from Membro membro ");
				sbd.append("from Membro ");
				if(filter.getDataInical()!=null && filter.getDataFinal()!=null){
					//sbd.append(" where day(membro.dataNascimento) between :dataInicial and :dataFinal ");
					sbd.append(" where day(dataNascimento) between :dataInicial and :dataFinal ");
				}
				//sbd.append(" order by day(membro.dataNascimento) ");
				Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
				try {
					Query consulta=sessao.createQuery(sbd.toString());
					consulta.setDate("dataInicial", filter.getDataInical());
					consulta.setDate("dataFinal",filter.getDataFinal());
					membros=consulta.list();
					return membros;

				} catch (RuntimeException erro) {
					throw erro;
				} finally {
					sessao.close();
				}
			}
			
			
			/*
			 * exemplo de query nativa
			 * 
			 * 
			 * public void listCliente( ){
		      Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		         String sql = "SELECT * FROM CLIENTE";
		         SQLQuery query = session.createSQLQuery(sql);
		         query.addEntity(Cliente.class);
		         List clientes = query.list();

		         for (Iterator iterator = clientes.iterator(); iterator.hasNext();){
		            Cliente cliente = (Cliente) iterator.next(); 
		            System.out.print("Nome: " + cliente.getFirstName()); 
		            System.out.print("Endereco: " + cliente.getLastName()); 
		            System.out.println("Salario: " + cliente.getSalary()); 
		         }
		         tx.commit();
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		}
			 */
			@SuppressWarnings("unchecked")
			public List<Membro>buscarAniversariantesDoMes4(AniversarioFilter filter){
				
				List<Membro>membros=new ArrayList<Membro>();
				Session sessao =HibernateUtil.getFabricaDeSessoes().openSession();
				String sql="select * from membro where day(dataNascimento) between '"+filter.getDataInical()+"' and '"+filter.getDataFinal()+"' ";
				SQLQuery consulta=sessao.createSQLQuery(sql);
				consulta.addEntity(Membro.class);
				membros=consulta.list();
				
					return membros;
			}
			
			
}
