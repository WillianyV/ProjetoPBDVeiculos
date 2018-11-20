/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import model.beans.UsuarioBean;

/**
 *
 * @author willi
 */
public class UsuarioDAO {
    
    public UsuarioBean persist(UsuarioBean usuario) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Usuario" + e);
            //Mensagem.mensagemErro("Erro ao salvar Usuario", "ERRO: Usuario");
        } finally {
            em.close();
        }
        return usuario;

    }

    public UsuarioBean merge(UsuarioBean usuario) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar Usuario" + e);
            //Mensagem.mensagemErro("Erro ao atualizar Usuario", "ERRO: Usuario");
        } finally {
            em.close();
        }

        return usuario;
    }

    public UsuarioBean findById(Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        UsuarioBean usuario = null;
        try {
            usuario = em.find(UsuarioBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar Usuario" + e);
            //Mensagem.mensagemErro("Erro ao buscar Usuario", "ERRO: Usuario não encontrado");
        } finally {
            em.close();
        }

        return usuario;
    }

    public List<UsuarioBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        List<UsuarioBean> usuarios = null;
        try {
            usuarios = em.createQuery("from UsuarioBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Usuarios" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Usuarios", "ERRO: Usuario");
        }finally{
            em.close();
        }
        
        return usuarios;
    }
   
    public  UsuarioBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        UsuarioBean usuario = null;
    
        try {
            usuario = em.find(UsuarioBean.class, id);
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover Usuario" + e);
            //Mensagem.mensagemErro("Erro ao remover Usuario", "ERRO: Usuario");
        }finally{
            em.close();
        }
        
        return usuario;    
    }
}
