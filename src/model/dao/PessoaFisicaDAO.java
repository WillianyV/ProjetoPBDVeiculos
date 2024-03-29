/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import model.beans.PessoaFisicaBean;

/**
 *
 * @author willi
 */
public class PessoaFisicaDAO {
    public void persist(PessoaFisicaBean pf) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(pf);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Cliente-Pessoa Fisica" + e);
            //Mensagem.mensagemErro("Erro ao salvar Cliente-Pessoa Fisica", "ERRO: Endereço");
        } finally {
            em.close();
        }

    }

    public PessoaFisicaBean merge(PessoaFisicaBean pf) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(pf);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Cliente-Pessoa Fisica" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Cliente-Pessoa Fisica", "ERRO: Cliente-PF");
        } finally {
            em.close();
        }

        return pf;
    }

    public PessoaFisicaBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        PessoaFisicaBean pf = null;
        try {
            pf = em.find(PessoaFisicaBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Cliente-Pessoa Fisica" + e);
            //Mensagem.mensagemErro("Erro ao buscar Cliente-Pessoa Fisica", "ERRO: Cliente-PF não encontrado");
        } finally {
            em.close();
        }

        return pf;
    }

    public ArrayList<PessoaFisicaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<PessoaFisicaBean> pf = null;
        try {
            pf = (ArrayList)em.createQuery("from PessoaFisicaBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Clientes-Pessoa Fisica" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Clientes-Pessoa Fisica", "ERRO: Cliente-PF");
        }finally{
            em.close();
        }
        
        return pf;
    }
   
    public  PessoaFisicaBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        PessoaFisicaBean pf;
         pf = em.find(PessoaFisicaBean.class, id);
        try {
            em.getTransaction().begin();
            em.remove(pf);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            pf.setStatus(false);
            merge(pf);
            System.err.println("Erro ao remover Cliente-Pessoa Fisica, pois está sendo utilizado\nO Status do Cliente será modificado para falso");
            
            //Mensagem.mensagemErro("Erro ao remover Cliente-Pessoa Fisica", "ERRO: Cliente-PF");
        }finally{
            em.close();
        }
        
        return pf;    
    }
}
