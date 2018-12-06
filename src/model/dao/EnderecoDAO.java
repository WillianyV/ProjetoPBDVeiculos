/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.EnderecoBean;
import view.Mensagem;

/**
 *
 * @author willi
 */
public class EnderecoDAO {

    public void persist(EnderecoBean endereco) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar endereço" + e);
            //Mensagem.mensagemErro("Erro ao salvar endereço", "ERRO: Endereço");
        } finally {
            em.close();
        }

    }

    public EnderecoBean merge(EnderecoBean endereco) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar endereço" + e);
            //Mensagem.mensagemErro("Erro ao atualizar endereço", "ERRO: Endereço");
        } finally {
            em.close();
        }

        return endereco;
    }

    public EnderecoBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        EnderecoBean endereco = null;
        try {
            endereco = em.find(EnderecoBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar endereço" + e);
            //Mensagem.mensagemErro("Erro ao buscar endereço", "ERRO: endereço não encontrado");
        } finally {
            em.close();
        }

        return endereco;
    }

    public ArrayList<EnderecoBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<EnderecoBean> enderecos = null;
        try {
            enderecos = (ArrayList)em.createQuery("from EnderecoBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os endereço" + e);
            //Mensagem.mensagemErro("Erro ao buscar os endereço", "ERRO: Endereço");
        }finally{
            em.close();
        }
        
        return enderecos;
    }
   
    public  EnderecoBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        EnderecoBean endereco = null;
    
        try {
            endereco = em.find(EnderecoBean.class, id);
            em.getTransaction().begin();
            em.remove(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover endereço" + e);
            //Mensagem.mensagemErro("Erro ao remover endereço", "ERRO: Endereço");
        }finally{
            em.close();
        }
        
        return endereco;    
    }
    
}
