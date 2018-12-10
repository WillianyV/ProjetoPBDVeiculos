/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import model.beans.MotoristaBean;
import model.dao.MotoristaDAO;
import util.Util;
import view.Mensagem;

/**
 *
 * @author willi
 */
public class MotoristaBusiness {
    
    MotoristaDAO dao;
    
    public MotoristaBusiness() {
        this.dao = new MotoristaDAO();
    }
    public void persit(MotoristaBean motorista){
       if(!(Util.validaCNH(motorista.getCNH()))){
           System.err.println("CNH Inválida");
       }else if(Util.verificarIdade(motorista.getDN()) >= 21){
            dao.persist(motorista);
       }else{
           System.err.println("Motorista com idade menor a de 21 anos");
           //Mensagem.mensagemInformacao("Motorista menos de 21 anos", "Erro");           
       }       
    }
    public MotoristaBean merge (MotoristaBean motorista){
      return dao.merge(motorista);
    }
    public MotoristaBean findById(Integer id) {
        return dao.findById(id);
    }
    public ArrayList<MotoristaBean> findAll(){
        return dao.findAll();
    }
    public MotoristaBean remove(Integer id){
        return dao.remove(id);
    }
}
