package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.AutomovelBean;

/**
 *
 * @author willi
 */
public class AutomovelDAO {
    public void persist(AutomovelBean automovel) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(automovel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Automóvel" + e);
            //Mensagem.mensagemErro("Erro ao salvar Automóvel", "ERRO: Automovel");
        } finally {
            em.close();
        }

    }

    public AutomovelBean merge(AutomovelBean automovel) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(automovel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Automóvel" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Automóvel", "ERRO: Automovel");
        } finally {
            em.close();
        }

        return automovel;
    }

    public AutomovelBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        AutomovelBean automovel = null;
        try {
            automovel = em.find(AutomovelBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Automóvel" + e);
            //Mensagem.mensagemErro("Erro ao buscar Automóvel", "ERRO: Automovel não encontrado");
        } finally {
            em.close();
        }

        return automovel;
    }

    public ArrayList<AutomovelBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<AutomovelBean> automoveis = null;
        try {
            automoveis = (ArrayList)em.createQuery("from AutomovelBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Automóveis" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Automóveis", "ERRO: Automovel");
        }finally{
            em.close();
        }
        
        return automoveis;
    }
   
    public  AutomovelBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        AutomovelBean automovel;
        automovel = em.find(AutomovelBean.class, id);
        try {
            em.getTransaction().begin();
            em.remove(automovel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            automovel.setStatus(false);
            merge(automovel);
            System.err.println("Erro ao remover Automóvel, pois esta sendo utilizada.\nO Status do Automóvel irá mudar para falso");
            
            //Mensagem.mensagemErro("Erro ao remover Automóvel", "ERRO: Automovel");
        }finally{
            em.close();
        }
        
        return automovel;    
    }
}
