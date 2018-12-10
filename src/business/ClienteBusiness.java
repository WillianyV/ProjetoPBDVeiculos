/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.CategoriaBean;
import model.beans.ClienteBean;
import model.dao.ClienteDAO;

/**
 *
 * @author willi
 */
public class ClienteBusiness {
    ClienteDAO dao;

    public ClienteBusiness() {
        this.dao = new ClienteDAO();
    }
    public ArrayList<ClienteBean> findAll(){
         return dao.findAll();
     }
}
