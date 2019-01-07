/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author willi
 */
public class Main extends Application {
    private static Stage janela;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));//CARREGA FXML
        Scene scene = new Scene(root);//COLOCA O FXML EM UMA CENA
        stage.setTitle("Login - Veículos Pajeú");
        Image appIcon = new Image(getClass().getResourceAsStream("/imagens/icon.png"));//CARREGA A IMAGEM
        stage.getIcons().add(appIcon);// COLOCA O ICON NA CENA
        //stage.setResizable(false);
        stage.setScene(scene);// COLOCA UMA CENA EM UMA JANELA
        stage.show();// ABRE A JANELA
        setJanela(stage);//COLOCA A "JANELA" NA JANELA PRINCIPAL.
    }
    public static Stage getJanela() {
        return janela;
    }

    public static void setJanela(Stage janela) {
        Main.janela = janela;
    }
    
    
}
