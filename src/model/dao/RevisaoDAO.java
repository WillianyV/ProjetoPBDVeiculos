/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.RevisaoBean;

/**
 *
 * @author willi
 */
public class RevisaoDAO {
    
    public RevisaoBean persist(RevisaoBean revisao) {

        
        EntityManager em = new ConnectionFactory().getConnetion();

        try {
            em.getTransaction().begin();
            em.persist(revisao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar a revisão do veículo" + e);
            //Mensagem.mensagemErro("Erro ao salvar a revisão do veículo", "ERRO: Revisão");
        } finally {
            em.close();
        }
        return revisao;

    }

    public RevisaoBean merge(RevisaoBean revisao) {

        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(revisao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar a revisão do veículo" + e);
            //Mensagem.mensagemErro("Erro ao atualizar a revisão do veículo", "ERRO: Revisão");
        } finally {
            em.close();
        }

        return revisao;
    }

    public RevisaoBean findById(Integer id) {

        EntityManager em = new ConnectionFactory().getConnetion();
        RevisaoBean revisao = null;
        try {
            revisao = em.find(RevisaoBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar a revisão do veículo" + e);
            //Mensagem.mensagemErro("Erro ao buscar a revisão do veículo", "ERRO: Revisão não encontrado");
        } finally {
            em.close();
        }

        return revisao;
    }

    public List<RevisaoBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<RevisaoBean> revisoes = null;
        try {
            revisoes = em.createQuery("from RevisaoBean r").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar as revisões" + e);
            //Mensagem.mensagemErro("Erro ao buscar as revisões", "ERRO: Revisão");
        }finally{
            em.close();
        }
        
        return revisoes;
    }
    
    public  RevisaoBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        RevisaoBean revisao = null;
    
        try {
            revisao = em.find(RevisaoBean.class, id);
            em.getTransaction().begin();
            em.remove(revisao);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover a revisão do veículo" + e);
            //Mensagem.mensagemErro("Erro ao remover a revisão do veículo", "ERRO: Revisão");
        }finally{
            em.close();
        }
        
        return revisao;    
    }
}
