package app;

import fachada.Fachada;
import java.util.Date;
import model.beans.AutomovelBean;
import model.beans.CamionetasCargaBean;
import model.beans.CamionetasPassageirosBean;
import model.beans.CategoriaBean;
import model.beans.ControleFinanceiroBean;
import model.beans.EnderecoBean;
import model.beans.LocacaoBean;
import model.beans.MotoristaBean;
import model.beans.PessoaFisicaBean;
import model.beans.PessoaJuridicaBean;
import model.beans.ReservaBean;
import model.beans.SedeFilialBean;
import model.beans.UsuarioBean;
import model.beans.VeiculoBean;

/**
 *
 * @author willi
 */
public class App {

    public static void main(String[] args) {
        /*
        UsuarioBean usuario = new UsuarioBean("Williany1", "Super", "Eu", "1Q!2w3e4r");
        usuario.setId(1);
        ControleFinanceiroBean controleFinanceiro = new ControleFinanceiroBean("agua", (float) 3.5, new Date(2018, 12, 5), "Debito", "Credito",usuario);
        Fachada.getInstance().cadastrarControleFinanceiro(controleFinanceiro);
        EnderecoBean endereco = new EnderecoBean("oi", "santa", "floresta", "pe", "5640000", 304);
       
       SedeFilialBean sedeFilial = new SedeFilialBean("Veiculo 2");
       sedeFilial.setFk_endereco(endereco);
       
       Fachada.getInstance().cadastrarSedeFilial(sedeFilial);
       
         */

        UsuarioBean usuario = Fachada.getInstance().pesquisarUsuarioId(1);
        
        Fachada.getInstance().excluirUsuario(1);
        
        //ControleFinanceiroBean controleFinanceiro = Fachada.getInstance().pesquisarControleFinanceiroId(1);
        
        
    }
}
