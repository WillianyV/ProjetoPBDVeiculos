package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.SedeFilialBean;

/**
 *
 * @author willi
 */
public class SedeFilialDAO {
    
    public SedeFilialBean persist(SedeFilialBean endereco) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar empresa" + e);
            //Mensagem.mensagemErro("Erro ao salvar empresa", "ERRO: empresa");
        } finally {
            em.close();
        }
        return endereco;

    }

    public SedeFilialBean merge(SedeFilialBean sedefilial) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(sedefilial);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar empresa" + e);
            //Mensagem.mensagemErro("Erro ao atualizar empresa", "ERRO: empresa");
        } finally {
            em.close();
        }

        return sedefilial;
    }

    public SedeFilialBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        SedeFilialBean sedefilial = null;
        try {
            sedefilial = em.find(SedeFilialBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar empresa" + e);
            //Mensagem.mensagemErro("Erro ao buscar empresa", "ERRO: empresa não encontrado");
        } finally {
            em.close();
        }

        return sedefilial;
    }

    public List<SedeFilialBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<SedeFilialBean> sedefilial = null;
        try {
            sedefilial = em.createQuery("from SedeFilialBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os empresa" + e);
            //Mensagem.mensagemErro("Erro ao buscar os empresa", "ERRO: empresa");
        }finally{
            em.close();
        }
        
        return sedefilial;
    }
   
    public  SedeFilialBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        SedeFilialBean sedefilial = null;
    
        try {
            sedefilial = em.find(SedeFilialBean.class, id);
            em.getTransaction().begin();
            em.remove(sedefilial);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover empresa" + e);
            //Mensagem.mensagemErro("Erro ao remover empresa", "ERRO: empresa");
        }finally{
            em.close();
        }        
        return sedefilial;    
    }
}
