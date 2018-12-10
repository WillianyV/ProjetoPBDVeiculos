/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import business.AutomovelBusiness;
import business.CamionetasCargaBusiness;
import business.CamionetasPassageirosBusiness;
import business.CategoriaBusiness;
import business.ClienteBusiness;
import business.ControleFinanceiroBusiness;
import business.EnderecoBusiness;
import business.LocacaoBusiness;
import business.MotoristaBusiness;
import business.PessoaFisicaBusiness;
import business.PessoaJuridicaBusiness;
import business.ReservaBusiness;
import business.SedeFilialBusiness;
import business.UsuarioBusiness;
import business.VeiculoBusiness;
import java.util.ArrayList;
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

/**
 *
 * @author willi
 */
public class Fachada {
    
    private static Fachada fachada;
    private static UsuarioBean usuarioLogado;
    
    private static AutomovelBusiness automovelBusiness;
    private static CamionetasCargaBusiness camionetasCargaBusiness;
    private static CamionetasPassageirosBusiness camionetasPassageirosBusiness;
    private static ControleFinanceiroBusiness controleFinanceiroBusiness;    
    private static EnderecoBusiness enderecoBusiness;    
    private static LocacaoBusiness locacaoBusiness;
    private static MotoristaBusiness motoristaBusiness;
    private static PessoaFisicaBusiness pessoaFisicaBusiness;
    private static PessoaJuridicaBusiness pessoaJuridicaBusiness;
    private static ReservaBusiness reservaBusiness;    
    private static SedeFilialBusiness sedeFilialBusiness;
    private static UsuarioBusiness usuarioBusiness;    
    private static VeiculoBusiness veiculoBusiness; 
    private static CategoriaBusiness categoriaBusiness;
    private static ClienteBusiness clienteBusiness;
    
    public Fachada() {
        automovelBusiness = new AutomovelBusiness();
        camionetasCargaBusiness = new CamionetasCargaBusiness();
        camionetasPassageirosBusiness = new CamionetasPassageirosBusiness();
        enderecoBusiness = new EnderecoBusiness();
        locacaoBusiness = new LocacaoBusiness();
        motoristaBusiness = new MotoristaBusiness();
        pessoaFisicaBusiness = new PessoaFisicaBusiness();
        pessoaJuridicaBusiness = new PessoaJuridicaBusiness();
        reservaBusiness = new ReservaBusiness();
        sedeFilialBusiness = new SedeFilialBusiness();
        usuarioBusiness = new UsuarioBusiness(); 
        veiculoBusiness = new VeiculoBusiness();
        controleFinanceiroBusiness = new ControleFinanceiroBusiness();
        categoriaBusiness = new CategoriaBusiness();
        clienteBusiness = new ClienteBusiness();
        
    }
    
    public static Fachada getInstance(){
        if(fachada == null){
            fachada = new Fachada();
        }
        return fachada;
    }
    public void cadastrarControleFinanceiro(ControleFinanceiroBean controleFinanceiro){
          controleFinanceiroBusiness.persit(controleFinanceiro);
    }
    public ControleFinanceiroBean editarControleFinanceiro(ControleFinanceiroBean controleFinanceiro){
        return controleFinanceiroBusiness.merge(controleFinanceiro);
    }
    public ControleFinanceiroBean excluirControleFinanceiro(Integer id){
        return controleFinanceiroBusiness.remove(id);
    }
    public ControleFinanceiroBean pesquisarControleFinanceiroId(Integer id){
        return controleFinanceiroBusiness.findById(id);
    }
    public ArrayList<ControleFinanceiroBean> pesquisarControleFinanceiroAll(){
        return controleFinanceiroBusiness.findAll();
    }
    public void cadastrarAutomovel(AutomovelBean automovel){
       automovelBusiness.persit(automovel);
    }
    public AutomovelBean editarAutomovel(AutomovelBean automovel){
        return automovelBusiness.merge(automovel);
    }
    public AutomovelBean excluirAutomovel(Integer id){
        return automovelBusiness.remove(id);
    }
    public AutomovelBean pesquisarAutomovelId(Integer id){
        return automovelBusiness.findById(id);
    }
    public ArrayList<AutomovelBean> pesquisarAutomovelAll(){
        return automovelBusiness.findAll();
    }
    public ArrayList<AutomovelBean> pesquisarAutomovelCod(String cod){
        return automovelBusiness.findByCodigo(cod);
    }
    public void cadastrarCamionetasCarga(CamionetasCargaBean camionetasCarga){
        camionetasCargaBusiness.persit(camionetasCarga);
    }
    public CamionetasCargaBean editarCamionetasCarga(CamionetasCargaBean camionetasCarga){
        return camionetasCargaBusiness.merge(camionetasCarga);
    }
    public CamionetasCargaBean excluirCamionetasCarga(Integer id){
        return camionetasCargaBusiness.remove(id);
    }
    public CamionetasCargaBean pesquisarCamionetasCargaId(Integer id){
        return camionetasCargaBusiness.findById(id);
    }
    public ArrayList<CamionetasCargaBean> pesquisarCamionetasCargaAll(){
        return camionetasCargaBusiness.findAll();
    }
    public ArrayList<CamionetasCargaBean> pesquisarCamionetasCargaCod(String cod){
        return camionetasCargaBusiness.findByCodigo(cod);
    }
    public void cadastrarCamionetasPassageiros(CamionetasPassageirosBean camionetasPassageiros){
        camionetasPassageirosBusiness.persit(camionetasPassageiros);
    }
    public CamionetasPassageirosBean editarCamionetasPassageiros(CamionetasPassageirosBean camionetasPassageiros){
        return camionetasPassageirosBusiness.merge(camionetasPassageiros);
    }
    public CamionetasPassageirosBean excluirCamionetasPassageiros(Integer id){
        return camionetasPassageirosBusiness.remove(id);
    }
    public CamionetasPassageirosBean pesquisarCamionetasPassageirosId(Integer id){
        return camionetasPassageirosBusiness.findById(id);
    }
    public ArrayList<CamionetasPassageirosBean> pesquisarCamionetasPassageirosAll(){
        return camionetasPassageirosBusiness.findAll();
    }
    public ArrayList<CamionetasPassageirosBean> pesquisarCamionetasPassageirosCod(String cod){
        return camionetasPassageirosBusiness.findByCodigo(cod);
    }
    public void cadastrarEndereco(EnderecoBean endereco){
        enderecoBusiness.persit(endereco);
    }
    public EnderecoBean editarEndereco(EnderecoBean endereco) {
       return enderecoBusiness.merge(endereco);
    }
    public  EnderecoBean excluirEndereco (Integer id) {
        return enderecoBusiness.remove(id);
    }
    public EnderecoBean pesquisarEnderecoId(Integer id) {
        return enderecoBusiness.findById(id);
    }
    public ArrayList<EnderecoBean> pesquisarEnderecoAll() {
        return enderecoBusiness.findAll();
    }
    public void cadastrarLocacao(LocacaoBean locacao){
        locacaoBusiness.persit(locacao);
    }
    public LocacaoBean editarLocacao(LocacaoBean locacao){
        return locacaoBusiness.merge(locacao);
    }
    public LocacaoBean excluirLocacao(Integer id){
        return locacaoBusiness.remove(id);
    }
    public LocacaoBean pesquisarLocacaoId(Integer id){
        return locacaoBusiness.findById(id);
    }
    public ArrayList<LocacaoBean> pesquisarLocacaoAll(){
        return locacaoBusiness.findAll();
    }
    public void cadastrarMotorista(MotoristaBean motorista){
        motoristaBusiness.persit(motorista);
    }
    public MotoristaBean editarMotorista(MotoristaBean motorista){
        return motoristaBusiness.merge(motorista);
    }
    public MotoristaBean excluirMotorista(Integer id){
        return motoristaBusiness.remove(id);
    }
    public MotoristaBean pesquisarMotoristaId(Integer id){
        return motoristaBusiness.findById(id);
    }
    public ArrayList<MotoristaBean> pesquisarMotoristaAll(){
        return motoristaBusiness.findAll();
    }
    public void cadastrarPessoaFisica(PessoaFisicaBean pessoaFisica){
        pessoaFisicaBusiness.persit(pessoaFisica);
    }
    public PessoaFisicaBean editarPessoaFisica(PessoaFisicaBean pessoaFisica){
        return pessoaFisicaBusiness.merge(pessoaFisica);
    }
    public PessoaFisicaBean excluirPessoaFisica(Integer id){
        return pessoaFisicaBusiness.remove(id);
    }
    public PessoaFisicaBean pesquisarPessoaFisicaId(Integer id){
        return pessoaFisicaBusiness.findById(id);
    }
    public ArrayList<PessoaFisicaBean> pesquisarPessoaFisicaAll(){
        return pessoaFisicaBusiness.findAll();
    }
     public void cadastrarPessoaJuridica(PessoaJuridicaBean pessoaJuridica){
        pessoaJuridicaBusiness.persit(pessoaJuridica);
    }
    public PessoaJuridicaBean editarPessoaJuridica(PessoaJuridicaBean pessoaJuridica){
        return pessoaJuridicaBusiness.merge(pessoaJuridica);
    }
    public PessoaJuridicaBean excluirPessoaJuridica(Integer id){
        return pessoaJuridicaBusiness.remove(id);
    }
    public PessoaJuridicaBean pesquisarPessoaJuridicaId(Integer id){
        return pessoaJuridicaBusiness.findById(id);
    }
    public ArrayList<PessoaJuridicaBean> pesquisarPessoaJuridicaAll(){
        return pessoaJuridicaBusiness.findAll();
    }
    public void cadastrarReserva(ReservaBean reserva){
        reservaBusiness.persit(reserva);
    }
    public ReservaBean editarReserva(ReservaBean reserva){
        return reservaBusiness.merge(reserva);
    }
    public ReservaBean excluirReserva(Integer id){
        return reservaBusiness.remove(id);
    }
    public ReservaBean pesquisarReservaId(Integer id){
        return reservaBusiness.findById(id);
    }
    public ArrayList<ReservaBean> pesquisarReservaAll(){
        return reservaBusiness.findAll();
    }
    public void cadastrarSedeFilial(SedeFilialBean sedeFilial){
        sedeFilialBusiness.persit(sedeFilial);
    }
    public SedeFilialBean editarSedeFilial(SedeFilialBean sedeFilial){
        return sedeFilialBusiness.merge(sedeFilial);
    }
    public SedeFilialBean excluirSedeFilial(Integer id){
        return sedeFilialBusiness.remove(id);
    }
    public SedeFilialBean pesquisarSedeFilialId(Integer id){
        return sedeFilialBusiness.findById(id);
    }
    public ArrayList<SedeFilialBean> pesquisarSedeFilialAll(){
        return sedeFilialBusiness.findAll();
    }    
    public void cadastrarUsuario(UsuarioBean usuario){
        usuarioBusiness.persist(usuario);
    }
    public UsuarioBean editarUsuario(UsuarioBean usuario){
        return usuarioBusiness.merge(usuario);
    }
    public UsuarioBean excluirUsuario(Integer id){
        return usuarioBusiness.remove(id);
    }
    public UsuarioBean pesquisarUsuarioId(Integer id){
        return usuarioBusiness.getById(id);
    }
    public ArrayList<UsuarioBean> pesquisarUsuarioAll(){
        return usuarioBusiness.getAll();
    }
    public ArrayList<UsuarioBean> pesquisarUsuarioNome(String nome){
        return usuarioBusiness.getByName(nome);
    }
    public boolean editarSenha(UsuarioBean usuario, String novaSenha){
       return usuarioBusiness.editarSenha(usuario, novaSenha);
    }
    public boolean resetSenha(UsuarioBean superUsuario, UsuarioBean usuario){
        return usuarioBusiness.resetSenha(superUsuario, usuario);
    }
    
    public boolean fazerLogin(String login, String senha){
        return usuarioBusiness.fazerLogin(login, senha);
    }
    /*
    public UsuarioBean fazerLogin(String login, String senha){
        return usuarioBusiness.fazerLogin(login, senha);
    }*/
    public void cadastrarVeiculo(VeiculoBean veiculo){
        veiculoBusiness.persit(veiculo);
    }
    public VeiculoBean editarVeiculo(VeiculoBean veiculo){
        return veiculoBusiness.merge(veiculo);
    }
    public VeiculoBean excluirVeiculo(Integer id){
        return veiculoBusiness.remove(id);
    }
    public VeiculoBean pesquisarVeiculoId(Integer id){
        return veiculoBusiness.findById(id);
    }
    public ArrayList<VeiculoBean> pesquisarVeiculoAll(){
        return veiculoBusiness.findAll();
    }
    public ArrayList<CategoriaBean> pesquisarCategoriaAll(){
        return categoriaBusiness.findAll();
    }
    public ArrayList<ClienteBean> pesquisarClienteAll(){
        return clienteBusiness.findAll();
    }
    
    public static UsuarioBean getUsuarioLogado() {
        return usuarioLogado;
    }
    public static void setUsuarioLogado(UsuarioBean usuarioLogado) {
        Fachada.usuarioLogado = usuarioLogado;
    }
}
