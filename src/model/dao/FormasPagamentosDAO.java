package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.FormasPagamentosBean;

/**
 *
 * @author willi
 */
public class FormasPagamentosDAO {
    public FormasPagamentosBean persist(FormasPagamentosBean fPg) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(fPg);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Pagamento" + e);
            //Mensagem.mensagemErro("Erro ao salvar Pagamento", "ERRO: Pagamento");
        } finally {
            em.close();
        }
        return fPg;

    }

    public FormasPagamentosBean merge(FormasPagamentosBean fPg) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(fPg);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Pagamento" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Pagamento", "ERRO: Pagamento");
        } finally {
            em.close();
        }

        return fPg;
    }

    public FormasPagamentosBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        FormasPagamentosBean fPg = null;
        try {
            fPg = em.find(FormasPagamentosBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pagamento" + e);
            //Mensagem.mensagemErro("Erro ao buscar Pagamento", "ERRO: Pagamento não encontrado");
        } finally {
            em.close();
        }

        return fPg;
    }

    public List<FormasPagamentosBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<FormasPagamentosBean> fPg = null;
        try {
            fPg = em.createQuery("from FormasPagamentosBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Pagamentos" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Pagamentos", "ERRO: Pagamento");
        }finally{
            em.close();
        }
        
        return fPg;
    }
   
    public  FormasPagamentosBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        FormasPagamentosBean fPg = null;
    
        try {
            fPg = em.find(FormasPagamentosBean.class, id);
            em.getTransaction().begin();
            em.remove(fPg);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Pagamento" + e);
            //Mensagem.mensagemErro("Erro ao remover Pagamento", "ERRO: Pagamento");
        }finally{
            em.close();
        }        
        return fPg;    
    }
}
