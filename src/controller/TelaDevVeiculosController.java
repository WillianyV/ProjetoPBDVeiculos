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
public class TelaDevVeiculosController implements Initializable {

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
    private AnchorPane telaDevolucaoLocacaoPane;

    @FXML
    private ImageView voltar;

    @FXML
    private ImageView ir3;

    @FXML
    private ImageView atualizar3;

    @FXML
    private TextField idReservaField;

    @FXML
    private ComboBox<?> statusReservaComboBox;

    @FXML
    private TextField valorReservaFinalField;

    @FXML
    private Button devolverVeiculoButton;

    @FXML
    private DatePicker dataDevolucao;

    @FXML
    private ComboBox<?> horaDevolucao;

    @FXML
    private TextField taxaHigienizaçãoField;

    @FXML
    private TextField taxaCombustibelField;

    @FXML
    private TextField kmFinalField;

    @FXML
    private TextField pesquisarLocacaoDevolucaoField;

    @FXML
    private DatePicker pesquisarPInicialLocacaoDevolucaoDate;

    @FXML
    private DatePicker pesquisarPfinalLocacaoDevolucaoDate;

    @FXML
    private ImageView pesquisarLocacaoDevolucaoIcon;

    @FXML
    private ComboBox<?> pesquisarStatusLocacaoDevolucaoComboBox;

    @FXML
    private ImageView imprimirLocacaoDevolucaoIcon;

    @FXML
    private TableView<?> locacaoDevolucaoTable;

    @FXML
    void atualizarPane(MouseEvent event) {

    }

    @FXML
    void devolverLocacao(ActionEvent event) {

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
    void imprimirLocacao(MouseEvent event) {

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
    void pesquisarLocacao(MouseEvent event) {

    }

    @FXML
    void sairSistema(MouseEvent event) {

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
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
