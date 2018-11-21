
package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.PessoaJuridicaBean;

/**
 *
 * @author willi
 */
public class PessoaJuridicaDAO {
    public PessoaJuridicaBean persist(PessoaJuridicaBean pj) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(pj);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar o Cliente-Pessoa Jurídica" + e);
            //Mensagem.mensagemErro("Erro ao salvar o Cliente-Pessoa Jurídica", "ERRO: Cliente-PJ");
        } finally {
            em.close();
        }
        return pj;

    }

    public PessoaJuridicaBean merge(PessoaJuridicaBean pj) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(pj);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar o Cliente-Pessoa Jurídica" + e);
            //Mensagem.mensagemErro("Erro ao atualizar o Cliente-Pessoa Jurídica", "ERRO: Cliente-PJ");
        } finally {
            em.close();
        }

        return pj;
    }

    public PessoaJuridicaBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        PessoaJuridicaBean pj = null;
        try {
            pj = em.find(PessoaJuridicaBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar o Cliente-Pessoa Jurídica" + e);
            //Mensagem.mensagemErro("Erro ao buscar o Cliente-Pessoa Jurídica", "ERRO: Cliente-PJ não encontrado");
        } finally {
            em.close();
        }

        return pj;
    }

    public List<PessoaJuridicaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<PessoaJuridicaBean> pj = null;
        try {
            pj = em.createQuery("from PessoaJuridicaBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Clientes-Pessoa Jurídica" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Clientes-Pessoa Jurídica", "ERRO: Cliente-PJ");
        }finally{
            em.close();
        }
        
        return pj;
    }
    
    public  PessoaJuridicaBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        PessoaJuridicaBean pj = null;
    
        try {
            pj = em.find(PessoaJuridicaBean.class, id);
            em.getTransaction().begin();
            em.remove(pj);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover o Cliente-Pessoa Jurídica" + e);
            //Mensagem.mensagemErro("Erro ao remover endereço", "ERRO: Cliente-PJ");
        }finally{
            em.close();
        }
        
        return pj;    
    }
}