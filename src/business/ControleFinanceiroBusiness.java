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
        dao.getInstance().persist(controleFinanceiro);
        //dao.persist(controleFinanceiro);
    }
    public void merge (ControleFinanceiroBean controleFinanceiro){
        dao.getInstance().merge(controleFinanceiro);
        //dao.merge(controleFinanceiro);
    }
    public void findById(Integer id) {
        dao.getInstance().findById(id);
        //dao.findById(id);
    }
    public ArrayList<ControleFinanceiroBean> findAll(){
        return dao.getInstance().findAll();
        //return dao.findAll();
    }
    public void remove(Integer id){
        dao.getInstance().remove(id);
        //dao.remove(id);
    }
}
