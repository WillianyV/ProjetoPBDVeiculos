/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connenction.ConnectionFactory;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import model.beans.ClienteBean;

/**
 *
 * @author willi
 */
public class ClienteDAO {
    public ArrayList<ClienteBean> findAll() {
        EntityManager em = new ConnectionFactory().getConnetion();
        ArrayList<ClienteBean> cliente = null;
        try {
            cliente = (ArrayList)em.createQuery("from ClienteBean e").getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar as Categorias" + e);
            //Mensagem.mensagemErro("Erro ao buscar os Automóveis", "ERRO: Automovel");
        }finally{
            em.close();
        }        
        return cliente;
    }
}
