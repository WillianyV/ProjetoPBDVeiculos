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
    public LocacaoBean merge (LocacaoBean locacao){
      return dao.merge(locacao);
    }
    public LocacaoBean findById(Integer id) {
        return dao.findById(id);
    }
    public ArrayList<LocacaoBean> findAll(){
        return dao.findAll();
    }
    public LocacaoBean remove(Integer id){
        return dao.remove(id);
    } 
    
    /*
    validar data, não pode ser a mesma do dia tem q ser maior
    ex: um dia amais 
    */
}
