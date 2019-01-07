/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author willi
 */
public class LoginController implements Initializable {

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField senhaField;

    @FXML
    private Button loginButton;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginButton.setOnMouseClicked((event) -> {
            System.out.println("ENTROU NO SISTEMA");
        });
    }    
    
}
