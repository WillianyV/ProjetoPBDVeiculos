/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;
import model.beans.EnderecoBean;
import model.dao.EnderecoDAO;

/**
 *
 * @author willi
 */
public class EnderecoBusiness {
    EnderecoDAO dao;

    public EnderecoBusiness() {
        this.dao = new EnderecoDAO();
    }
    
    public void persit(EnderecoBean endereco){
        dao.persist(endereco);
    }

    public void merge(EnderecoBean endereco) {
       dao.merge(endereco);
    }

    public void findById(Integer id) {
        dao.findById(id);
    }

    public ArrayList<EnderecoBean> findAll() {
        return dao.findAll();
    }
   
    public  void remove (Integer id) {
        dao.remove(id);
    }
}
