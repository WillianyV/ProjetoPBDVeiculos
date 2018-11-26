package app;

import business.UsuarioBusiness;
import fachada.Fachada;
import java.util.Date;
import model.beans.AutomovelBean;
import model.beans.CamionetasCargaBean;
import model.beans.CamionetasPassageirosBean;
import model.beans.CategoriaBean;
import model.beans.ControleFinanceiroBean;
import model.beans.EnderecoBean;
import model.beans.FormasPagamentosBean;
import model.beans.LimpezaBean;
import model.beans.LocacaoBean;
import model.beans.MotoristaBean;
import model.beans.PessoaFisicaBean;
import model.beans.PessoaJuridicaBean;
import model.beans.ReservaBean;
import model.beans.RevisaoBean;
import model.beans.SedeFilialBean;
import model.beans.UsuarioBean;
import model.beans.VeiculoBean;
import model.dao.AutomovelDAO;
import model.dao.CamionetasCargaDAO;
import model.dao.CamionetasPassageirosDAO;
import model.dao.ControleFinanceiroDAO;
import model.dao.EnderecoDAO;
import model.dao.FormasPagamentosDAO;
import model.dao.LimpezaDAO;
import model.dao.LocacaoDAO;
import model.dao.MotoristaDAO;
import model.dao.PessoaFisicaDAO;
import model.dao.PessoaJuridicaDAO;
import model.dao.ReservaDAO;
import model.dao.RevisaoDAO;
import model.dao.SedeFilialDAO;
import model.dao.UsuarioDAO;
import model.dao.VeiculoDAO;

/**
 *
 * @author willi
 */
public class App {

    public static void main(String[] args) {
       
        MotoristaBean m = new MotoristaBean("12345253", new Date(2021, 11, 12), new Date(1995, 9,2));
        EnderecoBean e = new EnderecoBean("Avenida P. P. Guerra", "Centro", "Floresta", "PE", "56400-000", 68);
        
        SedeFilialBean sede = new SedeFilialBean("hello", e);
        CamionetasPassageirosBean cp = new CamionetasPassageirosBean("CP1", "Onibus");
        VeiculoBean v = new VeiculoBean(12341, "Ativo", cp, sede);
        PessoaFisicaBean pf = new PessoaFisicaBean("1234567", m, "williany", e);
        UsuarioBean user  = new UsuarioBean("Terezinha", "ADM", "oi", "oi", e, sede);
        SedeFilialDAO sedeDao = new SedeFilialDAO();

        EnderecoDAO end = new EnderecoDAO();
        //end.persist(e);
        
        //sedeDao.persist(sede);
        
        Fachada.getInstance().cadastrarUsuario(new UsuarioBean("thalita", "077.110.924-58", "adm", "oi", "!1Q2w3e4r", end.persist(e),sedeDao.persist(sede) ));
        
        /*
        PessoaFisicaBean pf = new PessoaFisicaBean("1234567", m, "williany", e);
        PessoaFisicaDAO pfDao = new PessoaFisicaDAO();
        pfDao.persist(pf);
        
        UsuarioBean user  = new UsuarioBean("Terezinha", "ADM", "oi", "oi", e, sede);
        UsuarioDAO userDao = new UsuarioDAO();
        userDao.persist(user);
         
        VeiculoBean v = new VeiculoBean(12341, "Ativo", cp, sede);
        VeiculoDAO vDao = new VeiculoDAO();
        vDao.persist(v);
        
        LimpezaBean  l = new LimpezaBean(new Date(2018, 11, 12), v);
        LimpezaDAO lDao = new LimpezaDAO();
        lDao.persist(l);
        
        
        LocacaoBean lo = new LocacaoBean("KM Livre", new Date(2018, 11, 12), new Date(2018, 11, 12, 12, 12), cp, user, pf, m);
        LocacaoDAO loDao = new LocacaoDAO();
        loDao.persist(lo);
        
        */
        
        /*
        NAO ESTAO CADASTRANDO:
        
        ControleFinanceiroBean con = new ControleFinanceiroBean("oi", 180, new Date(2018, 11, 22), "conta", user, f, lo);
        ControleFinanceiroDAO conDao = new ControleFinanceiroDAO();
        conDao.persist(con);
        
        ReservaBean r = new ReservaBean(new Date(2018,12, 3), user, cp);
        ReservaDAO rDao = new ReservaDAO();
        rDao.persist(r);
        
        RevisaoBean re = new RevisaoBean(new Date(2018, 11, 25), v);
        RevisaoDAO reDao = new RevisaoDAO();
        reDao.persist(re);
        
        */
        
        /*
        ESTAO CADASTRANTO:
        SedeFilialBean sede = new SedeFilialBean("hello", e);
        SedeFilialDAO sedeDao = new SedeFilialDAO();
        sedeDao.persist(sede);
        
        
        EnderecoBean e = new EnderecoBean("Avenida P. P. Guerra", "Centro", "Floresta", "PE", "56400-000", 68);
        EnderecoDAO end = new EnderecoDAO();

        AutomovelBean au = new AutomovelBean("At1", "Automovel");
        AutomovelDAO daoAu = new AutomovelDAO();

        CamionetasCargaBean cc = new CamionetasCargaBean("CC1", "caminhão");
        CamionetasCargaDAO daoCc = new CamionetasCargaDAO();

        CamionetasPassageirosBean cp = new CamionetasPassageirosBean("CP1", "Onibus");
        CamionetasPassageirosDAO daoCp = new CamionetasPassageirosDAO();
        
        PessoaJuridicaBean pj = new PessoaJuridicaBean("12345566", "Laclinf", e);
        PessoaJuridicaDAO pjDao = new PessoaJuridicaDAO();
        pjDao.persist(pj);
        
        FormasPagamentosBean f = new FormasPagamentosBean("Dinheiro");
        FormasPagamentosDAO fdao = new FormasPagamentosDAO();
        fdao.persist(f);
        
        MotoristaBean m = new MotoristaBean("12345253", new Date(2021, 11, 12), new Date(1995, 9,2));
        MotoristaDAO mDao = new MotoristaDAO();
        mDao.persist(m);

        
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
        
        
        
        //daoAu.persist(au);
        au.setAr_condicionado(true);
        au.setId(1);
        au.setNome("GOL");
        daoAu.merge(au);
       
        //daoCc.persist(cc);
        cc.setId(2);
        cc.setAr_condicionado(true);
        cc.setCamera_re(true);
        cc.setDesempenho(18);
        daoCc.merge(cc);
        
        //daoCp.persist(cp);
        cp.setId(3);
        cp.setAr_condicionado(true);
        cp.setCamera_re(true);
        cp.setDirecao_assistida(true);
        daoCp.merge(cp);
        
                 */
    }
}
