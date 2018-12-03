/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.SedeFilialBean;
import model.dao.SedeFilialDAO;

/**
 *
 * @author willi
 */
public class SedeFilialBusiness {
    SedeFilialDAO dao;

    public SedeFilialBusiness() {
        this.dao = new SedeFilialDAO();
    }
    public void persit(SedeFilialBean sedeFilial){
        dao.persist(sedeFilial);
    }
    public void merge (SedeFilialBean sedeFilial){
      dao.merge(sedeFilial);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<SedeFilialBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    }
    
}
