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
<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/agencia_viagensfx/cadastroPessoa.fxml"));
=======
        Parent root = FXMLLoader.load(getClass().getResource("cadastroPessoa.fxml"));
>>>>>>> 9ce5dcab174bd82f4e087befa83b3575481f9ec9
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setTitle("Horizontes Travel");
        newStage.setScene(scene);
        newStage.show();
    }

    @FXML
<<<<<<< HEAD
    protected void switchPacoteTuristico(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/com/example/agencia_viagensfx/PacoteTuristico.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
=======
    protected void switchToPacote(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PacoteTuristico.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setTitle("Horizontes Travel");
>>>>>>> 9ce5dcab174bd82f4e087befa83b3575481f9ec9
        newStage.setScene(scene);
        newStage.show();
    }

<<<<<<< HEAD
    @FXML
    protected void switchDestino(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/agencia_viagensfx/Destino.fxml"));
        Stage newStage = new Stage();
        Scene scene = new Scene(root);
        newStage.setScene(scene);
        newStage.show();
    }
}


=======

}
>>>>>>> 9ce5dcab174bd82f4e087befa83b3575481f9ec9
