/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import fachada.Fachada;
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
    public SedeFilialBean merge (SedeFilialBean sedeFilial){
      return dao.merge(sedeFilial);
    }
    public SedeFilialBean findById(Integer id) {
        return dao.findById(id);
    }
    public ArrayList<SedeFilialBean> findAll(){
        return dao.findAll();
    }
    public SedeFilialBean remove(Integer id){
        return dao.remove(id);
    }
    
}
