/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.CamionetasCargaBean;
import model.dao.CamionetasCargaDAO;

/**
 *
 * @author willi
 */
public class CamionetasCargaBusiness {
    CamionetasCargaDAO dao;
    
    public CamionetasCargaBusiness() {
        this.dao = new CamionetasCargaDAO();
    }
    
    public void persit(CamionetasCargaBean camionetasCarga){
        dao.persist(camionetasCarga);
    }
    public void merge (CamionetasCargaBean camionetasCarga){
      dao.merge(camionetasCarga);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<CamionetasCargaBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    }
     public ArrayList<CamionetasCargaBean> findByCodigo(String cod){
         ArrayList<CamionetasCargaBean> cargas = new ArrayList<>();
         findAll().stream().filter((c) -> (c.getCodigo().contains(cod))).forEachOrdered((c) -> {
             cargas.add(c);
        });
         /*
         for(CamionetasCargaBean c :  findAll()){
            if(c.getCodigo().contains(cod)){
                cargas.add(c);
            }
        }
         */
         return cargas;
     }
    
}
