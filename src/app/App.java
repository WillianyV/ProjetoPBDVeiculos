package app;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import fachada.Fachada;
import java.util.ArrayList;
import java.util.Date;
import model.beans.AutomovelBean;
import model.beans.CamionetasCargaBean;
import model.beans.CamionetasPassageirosBean;
import model.beans.CategoriaBean;
import model.beans.ClienteBean;
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
import util.Util;

/**
 *
 * @author willi
 */
public class App {

    public static void main(String[] args) {
        /*
        Cadastro das entidades e pesquisar por id:
        */
        /*
        //CADASTRO EMPRESA:
        EnderecoBean enderecoEmpresa = new EnderecoBean("Rua 1", "Santa Rosa", "Floresta", "PE", "56400-000", 4);
        SedeFilialBean sedeFilial = new SedeFilialBean("Veículos Pajeú", "Sede", "10.848.522/0001-00", true, enderecoEmpresa);
        
        Fachada.getInstance().cadastrarSedeFilial(sedeFilial);
        
        //CADASTRO CATEGORIAS:
        AutomovelBean automovelCompacto = new AutomovelBean("AT1", "Automóvel", "Pequeno", "Compacto", "Automático", true, true, true, true, true, true, 55, true);
        AutomovelBean automovelMinivan = new AutomovelBean("AT2", "Automóvel", "Médio", "Minivan", "Manul", true, true, true, true, true, true, 118, true);
        CamionetasCargaBean cCargaTrioEletrico = new CamionetasCargaBean((float)1.5, (float)1.6, (float)1, (float)2.5 , (float)1, "Manual", "CC1", "Camioneta de Carga", "Grande", "Caminhão Trio Elétrico", "Manual", true, true, true, true, true, true,(float)10.0, true);
        CamionetasCargaBean cCargaCaminhao= new CamionetasCargaBean((float)1.5, (float)1.6, (float)1, (float)2.5 , (float)1, "Manual", "CC1", "Camioneta de Carga", "Grande", "Caminhão", "Manual", true, true, true, true, true, true,(float)250.0, true);
        CamionetasPassageirosBean cPassageirosOnibus = new CamionetasPassageirosBean("Frontal", true, true, true, true, "CP1", " Camioneta de Passageiro", "Grande", "Ónibus", "Manual", true, true, true, true, true, true,(float)300.0, true);
        CamionetasPassageirosBean cPassageirosMicroOnibus = new CamionetasPassageirosBean("Frontal", true, true, true, true, "CP1", " Camioneta de Passageiro", "Médio", "Micro Ónibus", "Automático", true, true, true, true, true, true,(float)200.0, true);               
        
        Fachada.getInstance().cadastrarAutomovel(automovelCompacto);
        Fachada.getInstance().cadastrarAutomovel(automovelMinivan);
        Fachada.getInstance().cadastrarCamionetasCarga(cCargaTrioEletrico);
        Fachada.getInstance().cadastrarCamionetasCarga(cCargaCaminhao);
        Fachada.getInstance().cadastrarCamionetasPassageiros(cPassageirosOnibus);
        Fachada.getInstance().cadastrarCamionetasPassageiros(cPassageirosMicroOnibus);
        
        //PESQUISAR POR ID:
        SedeFilialBean sede = Fachada.getInstance().pesquisarSedeFilialId(1);
        
        AutomovelBean at1 = Fachada.getInstance().pesquisarAutomovelId(1);
        AutomovelBean at2 = Fachada.getInstance().pesquisarAutomovelId(2);
        CamionetasCargaBean cc1 = Fachada.getInstance().pesquisarCamionetasCargaId(3);
        CamionetasCargaBean cc2 = Fachada.getInstance().pesquisarCamionetasCargaId(4);
        CamionetasPassageirosBean cp1 = Fachada.getInstance().pesquisarCamionetasPassageirosId(5);
        CamionetasPassageirosBean cp2 = Fachada.getInstance().pesquisarCamionetasPassageirosId(6);
        
        //CADASTRO DE VEÍCULOS:
        VeiculoBean veiculoAT1 = new VeiculoBean("LVU-0249", "9BWZZZ377VT004251", "12w12w21", 2, 100, 4, 4, "Prata", "Toyota Prius", "híbrido", "Toyota", true, 2017, 2017, at1, sede);
        VeiculoBean veiculoAT2 = new VeiculoBean("NEM-2387", "9BWZZZ377VT004252", "12w12w22", 2, 100, 4, 4, "Prata", "Volkswagen up! TSI ", "gasolina", "Volkswagen", true, 2018, 2018, at2, sede);
        VeiculoBean veiculoCC1 = new VeiculoBean("LVU-0248", "9BWZZZ377VT004253", "12w12w3", 2, 100, 4, 4, "Prata", "VT 880", "gasolina", "Volvo", true, 2018, 2018, cc1, sede);
        VeiculoBean veiculoCC2 = new VeiculoBean("NEM-2388", "9BWZZZ377VT004254", "12w12w24", 2, 100, 4, 4, "Prata", "Actros", "gasolina", "Mercedes Benz", true, 2018, 2018, cc2, sede);
        VeiculoBean veiculoCP1 = new VeiculoBean("LVU-0249", "9BWZZZ377VT004255", "12w12w3a", 2, 100, 4, 4, "Prata", "Mb 1318", "gasolina", "Mb", true, 2018, 2018, cp1, sede);       
        VeiculoBean veiculoCP2 = new VeiculoBean("NEM-2332", "9BWZZZ377VT004254", "12w12w242", 2, 100, 4, 4, "Prata", "Mb 100", "gasolina", "Mb", true, 2018, 2018, cp2, sede);
                
        Fachada.getInstance().cadastrarVeiculo(veiculoAT1);
        Fachada.getInstance().cadastrarVeiculo(veiculoAT2);
        Fachada.getInstance().cadastrarVeiculo(veiculoCC1);
        Fachada.getInstance().cadastrarVeiculo(veiculoCC2);
        Fachada.getInstance().cadastrarVeiculo(veiculoCP1);
        Fachada.getInstance().cadastrarVeiculo(veiculoCP2);
        
        //CADASTRO DE USUARIOS:
        EnderecoBean enderecoAdmn = new EnderecoBean("Rua Lourival Diniz Carvalho", "Santa Rosa", "Floresta", "PE", "56400-000", 304);
        EnderecoBean enderecoSuper = new EnderecoBean("Rua Lourival Diniz Carvalho", "Santa Rosa", "Floresta", "PE", "56400-000", 304);
        EnderecoBean enderecoAten = new EnderecoBean("Rua Lourival Diniz Carvalho", "Santa Rosa", "Floresta", "PE", "56400-000", 304);
        
        UsuarioBean usuarioAdm = new UsuarioBean("Administrador", true, "41722546085", "380071551", "1000010", "Administrador", "admin", "Admin!1",Util.getDate("02/09/1995") , enderecoAdmn, sede);
        UsuarioBean usuarioSuper = new UsuarioBean("Superusuário", true, "087.222.750-29", "15.670.793-7", "1290821.12", "Superusuário", "super", "Super!1", Util.getDate("02/10/1995") , enderecoSuper, sede);
        UsuarioBean usuarioAten = new UsuarioBean("Atendente", true, "944.395.990-95", "46.679.828-3", "413432.45", "Atendente", "aten", "Aten!1", Util.getDate("02/11/1995"), enderecoAten, sede);
        
        Fachada.getInstance().cadastrarUsuario(usuarioAdm);
        Fachada.getInstance().cadastrarUsuario(usuarioSuper);
        Fachada.getInstance().cadastrarUsuario(usuarioAten);
        
        //CADASTRO DE CLIENTES:
        EnderecoBean enderecoPF = new EnderecoBean("Rua Lourival Diniz Carvalho", "Santa Rosa", "Floresta", "PE", "56400-000", 304);
        EnderecoBean enderecoPJ = new EnderecoBean("Rua 1", "Santa Rosa", "Floresta", "PE", "56400-000", 4);
        
        PessoaFisicaBean pessoaFisica = new PessoaFisicaBean("202.802.320-12", "F", Util.getDate("02/09/1995") , "Williany Veras", true, enderecoPF);
        PessoaJuridicaBean pessoaJuridicaBean = new PessoaJuridicaBean("91.516.240/0001-07", "12312424", "Laclinf", true, enderecoPJ);
        
        Fachada.getInstance().cadastrarPessoaFisica(pessoaFisica);
        Fachada.getInstance().cadastrarPessoaJuridica(pessoaJuridicaBean);
        
        //CADASTRO DE MOTORISTA:
        MotoristaBean motorista = new MotoristaBean("kamala khan", true, "19329541613", Util.getDate("02/09/2020") , Util.getDate("02/09/1995") );
        
        Fachada.getInstance().cadastrarMotorista(motorista);
        
        //PESQUISAR POR ID:
        UsuarioBean aten = Fachada.getInstance().pesquisarUsuarioId(3);
        PessoaFisicaBean pf = Fachada.getInstance().pesquisarPessoaFisicaId(1);
        MotoristaBean mt = Fachada.getInstance().pesquisarMotoristaId(1);
        VeiculoBean v = Fachada.getInstance().pesquisarVeiculoId(2);
        
        //CADASTRO DE RESERVA: 
        ReservaBean reservaPF = new ReservaBean(Util.getDateTime(), Util.getDate("20/12/2028"), aten, pf, at2, at2.getValor_locar_categoria(), true);
        
        Fachada.getInstance().cadastrarReserva(reservaPF);
        
        //CADASTRO DE LOCAÇÃO:
        LocacaoBean locacao = new LocacaoBean("KM Inicial", Util.getDateTime(), (float)100.12, (at2.getValor_locar_categoria()/2), true, aten, pf, mt, v);
        
        Fachada.getInstance().cadastrarLocacao(locacao);
        
        //PESQUISAR POR ID:
         LocacaoBean l = Fachada.getInstance().pesquisarLocacaoId(1);
        
        //CADASTRO DO FINCANCEIRO:
        ControleFinanceiroBean financeiro = new ControleFinanceiroBean("Veiculo", (at2.getValor_locar_categoria()/2),Util.getDate("10/12/2018") , "Credito", "Dinheiro", aten, l);
        
        Fachada.getInstance().cadastrarControleFinanceiro(financeiro);
        */
        
        
        /*
         Listar all:
        */
        
        //LISTAR CATEGORIAS:
       /* for(CategoriaBean cat : Fachada.getInstance().pesquisarCategoriaAll()){
            System.out.println(cat.toString());
        }
        //LISTAR CLIENTES:
        
        for(ClienteBean c : Fachada.getInstance().pesquisarClienteAll()){
            System.out.println(c.toString());
        }
        */
        
        /*
        //LISTAR AS SEDES OU FILIAIS DA EMPRESA:
        for(SedeFilialBean s : Fachada.getInstance().pesquisarSedeFilialAll()){
            System.out.println(s.toString());
        }
        
        //LISTAR VEICULOS:
        for(VeiculoBean v : Fachada.getInstance().pesquisarVeiculoAll()){
            System.out.println(v.toString());
        }
        
        //LISTAR USUARIOS:
         for(UsuarioBean u : Fachada.getInstance().pesquisarUsuarioAll()){
            System.out.println(u.toString());
        }
       //LISTAR MOTORISTAS:
        for(MotoristaBean m : Fachada.getInstance().pesquisarMotoristaAll()){
            System.out.println(m.toString());
        }
        //LISTAR RESERVAS:
        for(ReservaBean r : Fachada.getInstance().pesquisarReservaAll()){
            System.out.println(r.toString());
        }
         //LISTAR LOCAÇÕES:
        for(LocacaoBean l : Fachada.getInstance().pesquisarLocacaoAll()){
            System.out.println(l.toString());
        }
        
        //LISTAR FINCANCEIRO:
        for(ControleFinanceiroBean cf : Fachada.getInstance().pesquisarControleFinanceiroAll()){
            System.out.println(cf.toString());
        }*/
        
        
        
        /*
        Fazer login:
        */
        /*if(Fachada.getInstance().fazerLogin("super", "Super!1")){
            System.out.println("Usuario Logado");
        }else{
            System.err.println("Erro ao entrar no sistema");
        }
        System.out.println(Fachada.getUsuarioLogado().toString());
        */
        
        
        /*
        Reset senha:
        */
        /*UsuarioBean user = Fachada.getInstance().pesquisarUsuarioId(3);
        if(Fachada.getInstance().resetSenha(Fachada.getUsuarioLogado(), user)){
            System.out.println("Senha resetada com sucesso");
        }else{
            System.err.println("Erro ao resetar senha");
        }
        */
        
        
        /*
        Editar senha:
        */
        /*if(Fachada.getInstance().fazerLogin("aten", "!1NovaSenha")){
            System.out.println("Usuario Logado");
        }else{
            System.err.println("Erro ao entrar no sistema");
        }
        System.out.println(Fachada.getUsuarioLogado().toString());
        
        if(Fachada.getInstance().editarSenha(user, "!Q2w3e4r")){
            System.out.println("Senha editada com sucesso");
        }else{
            System.out.println("Erro ao editar senha");
        }*/
        
        
        /*
        Editar:
        */
        //CATEGORIA:
        /*
        AutomovelBean automovel = Fachada.getInstance().pesquisarAutomovelId(1);
        automovel.setStatus(false);
        Fachada.getInstance().editarAutomovel(automovel);
        ArrayList<AutomovelBean> A = Fachada.getInstance().pesquisarAutomovelCod("AT1");
        System.out.println(A);
        
        //EMPRESA:
        
        SedeFilialBean sedeF = Fachada.getInstance().pesquisarSedeFilialId(1);
        sedeF.setTipo("Filial");
        sedeF.setStatus(true);
        Fachada.getInstance().editarSedeFilial(sedeF);
        
        //CLIENTES:
        
        PessoaFisicaBean psf =Fachada.getInstance().pesquisarPessoaFisicaId(1);
        psf.setSexo("M");
        Fachada.getInstance().editarPessoaFisica(psf);
        
        //VEICULOS:
        
        VeiculoBean ve = Fachada.getInstance().pesquisarVeiculoId(1);
        ve.setAno_fabricacao(2016);
        Fachada.getInstance().editarVeiculo(ve);
        
        //USUARIO:
       
        UsuarioBean us = Fachada.getInstance().pesquisarUsuarioId(1);
        us.setStatus(false);
        Fachada.getInstance().editarUsuario(us);
       
        //MOTORISTA:
       
        MotoristaBean mo = Fachada.getInstance().pesquisarMotoristaId(1);
        mo.setNome("Capitão America");
        Fachada.getInstance().editarMotorista(mo);
       
        //RESERVA:
       
        ReservaBean re = Fachada.getInstance().pesquisarReservaId(1);
        re.setStatus(false);
        Fachada.getInstance().editarReserva(re);
        
        //LOCAÇÃO:
       
        LocacaoBean lo = Fachada.getInstance().pesquisarLocacaoId(1);
        lo.setStatus(false);
        Fachada.getInstance().editarLocacao(lo);
        
        //FINCANCEIRO:
        
        ControleFinanceiroBean controlF = Fachada.getInstance().pesquisarControleFinanceiroId(1);
        controlF.setValor(200);
        Fachada.getInstance().editarControleFinanceiro(controlF);
        */
        
        /*
        Remover:
        */
         /*
        //CATEGORIA:
        AutomovelBean automovel1 = Fachada.getInstance().pesquisarAutomovelId(1);
        Fachada.getInstance().excluirAutomovel(automovel1.getId());
        //EMPRESA:
        SedeFilialBean sedeF1 = Fachada.getInstance().pesquisarSedeFilialId(1);
        Fachada.getInstance().excluirSedeFilial(sedeF1.getId());
        //CLIENTES:
        PessoaFisicaBean psf1 =Fachada.getInstance().pesquisarPessoaFisicaId(1);
        Fachada.getInstance().excluirPessoaFisica(psf1.getId());
        //VEICULOS:
        VeiculoBean ve1 = Fachada.getInstance().pesquisarVeiculoId(1);
        Fachada.getInstance().excluirVeiculo(ve1.getId());
        //USUARIO:
        UsuarioBean us1 = Fachada.getInstance().pesquisarUsuarioId(1);
        Fachada.getInstance().excluirUsuario(us1.getId());
        //MOTORISTA:
        MotoristaBean mo1 = Fachada.getInstance().pesquisarMotoristaId(1);
        Fachada.getInstance().excluirMotorista(mo1.getId());
        //RESERVA:
        ReservaBean re1 = Fachada.getInstance().pesquisarReservaId(1);
        Fachada.getInstance().excluirReserva(re1.getId());
        //LOCAÇÃO:
        LocacaoBean lo1 = Fachada.getInstance().pesquisarLocacaoId(1);
        Fachada.getInstance().excluirLocacao(lo1.getId());
        //FINCANCEIRO:
        ControleFinanceiroBean controlF1 = Fachada.getInstance().pesquisarControleFinanceiroId(1);
        Fachada.getInstance().excluirControleFinanceiro(controlF1.getId());
        */
               
    }
}
