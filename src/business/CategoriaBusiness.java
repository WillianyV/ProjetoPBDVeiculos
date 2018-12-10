/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.CategoriaBean;
import model.dao.CategoriaDAO;

/**
 *
 * @author willi
 */
public class CategoriaBusiness {
    CategoriaDAO dao;

    public CategoriaBusiness() {
        this.dao = new CategoriaDAO();
    }
    public ArrayList<CategoriaBean> findAll(){
         return dao.findAll();
     }
}
