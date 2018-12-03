/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import model.beans.VeiculoBean;

/**
 *
 * @author willi
 */
public class VeiculoDAO {
    public VeiculoBean persist(VeiculoBean veiculo) {        
        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.persist(veiculo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao salvar veículo" + e);
            //Mensagem.mensagemErro("Erro ao salvar veículo"ERRO: Veículo");
        } finally {
            em.close();
        }
        return veiculo;

    }

    public VeiculoBean merge(VeiculoBean veiculo) {

        EntityManager em = new ConnectionFactory().getConnetion();
        try {
            em.getTransaction().begin();
            em.merge(veiculo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao atualizar veículo" + e);
            //Mensagem.mensagemErro("Erro ao atualizar veículo", "ERRO: Veículo");
        } finally {
            em.close();
        }

        return veiculo;
    }

    public VeiculoBean findById(Integer id) {

        EntityManager em = new ConnectionFactory().getConnetion();
        VeiculoBean veiculo = null;
        try {
            veiculo = em.find(VeiculoBean.class, id);
        } catch (Exception e) {
            System.err.println("Erro ao buscar veículo" + e);
            //Mensagem.mensagemErro("Erro ao buscar veículo", "ERRO: Veículo não encontrado");
        } finally {
            em.close();
        }

        return veiculo;
    }

    public ArrayList<VeiculoBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<VeiculoBean> veiculos = null;
        try {
            veiculos = (ArrayList) em.createQuery("from VeiculoBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar os veículos" + e);
            //Mensagem.mensagemErro("Erro ao buscar os veículos", "ERRO: Veículos");
        }finally{
            em.close();
        }
        
        return veiculos;
    }
    
    public  VeiculoBean remove (Integer id) {
        EntityManager em = new ConnectionFactory().getConnetion();
        VeiculoBean veiculo = null;
    
        try {
            veiculo = em.find(VeiculoBean.class, id);
            em.getTransaction().begin();
            em.remove(veiculo);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println("Erro ao remover veículo" + e);
            //Mensagem.mensagemErro("Erro ao remover veículo", "ERRO: Veículo");
        }finally{
            em.close();
        }
        
        return veiculo;    
    }
}
