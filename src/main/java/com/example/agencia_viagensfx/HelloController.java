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
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/agencia_viagensfx/cadastroPessoa.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    protected void switchPacoteTuristico(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/com/example/agencia_viagensfx/PacoteTuristico.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    protected void switchDestino(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/agencia_viagensfx/Destino.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setScene(scene);
        newStage.show();
    }
}


