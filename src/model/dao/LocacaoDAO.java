package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.LocacaoBean;

/**
 *
 * @author willi
 */
public class LocacaoDAO {
    public LocacaoBean persist(LocacaoBean locacao) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(locacao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Locação" + e);
            //Mensagem.mensagemErro("Erro ao salvar Locação", "ERRO: Locação");
        } finally {
            em.close();
        }
        return locacao;

    }

    public LocacaoBean merge(LocacaoBean locacao) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(locacao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Locação" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Locação", "ERRO: Locação");
        } finally {
            em.close();
        }

        return locacao;
    }

    public LocacaoBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        LocacaoBean locacao = null;
        try {
            locacao = em.find(LocacaoBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Locação" + e);
            //Mensagem.mensagemErro("Erro ao buscar Locação", "ERRO: Locação não encontrado");
        } finally {
            em.close();
        }

        return locacao;
    }

    public ArrayList<LocacaoBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<LocacaoBean> locacoes = null;
        try {
            locacoes = (ArrayList)em.createQuery("from LocacaoBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar as Locações" + e);
            //Mensagem.mensagemErro("Erro ao buscar as Locações", "ERRO: Locação");
        }finally{
            em.close();
        }
        
        return locacoes;
    }
   
    public  LocacaoBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        LocacaoBean locacao = null;
    
        try {
            locacao = em.find(LocacaoBean.class, id);
            em.getTransaction().begin();
            em.remove(locacao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Locação" + e);
            //Mensagem.mensagemErro("Erro ao remover Locação", "ERRO: Locação");
        }finally{
            em.close();
        }        
        return locacao;    
    }
}
