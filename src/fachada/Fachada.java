/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import business.AutomovelBusiness;
import business.CamionetasCargaBusiness;
import business.CamionetasPassageirosBusiness;
import business.ControleFinanceiroBusiness;
import business.EnderecoBusiness;
import business.FormasPagamentosBusiness;
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
import model.beans.EnderecoBean;
import model.beans.FormasPagamentosBean;
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
    private static FormasPagamentosBusiness formasPagamentosBusiness;
    private static LocacaoBusiness locacaoBusiness;
    private static MotoristaBusiness motoristaBusiness;
    private static PessoaFisicaBusiness pessoaFisicaBusiness;
    private static PessoaJuridicaBusiness pessoaJuridicaBusiness;
    private static ReservaBusiness reservaBusiness;    
    private static SedeFilialBusiness sedeFilialBusiness;
    private static UsuarioBusiness usuarioBusiness;    
    private static VeiculoBusiness veiculoBusiness; 
    
    public Fachada() {
        automovelBusiness = new AutomovelBusiness();
        camionetasCargaBusiness = new CamionetasCargaBusiness();
        camionetasPassageirosBusiness = new CamionetasPassageirosBusiness();
        enderecoBusiness = new EnderecoBusiness();
        formasPagamentosBusiness = new FormasPagamentosBusiness();
        locacaoBusiness = new LocacaoBusiness();
        motoristaBusiness = new MotoristaBusiness();
        pessoaFisicaBusiness = new PessoaFisicaBusiness();
        pessoaJuridicaBusiness = new PessoaJuridicaBusiness();
        reservaBusiness = new ReservaBusiness();
        sedeFilialBusiness = new SedeFilialBusiness();
        usuarioBusiness = new UsuarioBusiness(); 
        veiculoBusiness = new VeiculoBusiness();
    }
    
    public static Fachada getInstance(){
        if(fachada == null){
            fachada = new Fachada();
        }
        return fachada;
    }
    
    public void cadastrarAutomovel(AutomovelBean automovel){
       automovelBusiness.persit(automovel);
    }
    public void editarAutomovel(AutomovelBean automovel){
        automovelBusiness.merge(automovel);
    }
    public void excluirAutomovel(Integer id){
        automovelBusiness.remove(id);
    }
    public void pesquisarAutomovelId(Integer id){
        automovelBusiness.findById(id);
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
    public void editarCamionetasCarga(CamionetasCargaBean camionetasCarga){
        camionetasCargaBusiness.merge(camionetasCarga);
    }
    public void excluirCamionetasCarga(Integer id){
        camionetasCargaBusiness.remove(id);
    }
    public void pesquisarCamionetasCargaId(Integer id){
        camionetasCargaBusiness.findById(id);
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
    public void editarCamionetasPassageiros(CamionetasPassageirosBean camionetasPassageiros){
        camionetasPassageirosBusiness.merge(camionetasPassageiros);
    }
    public void excluirCamionetasPassageiros(Integer id){
        camionetasPassageirosBusiness.remove(id);
    }
    public void pesquisarCamionetasPassageirosId(Integer id){
        camionetasPassageirosBusiness.findById(id);
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
    public void editarEndereco(EnderecoBean endereco) {
       enderecoBusiness.merge(endereco);
    }
    public  void excluirEndereco (Integer id) {
        enderecoBusiness.remove(id);
    }
    public void pesquisarEnderecoId(Integer id) {
        enderecoBusiness.findById(id);
    }
    public ArrayList<EnderecoBean> pesquisarEnderecoAll() {
        return enderecoBusiness.findAll();
    }
    public void cadastrarFormasPagamentos(FormasPagamentosBean formasPagamentos){
        formasPagamentosBusiness.persit(formasPagamentos);
    }
    public void editarFormasPagamentos(FormasPagamentosBean formasPagamentos){
        formasPagamentosBusiness.merge(formasPagamentos);
    }
    public void excluirFormasPagamentos(Integer id){
        formasPagamentosBusiness.remove(id);
    }
    public void pesquisarFormasPagamentosId(Integer id){
        formasPagamentosBusiness.findById(id);
    }
    public ArrayList<FormasPagamentosBean> pesquisarFormasPagamentosAll(){
        return formasPagamentosBusiness.findAll();
    }
    public void cadastrarLocacao(LocacaoBean locacao){
        locacaoBusiness.persit(locacao);
    }
    public void editarLocacao(LocacaoBean locacao){
        locacaoBusiness.merge(locacao);
    }
    public void excluirLocacao(Integer id){
        locacaoBusiness.remove(id);
    }
    public void pesquisarLocacaoId(Integer id){
        locacaoBusiness.findById(id);
    }
    public ArrayList<LocacaoBean> pesquisarLocacaoAll(){
        return locacaoBusiness.findAll();
    }
    public void cadastrarMotorista(MotoristaBean motorista){
        motoristaBusiness.persit(motorista);
    }
    public void editarMotorista(MotoristaBean motorista){
        motoristaBusiness.merge(motorista);
    }
    public void excluirMotorista(Integer id){
        motoristaBusiness.remove(id);
    }
    public void pesquisarMotoristaId(Integer id){
        motoristaBusiness.findById(id);
    }
    public ArrayList<MotoristaBean> pesquisarMotoristaAll(){
        return motoristaBusiness.findAll();
    }
    public void cadastrarPessoaFisica(PessoaFisicaBean pessoaFisica){
        pessoaFisicaBusiness.persit(pessoaFisica);
    }
    public void editarPessoaFisica(PessoaFisicaBean pessoaFisica){
        pessoaFisicaBusiness.merge(pessoaFisica);
    }
    public void excluirPessoaFisica(Integer id){
        pessoaFisicaBusiness.remove(id);
    }
    public void pesquisarPessoaFisicaId(Integer id){
        pessoaFisicaBusiness.findById(id);
    }
    public ArrayList<PessoaFisicaBean> pesquisarPessoaFisicaAll(){
        return pessoaFisicaBusiness.findAll();
    }
     public void cadastrarPessoaJuridica(PessoaJuridicaBean pessoaJuridica){
        pessoaJuridicaBusiness.persit(pessoaJuridica);
    }
    public void editarPessoaJuridica(PessoaJuridicaBean pessoaJuridica){
        pessoaJuridicaBusiness.merge(pessoaJuridica);
    }
    public void excluirPessoaJuridica(Integer id){
        pessoaJuridicaBusiness.remove(id);
    }
    public void pesquisarPessoaJuridicaId(Integer id){
        pessoaJuridicaBusiness.findById(id);
    }
    public ArrayList<PessoaJuridicaBean> pesquisarPessoaJuridicaAll(){
        return pessoaJuridicaBusiness.findAll();
    }
    public void cadastrarReserva(ReservaBean reserva){
        reservaBusiness.persit(reserva);
    }
    public void editarReserva(ReservaBean reserva){
        reservaBusiness.merge(reserva);
    }
    public void excluirReserva(Integer id){
        reservaBusiness.remove(id);
    }
    public void pesquisarReservaId(Integer id){
        reservaBusiness.findById(id);
    }
    public ArrayList<ReservaBean> pesquisarReservaAll(){
        return reservaBusiness.findAll();
    }
    public void cadastrarSedeFilial(SedeFilialBean sedeFilial){
        sedeFilialBusiness.persit(sedeFilial);
    }
    public void editarSedeFilial(SedeFilialBean sedeFilial){
        sedeFilialBusiness.merge(sedeFilial);
    }
    public void excluirSedeFilial(Integer id){
        sedeFilialBusiness.remove(id);
    }
    public void pesquisarSedeFilialId(Integer id){
        sedeFilialBusiness.findById(id);
    }
    public ArrayList<SedeFilialBean> pesquisarSedeFilialAll(){
        return sedeFilialBusiness.findAll();
    }    
    public void cadastrarUsuario(UsuarioBean usuario){
        usuarioBusiness.persist(usuario);
    }
    public void editarUsuario(UsuarioBean usuario){
        usuarioBusiness.merge(usuario);
    }
    public void excluirUsuario(Integer id){
        usuarioBusiness.remove(id);
    }
    public void pesquisarUsuarioId(Integer id){
        usuarioBusiness.getById(id);
    }
    public ArrayList<UsuarioBean> pesquisarUsuarioAll(){
        return usuarioBusiness.getAll();
    }
    public ArrayList<UsuarioBean> pesquisarUsuarioNome(String nome){
        return usuarioBusiness.getByName(nome);
    }
    public void cadastrarVeiculo(VeiculoBean veiculo){
        veiculoBusiness.persit(veiculo);
    }
    public void editarVeiculo(VeiculoBean veiculo){
        veiculoBusiness.merge(veiculo);
    }
    public void excluirVeiculo(Integer id){
        veiculoBusiness.remove(id);
    }
    public void pesquisarVeiculoId(Integer id){
        veiculoBusiness.findById(id);
    }
    public ArrayList<VeiculoBean> pesquisarVeiculoAll(){
        return veiculoBusiness.findAll();
    }
    
    public static UsuarioBean getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(UsuarioBean usuarioLogado) {
        Fachada.usuarioLogado = usuarioLogado;
    }
}
