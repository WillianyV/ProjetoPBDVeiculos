
package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import model.beans.ControleFinanceiroBean;

/**
 *
 * @author willi
 */
public class ControleFinanceiroDAO {
   
    public void persist(ControleFinanceiroBean cFinanceiro) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
           
            em.getTransaction().begin();
            em.persist(cFinanceiro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Controle Financeiro" + e);
            //Mensagem.mensagemErro("Erro ao salvar Controle Financeiro", "ERRO: Controle Financeiro");
        } finally {
            em.close();
        }

    }

    public ControleFinanceiroBean merge(ControleFinanceiroBean cFinanceiro) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(cFinanceiro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Controle Financeiro" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Controle Financeiro", "ERRO: Controle Financeiro");
        } finally {
            em.close();
        }

        return cFinanceiro;
    }

    public ControleFinanceiroBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        ControleFinanceiroBean cFinanceiro = null;
        try {
            cFinanceiro = em.find(ControleFinanceiroBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Controle Financeiro" + e);
            //Mensagem.mensagemErro("Erro ao buscar Controle Financeiro", "ERRO: Controle Financeiro não encontrado");
        } finally {
            em.close();
        }

        return cFinanceiro;
    }

    public ArrayList<ControleFinanceiroBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<ControleFinanceiroBean> cFinanceiros = null;
        try {
            cFinanceiros = (ArrayList)em.createQuery("from ControleFinanceiroBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os endereço" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Controles Financeiro", "ERRO: Controles Financeiro");
        }finally{
            em.close();
        }
        
        return cFinanceiros;
    }
   
    public  ControleFinanceiroBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        ControleFinanceiroBean cFinanceiro = null;
    
        try {
            cFinanceiro = em.find(ControleFinanceiroBean.class, id);
            em.getTransaction().begin();
            em.remove(cFinanceiro);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Controle Financeiro");
            //Mensagem.mensagemErro("Erro ao remover Controle Financeiro", "ERRO: Controle Financeiro");
        }finally{
            em.close();
        }
        
        return cFinanceiro;    
    }
}
