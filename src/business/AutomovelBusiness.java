/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.AutomovelBean;
import model.dao.AutomovelDAO;

/**
 *
 * @author willi
 */
public class AutomovelBusiness {
    AutomovelDAO dao;
    
    public AutomovelBusiness() {
        this.dao = new AutomovelDAO();
    }
    
    public void persit(AutomovelBean automovel){
        dao.persist(automovel);
    }
    public void merge (AutomovelBean automovel){
      dao.merge(automovel);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<AutomovelBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    }
    public ArrayList<AutomovelBean> findByCodigo(String cod){
        ArrayList<AutomovelBean> automoveis = new ArrayList<>();
        findAll().stream().filter((a) -> (a.getCodigo().contains(cod))).forEachOrdered((a) -> {
            automoveis.add(a);
        });
        /*
        for(AutomovelBean a :  findAll()){
            if(a.getCodigo().contains(cod)){
                automoveis.add(a);
            }
        }
        */
        return automoveis;
    }
}
