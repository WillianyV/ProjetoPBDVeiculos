/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;
import model.beans.FormasPagamentosBean;
import model.dao.FormasPagamentosDAO;

/**
 *
 * @author willi
 */
public class FormasPagamentosBusiness {
    
    FormasPagamentosDAO dao;

    public FormasPagamentosBusiness() {
        this.dao = new FormasPagamentosDAO();
    }
    
     public void persit(FormasPagamentosBean formasPagamentos){
        dao.persist(formasPagamentos);
    }
    public void merge (FormasPagamentosBean formasPagamentos){
      dao.merge(formasPagamentos);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<FormasPagamentosBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    } 
}
