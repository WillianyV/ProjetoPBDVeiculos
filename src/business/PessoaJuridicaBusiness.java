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
import model.beans.PessoaJuridicaBean;
import model.dao.PessoaJuridicaDAO;

/**
 *
 * @author willi
 */
public class PessoaJuridicaBusiness {
   
    PessoaJuridicaDAO dao;

    public PessoaJuridicaBusiness() {
        this.dao = new PessoaJuridicaDAO();
    }
    
    public void persit(PessoaJuridicaBean pessoaJuridica){
        CNPJValidator validadorCNPJ = new CNPJValidator(); 
        //INSCRICAO ESTADUAL
        try {
            validadorCNPJ.assertValid(pessoaJuridica.getCNPJ());
            Fachada.getInstance().cadastrarEndereco(pessoaJuridica.getFk_endereco());
            dao.persist(pessoaJuridica);
        } catch (InvalidStateException e) {
            System.err.println("Digite um CNPJ válido");
            //Mensagem.mensagemInformacao("Digite um CNPJ válido", "CPF INVÁLIDO");
        }
    }
    public PessoaJuridicaBean merge (PessoaJuridicaBean pessoaJuridica){
      return dao.merge(pessoaJuridica);
    }
    public PessoaJuridicaBean findById(Integer id) {
        return dao.findById(id);
    }
    public ArrayList<PessoaJuridicaBean> findAll(){
        return dao.findAll();
    }
    public PessoaJuridicaBean remove(Integer id){
        return dao.remove(id);
    } 
}
