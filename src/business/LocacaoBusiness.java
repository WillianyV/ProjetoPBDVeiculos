/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.LocacaoBean;
import model.dao.LocacaoDAO;

/**
 *
 * @author willi
 */
public class LocacaoBusiness {
    
    LocacaoDAO dao;

    public LocacaoBusiness() {
        this.dao = new LocacaoDAO();
    }
    
    public void persit(LocacaoBean locacao){
        dao.persist(locacao);
    }
    public void merge (LocacaoBean locacao){
      dao.merge(locacao);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<LocacaoBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    } 
}
