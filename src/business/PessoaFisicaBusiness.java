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
import model.beans.PessoaFisicaBean;
import model.dao.PessoaFisicaDAO;

/**
 *
 * @author willi
 */
public class PessoaFisicaBusiness {
     
    PessoaFisicaDAO dao;

    public PessoaFisicaBusiness() {
        this.dao = new PessoaFisicaDAO();
    }
    
    public void persit(PessoaFisicaBean pessoaFisicaBean){
        CNPJValidator validador = new CNPJValidator();
        try {
            validador.assertValid(pessoaFisicaBean.getCPF());
            Fachada.getInstance().cadastrarEndereco(pessoaFisicaBean.getFk_endereco());
            dao.persist(pessoaFisicaBean);
        } catch (InvalidStateException e) {
            System.err.println("Digite um CPF válido");
            //Mensagem.mensagemInformacao("Digite um CPF válido", "CPF INVÁLIDO");
        }
    }
    public void merge (PessoaFisicaBean pessoaFisicaBean){
      dao.merge(pessoaFisicaBean);
    }
    public void findById(Integer id) {
        dao.findById(id);
    }
    public ArrayList<PessoaFisicaBean> findAll(){
        return dao.findAll();
    }
    public void remove(Integer id){
        dao.remove(id);
    } 
}
