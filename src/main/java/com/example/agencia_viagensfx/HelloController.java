package com.example.agencia_viagensfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;


import java.io.IOException;


public class HelloController {

    @FXML
    protected void switchToCadastroPessoa(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("cadastroPessoa.fxml"));  // Carregue a página de Cadastro Pessoa
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setScene(scene);
        newStage.show();
    }
}