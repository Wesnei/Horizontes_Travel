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
        Parent root = FXMLLoader.load(getClass().getResource("cadastroPessoa.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setTitle("Horizontes Travel");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    protected void switchToPacote(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("PacoteTuristico.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setTitle("Horizontes Travel");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    protected void switchToDestino(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Destino.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setTitle("Horizontes Travel");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    protected void switchToReserva(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Reserva.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setTitle("Horizontes Travel");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
    protected void switchToDados(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Dados.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setTitle("Horizontes Travel");
        newStage.setScene(scene);
        newStage.show();
    }

}
