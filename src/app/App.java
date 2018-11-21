package app;

import java.util.Date;
import model.beans.EnderecoBean;
import model.beans.LimpezaBean;
import model.beans.PessoaJuridicaBean;
import model.beans.VeiculoBean;
import model.dao.EnderecoDAO;
import model.dao.LimpezaDAO;
import model.dao.PessoaJuridicaDAO;

/**
 *
 * @author willi
 */
public class App {

    public static void main(String[] args) {
        EnderecoBean e = new EnderecoBean("Rua Lourival Diniz Carvalho", "Santa Rosa", "Floresta", "PE", "56400-000", 304);
        EnderecoDAO end = new EnderecoDAO();
        
        end.persist(e);
       
       /* 
        Verificar: 
        LimpezaBean l = new LimpezaBean(new Date(2018, 11, 19), new VeiculoBean();//termicar
        LimpezaDAO daoL = new LimpezaDAO();
        daoL.persist(l);
        
        */
        
        /*
        //Cadastrar:
        end.persist(e);
        
        //atualizar:
        e.setId(2);
        e.setBairro("Centro");
        end.merge(e);
        
        //Procurar id:
        EnderecoBean eB = end.findById(2);
        System.out.println(eB.toString());
        
        //Procurar todos:
         for(EnderecoBean eB:end.findAll() ){
            System.out.println(eB.toString());
        }  
       
       //Remover:
        end.remove(2);
        */
    }
}
