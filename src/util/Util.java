/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Calendar;
import java.util.Date;
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

    public static int verificarIdade(Date dn) {
        Calendar data = Calendar.getInstance();
        int idade = data.get(Calendar.YEAR) - dn.getYear();
        return idade;
    }

    public static boolean validaCNH(String cnh) {
        /*Código para validar CNH em java
	 * Código disponível em: https://github.com/danielsouza/validarCNH/blob/master/ValidarCNH.java
        */
        char char1 = cnh.charAt(0);

        if (cnh.replaceAll("\\D+", "").length() != 11
                || String.format("%0" + 11 + "d", 0).replace('0', char1).equals(cnh)) {
            return false;
        }

        long v = 0, j = 9;

        for (int i = 0; i < 9; ++i, --j) {
            v += ((cnh.charAt(i) - 48) * j);
        }

        long dsc = 0, vl1 = v % 11;

        if (vl1 >= 10) {
            vl1 = 0;
            dsc = 2;
        }

        v = 0;
        j = 1;

        for (int i = 0; i < 9; ++i, ++j) {
            v += ((cnh.charAt(i) - 48) * j);
        }

        long x = v % 11;
        long vl2 = (x >= 10) ? 0 : x - dsc;

        return (String.valueOf(vl1) + String.valueOf(vl2)).equals(cnh.substring(cnh.length() - 2));
    }
}
