/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.LimpezaBean;

/**
 *
 * @author willi
 */
public class LimpezaDAO {
    public LimpezaBean persist(LimpezaBean limpeza) {

        
        EntityManager em = new ConnectionFactory().getConnetion();

        try {
            em.getTransaction().begin();
            em.persist(limpeza);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar a limpeza do veículo" + e);
            //Mensagem.mensagemErro("Erro ao salvar a limpeza do veículo", "ERRO: Limpeza");
        } finally {
            em.close();
        }
        return limpeza;

    }

    public LimpezaBean merge(LimpezaBean limpeza) {

        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(limpeza);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar a limpeza do veículo" + e);
            //Mensagem.mensagemErro("Erro ao atualizar a limpeza do veículo", "ERRO: Limpeza");
        } finally {
            em.close();
        }

        return limpeza;
    }

    public LimpezaBean findById(Integer id) {

        EntityManager em = new ConnectionFactory().getConnetion();
        LimpezaBean limpeza = null;
        try {
            limpeza = em.find(LimpezaBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar a limpeza do veículo" + e);
            //Mensagem.mensagemErro("Erro ao buscar a limpeza do veículo", "ERRO: Limpeza não encontrado");
        } finally {
            em.close();
        }

        return limpeza;
    }

    public List<LimpezaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<LimpezaBean> limpezas = null;
        try {
            limpezas = em.createQuery("from LimpezaBean l").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar as limpeza" + e);
            //Mensagem.mensagemErro("Erro ao buscar as limpeza", "ERRO: Limpeza");
        }finally{
            em.close();
        }
        
        return limpezas;
    }
    
    public  LimpezaBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        LimpezaBean limpeza = null;
    
        try {
            limpeza = em.find(LimpezaBean.class, id);
            em.getTransaction().begin();
            em.remove(limpeza);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover a limpeza do veículo" + e);
            //Mensagem.mensagemErro("Erro ao remover a limpeza do veículo", "ERRO: Limpeza");
        }finally{
            em.close();
        }
        
        return limpeza;    
    }
}
