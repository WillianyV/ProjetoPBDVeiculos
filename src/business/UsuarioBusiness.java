/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import fachada.Fachada;
import java.util.ArrayList;
import model.beans.UsuarioBean;
import model.dao.UsuarioDAO;
import util.Util;
import view.Mensagem;

/**
 *
 * @author willi
 */
public class UsuarioBusiness {
    UsuarioDAO dao;

    public UsuarioBusiness() {
        this.dao = new UsuarioDAO();
    }
    
    public void persist(UsuarioBean usuario){
        CPFValidator validador = new CPFValidator();
        try {
            validador.assertValid(usuario.getCPF());
            if(Util.validarSenha(usuario.getSenha())){
                Fachada.getInstance().cadastrarEndereco(usuario.getFk_endereco());
                dao.persist(usuario);
            }else{
                System.err.println("Digite uma senha válida");
                //Mensagem.mensagemInformacao("Digite uma senha válido", "Senha INVÁLIDA");
            }
        } catch (InvalidStateException e) {
            System.err.println("Digite um CPF válido");
            //Mensagem.mensagemInformacao("Digite um CPF válido", "CPF INVÁLIDO");
        }       
    }
    
    public UsuarioBean merge(UsuarioBean usuario){
        return dao.merge(usuario);        
    }
    
    public UsuarioBean getById(int id){
        return dao.findById(id);
    }
    
     public ArrayList<UsuarioBean> getAll(){
         return dao.findAll();
     }
     
     public ArrayList<UsuarioBean> getByName(String nome){
         ArrayList<UsuarioBean> usuarios = new ArrayList<>();
         getAll().stream().filter((u) -> (u.getNome().contains(nome))).forEachOrdered((u) -> {
             usuarios.add(u);
        });
         /*
         for(UsuarioBean u: getAll()){
             if(u.getNome().contains(nome)){
                 usuarios.add(u);
             }
         }
         */
         return  usuarios;
     }
     
     public UsuarioBean remove(Integer id){
        return  dao.remove(id);
     }
}
