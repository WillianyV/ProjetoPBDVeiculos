/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
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
    
    public UsuarioBean cadastrar(UsuarioBean usuario){
        CPFValidator validador = new CPFValidator();
        try {
            validador.assertValid(usuario.getCPF());
            if(Util.validarSenha(usuario.getSenha())){
                UsuarioBean u = dao.persist(usuario);
            }else{
                System.err.println("Digite uma senha válida");
                //Mensagem.mensagemInformacao("Digite uma senha válido", "Senha INVÁLIDA");
            }
        } catch (InvalidStateException e) {
            System.err.println("Digite um CPF válido");
            //Mensagem.mensagemInformacao("Digite um CPF válido", "CPF INVÁLIDO");
        }
        
        return usuario;        
    }
    
    
    /*
    public Usuario getById(int id){
        return null;
    } 
    
    public ArrayList<Usuario> getAll(){
        return null;
    }
    
    public void persist(Usuario usuario){}
    
    public void merge(Usuario usuario) {}
    public void remove(Usuario usuario) {}
    public void removeById(int id) {}
    */
    
}
