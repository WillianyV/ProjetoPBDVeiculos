/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;
import model.beans.CamionetasPassageirosBean;
import model.dao.CamionetasPassageirosDAO;

/**
 *
 * @author willi
 */
public class CamionetasPassageirosBusiness {
    
    CamionetasPassageirosDAO dao;

    public CamionetasPassageirosBusiness() {
    this.dao = new CamionetasPassageirosDAO();
    }
    
    public void persit(CamionetasPassageirosBean camionetasPassageiros){
        dao.persist(camionetasPassageiros);
    }
    public void merge (CamionetasPassageirosBean camionetasPassageiros){
      dao.merge(camionetasPassageiros);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<CamionetasPassageirosBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    }
    public ArrayList<CamionetasPassageirosBean> findByCodigo(String cod){
        ArrayList<CamionetasPassageirosBean> passageiros = new ArrayList<>();
        findAll().stream().filter((p) -> (p.getCodigo().contains(cod))).forEachOrdered((p) -> {
            passageiros.add(p);
        });
        /*
         for(CamionetasPassageirosBean p :  findAll()){
            if(p.getCodigo().contains(cod)){
                passageiros.add(p);
            }
        }
        */
        return passageiros;
    }
}
