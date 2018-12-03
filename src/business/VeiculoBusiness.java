/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.VeiculoBean;
import model.dao.VeiculoDAO;

/**
 *
 * @author willi
 */
public class VeiculoBusiness {
    
    VeiculoDAO dao; 

    public VeiculoBusiness() {
        this.dao = new VeiculoDAO();
    }
    public void persit(VeiculoBean veiculo){
        dao.persist(veiculo);
    }
    public void merge (VeiculoBean veiculo){
      dao.merge(veiculo);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<VeiculoBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    }  
    
}
