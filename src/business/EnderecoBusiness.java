/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
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

    public EnderecoBean merge(EnderecoBean endereco) {
       return dao.merge(endereco);
    }

    public EnderecoBean findById(Integer id) {
        return dao.findById(id);
    }

    public ArrayList<EnderecoBean> findAll() {
        return dao.findAll();
    }
   
    public  EnderecoBean remove (Integer id) {
        return dao.remove(id);
    }
}
