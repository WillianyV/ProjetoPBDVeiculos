package app;

import fachada.Fachada;
import model.beans.EnderecoBean;
import model.beans.SedeFilialBean;
import model.beans.UsuarioBean;


/**
 *
 * @author willi
 */
public class App {

    public static void main(String[] args) {
        UsuarioBean usuario = new UsuarioBean("Williany1", "Super", "Eu", "1Q!2w3e4r");
        EnderecoBean endereco = new EnderecoBean("oi", "santa", "floresta", "pe", "5640000", 304);
        //usuario.setFk_endereco(endereco);
        SedeFilialBean sede = new SedeFilialBean("hello");
        //usuario.setFk_sede_filial(sede);
        Fachada.getInstance().cadastrarUsuario(usuario);
    }
}
