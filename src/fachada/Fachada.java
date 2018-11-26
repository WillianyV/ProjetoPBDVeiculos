/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import business.UsuarioBusiness;
import model.beans.UsuarioBean;

/**
 *
 * @author willi
 */
public class Fachada {
    
    private static Fachada fachada;
    private static UsuarioBean usuarioLogado;
    
    private static UsuarioBusiness usuarioBusiness;
    
    public static Fachada getInstance(){
        if(fachada == null){
            fachada = new Fachada();
        }
        return fachada;
    }

    public Fachada() {
        usuarioBusiness = new UsuarioBusiness();
        
    }
    
    public UsuarioBean cadastrarUsuario(UsuarioBean usuario){
        return usuarioBusiness.cadastrar(usuario);
    }
    
}
