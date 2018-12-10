/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import fachada.Fachada;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import model.beans.UsuarioBean;
import util.Util;

/**
 *
 * @author willi
 */
public class UsuarioDAO {

    public void persist(UsuarioBean usuario) {
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar Usuario : " + e);
            //Mensagem.mensagemErro("Erro ao salvar Usuario", "ERRO: Usuario");
        } finally {
            em.close();
        }

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

    public ArrayList<UsuarioBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<UsuarioBean> usuarios = null;
        try {
            usuarios = (ArrayList) em.createQuery("from UsuarioBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os Usuarios" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Usuarios", "ERRO: Usuario");
        } finally {
            em.close();
        }

        return usuarios;
    }

    public UsuarioBean remove(Integer id) {
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
        } finally {
            em.close();
        }

        return usuario;
    }

    public boolean editarSenha(UsuarioBean usuario, String novaSenha) {
        
        if(Fachada.getUsuarioLogado().getLogin().equals(usuario.getLogin())){
            if (Util.validarSenha(novaSenha)) {
            usuario.setSenha(Util.criptografarSenha(novaSenha));
            merge(usuario);
            return true;
            }
        }
        
        return false;
    }

    public boolean resetSenha(UsuarioBean superUsuario, UsuarioBean usuario) {
        boolean editarSenha = false;

        if (superUsuario.getTipo_usuario().equals("Superusuário")) {
            editarSenha = editarSenha(usuario, "!1NovaSenha");
        }

        return editarSenha;
    }

    
    public boolean fazerLogin(String login, String senha){
       
       for(UsuarioBean u : findAll()){
            if(u.getLogin().equals(login) && u.getSenha().equals(Util.criptografarSenha(senha))){
                Fachada.setUsuarioLogado(u);
                return true;
            }
       }
       return  false;
    }

}
