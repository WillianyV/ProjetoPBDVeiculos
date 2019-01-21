/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


/**
 * FXML Controller class
 *
 * @author willi
 */
public class TelaCadLocarController implements Initializable {

       @FXML
    private AnchorPane principalPane;

    @FXML
    private AnchorPane menuPane;

    @FXML
    private ImageView veiculoPJIcon;

    @FXML
    private Button reservarButton;

    @FXML
    private Button locarButton;

    @FXML
    private Button clienteButton;

    @FXML
    private Button motoristasButton;

    @FXML
    private Button veiculosButton;

    @FXML
    private Button categoriasButton;

    @FXML
    private Button relatoriosButton;

    @FXML
    private Button fincanceiroButton;

    @FXML
    private Button devolucaoButton;

    @FXML
    private AnchorPane menuLateralPane;

    @FXML
    private ImageView menuVisualizar;

    @FXML
    private ImageView backup;

    @FXML
    private ImageView restore;

    @FXML
    private ImageView log;

    @FXML
    private ImageView configuracao;

    @FXML
    private ImageView informacao;

    @FXML
    private ImageView sair;

    @FXML
    private ImageView logout;

    @FXML
    private AnchorPane telaCadastrarLocacaoPane;

    @FXML
    private ImageView voltar;

    @FXML
    private ImageView ir;

    @FXML
    private ImageView atualizar;

    @FXML
    private TextField idLocacaoField;

    @FXML
    private ComboBox<?> statusLocacaoComboBox;

    @FXML
    private Button salvarLocacaoButton;

    @FXML
    private TextField idLocacaoReservaField;

    @FXML
    private ComboBox<?> tipoLocacaoComboBox;

    @FXML
    private TextField veiculoLocacaoField;

    @FXML
    private TextField clientePesquisaLocacaoField;

    @FXML
    private ImageView addClienteLocacaoIcon;

    @FXML
    private DatePicker dataLocacaoRetiradaDate;

    @FXML
    private ComboBox<?> horaLocacaoRetiradaComboBox;

    @FXML
    private DatePicker dataLocacaoDevolucaoDate;

    @FXML
    private ComboBox<?> horaLocacaoDevolucaoComboBox;

    @FXML
    private CheckBox delvoverFilialLocacaoCheckBox;

    @FXML
    private Button novoLocacaoButton;

    @FXML
    private TextField valorInicialLocacaoField;

    @FXML
    private TextField kiInicialLocacaoField;

    @FXML
    private TextField pesquisarLocacaoField;

    @FXML
    private DatePicker pesquisarPInicialLocacaoDate;

    @FXML
    private DatePicker pesquisarPfinalLocacaoDate;

    @FXML
    private ImageView pesquisarLocacaoIcon;

    @FXML
    private ComboBox<?> pesquisarStatusLocacaoComboBox;

    @FXML
    private ImageView imprimirLocacaoIcon;

    @FXML
    private TableView<?> locacaoTable;

    @FXML
    void atualizarPane(MouseEvent event) {

    }

    @FXML
    void fazerBackup(MouseEvent event) {

    }

    @FXML
    void fazerConfiguracoes(MouseEvent event) {

    }

    @FXML
    void fazerLogout(MouseEvent event) {

    }

    @FXML
    void fazerRestore(MouseEvent event) {

    }

    @FXML
    void imprimirLocacoes(MouseEvent event) {

    }

    @FXML
    void informacaoSistema(MouseEvent event) {

    }

    @FXML
    void irPane(MouseEvent event) {

    }

    @FXML
    void irParaHome(MouseEvent event) {

    }

    @FXML
    void irTelaCatgorias(ActionEvent event) {

    }

    @FXML
    void irTelaCliente(ActionEvent event) {

    }

    @FXML
    void irTelaDevolucao(ActionEvent event) {

    }

    @FXML
    void irTelaFinanceiro(ActionEvent event) {

    }

    @FXML
    void irTelaLocar(ActionEvent event) {

    }

    @FXML
    void irTelaMotorista(ActionEvent event) {

    }

    @FXML
    void irTelaReserva(ActionEvent event) {

    }

    @FXML
    void irTelaVeiculos(ActionEvent event) {

    }

    @FXML
    void irTelasRelatorios(ActionEvent event) {

    }

    @FXML
    void menuClick(MouseEvent event) {

    }

    @FXML
    void novoLocacao(ActionEvent event) {

    }

    @FXML
    void pesquisarlocaoIcon(MouseEvent event) {

    }

    @FXML
    void sairSistema(MouseEvent event) {

    }

    @FXML
    void salvarLocacao(ActionEvent event) {

    }

    @FXML
    void visualizarLog(MouseEvent event) {

    }

    @FXML
    void visualizarMenu(MouseEvent event) {

    }

    @FXML
    void voltarPane(MouseEvent event) {

    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
