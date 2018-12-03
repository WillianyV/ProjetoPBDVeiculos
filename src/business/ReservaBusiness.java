/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.ReservaBean;
import model.dao.ReservaDAO;

/**
 *
 * @author willi
 */
public class ReservaBusiness {
      
    ReservaDAO dao;

    public ReservaBusiness() {
        this.dao = new ReservaDAO();
    }
    
    public void persit(ReservaBean reserva){
        
        dao.persist(reserva);
    }
    public void merge (ReservaBean reserva){
      dao.merge(reserva);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<ReservaBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    }    
}
