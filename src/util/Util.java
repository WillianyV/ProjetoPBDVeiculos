/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author willi
 */
public class Util {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String RESTRICOES = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*]).{6,11})";
    
    public static boolean validarSenha(String senha) {
        pattern = Pattern.compile(RESTRICOES);
        matcher = pattern.matcher(senha);
        return matcher.matches();
    }       
    
    public static Date getDate(String d) {
        d = d.replaceAll("/", "");
        int ano = (Integer.parseInt(d.substring(4, 8))) - 1900;
        int mes = (Integer.parseInt(d.substring(2, 4))) - 1;
        int dia = (Integer.parseInt(d.substring(0, 2)));
        // System.out.println("Dia:" + dia +" mes: "+ (mes+1) + " Ano:"+(ano+1900));
        Date data = new Date(ano, mes, dia);
        return data;
    }
}
