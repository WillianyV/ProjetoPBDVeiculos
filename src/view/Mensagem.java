/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Mensagem {
    public static void mensagem(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
    
    public static void mensagemInformacao(String txt,String cab){
        JOptionPane.showMessageDialog(null, txt, cab, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void mensagemErro(String txt,String cab){
        JOptionPane.showMessageDialog(null, txt, cab, JOptionPane.ERROR_MESSAGE);
    }
}
