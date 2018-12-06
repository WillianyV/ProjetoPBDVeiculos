/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.ControleFinanceiroBean;
import model.dao.ControleFinanceiroDAO;

/**
 *
 * @author willi
 */
public class ControleFinanceiroBusiness {
    
    ControleFinanceiroDAO dao;

    public ControleFinanceiroBusiness() {
        this.dao = new ControleFinanceiroDAO();
    }
    public void persit(ControleFinanceiroBean controleFinanceiro){
         dao.persist(controleFinanceiro);
    }
    public ControleFinanceiroBean merge (ControleFinanceiroBean controleFinanceiro){
        return dao.merge(controleFinanceiro);
    }
    public ControleFinanceiroBean findById(Integer id) {
        return dao.findById(id);
    }
    public ArrayList<ControleFinanceiroBean> findAll(){
        return dao.findAll();
    }
    public ControleFinanceiroBean remove(Integer id){
        return dao.remove(id);
    }
}
