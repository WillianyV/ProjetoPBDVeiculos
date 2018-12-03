/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import model.beans.MotoristaBean;

/**
 *
 * @author willi
 */
public class MotoristaDAO {
    
    public MotoristaBean persist(MotoristaBean motorista) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(motorista);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Motorista" + e);
            //Mensagem.mensagemErro("Erro ao salvar Motorista", "ERRO: Motorista");
        } finally {
            em.close();
        }
        return motorista;

    }

    public MotoristaBean merge(MotoristaBean motorista) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(motorista);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Motorista" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Motorista", "ERRO: Motorista");
        } finally {
            em.close();
        }
        return motorista;
    }

    public MotoristaBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        MotoristaBean motorista = null;
        try {
            motorista = em.find(MotoristaBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Motorista" + e);
            //Mensagem.mensagemErro("Erro ao buscar Motorista", "ERRO: Motorista não encontrado");
        } finally {
            em.close();
        }

        return motorista;
    }

    public ArrayList<MotoristaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<MotoristaBean> motoristas = null;
        try {
            motoristas = (ArrayList)em.createQuery("from MotoristaBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Motoristas" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Motoristas", "ERRO: Motorista");
        }finally{
            em.close();
        }
        
        return motoristas;
    }
   
    public  MotoristaBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        MotoristaBean motorista = null;
    
        try {
            motorista = em.find(MotoristaBean.class, id);
            em.getTransaction().begin();
            em.remove(motorista);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Motorista" + e);
            //Mensagem.mensagemErro("Erro ao remover Motorista", "ERRO: Motoristas");
        }finally{
            em.close();
        }
        
        return motorista;    
    }
}
