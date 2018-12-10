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
import model.beans.EnderecoBean;
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
            //validador.assertValid(pessoaFisicaBean.getCPF());
            //Fachada.getInstance().cadastrarEndereco(pessoaFisicaBean.getFk_endereco());
            dao.persist(pessoaFisicaBean);
        } catch (InvalidStateException e) {
            System.err.println("Digite um CPF válido");
            //Mensagem.mensagemInformacao("Digite um CPF válido", "CPF INVÁLIDO");
        }
    }
    public PessoaFisicaBean merge (PessoaFisicaBean pessoaFisicaBean){
        return dao.merge(pessoaFisicaBean);
    }
    public PessoaFisicaBean findById(Integer id) {
        return dao.findById(id);
    }
    public ArrayList<PessoaFisicaBean> findAll(){
        return dao.findAll();
    }
    public PessoaFisicaBean remove(Integer id){
        return dao.remove(id);
    } 
}
