/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import fachada.Fachada;
import java.util.ArrayList;
import model.beans.SedeFilialBean;
import model.dao.SedeFilialDAO;
import view.Mensagem;

/**
 *
 * @author willi
 */
public class SedeFilialBusiness {
    SedeFilialDAO dao;

    public SedeFilialBusiness() {
        this.dao = new SedeFilialDAO();
    }
    public void persit(SedeFilialBean sedeFilial){
        CNPJValidator validador = new CNPJValidator(); 
        try {
            validador.assertValid(sedeFilial.getCNPJ());
            //Fachada.getInstance().cadastrarEndereco(sedeFilial.getFk_endereco());
            dao.persist(sedeFilial);
        } catch (InvalidStateException e) {
            System.err.println("Digite um CNPJ válido");
            //Mensagem.mensagemErro("Digite um CNPJ válido", "CNPJ Erro");
        }
        
    }
    public SedeFilialBean merge (SedeFilialBean sedeFilial){
      return dao.merge(sedeFilial);
    }
    public SedeFilialBean findById(Integer id) {
        return dao.findById(id);
    }
    public ArrayList<SedeFilialBean> findAll(){
        return dao.findAll();
    }
    public SedeFilialBean remove(Integer id){
        return dao.remove(id);
    }
    
}
