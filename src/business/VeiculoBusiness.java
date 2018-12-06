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
    public VeiculoBean merge (VeiculoBean veiculo){
      return dao.merge(veiculo);
    }
    public VeiculoBean findById(Integer id) {
       return  dao.findById(id);
    }
    public ArrayList<VeiculoBean> findAll(){
        return dao.findAll();
    }
    public VeiculoBean remove(Integer id){
        return dao.remove(id);
    }  
    
}
