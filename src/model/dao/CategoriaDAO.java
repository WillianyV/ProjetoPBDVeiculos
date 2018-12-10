/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import model.beans.CategoriaBean;

/**
 *
 * @author willi
 */
public class CategoriaDAO {
     public ArrayList<CategoriaBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<CategoriaBean> categoria = null;
        try {
            categoria = (ArrayList)em.createQuery("from CategoriaBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar as Categorias" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Automóveis", "ERRO: Automovel");
        }finally{
            em.close();
        }        
        return categoria;
    }
}
