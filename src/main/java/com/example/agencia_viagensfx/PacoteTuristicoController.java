package com.example.agencia_viagensfx;

import dao.PacoteTuristicoDao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.PacoteTuristico;

public class PacoteTuristicoController {

    @FXML
    private TextField nomeField;

    @FXML
    private TextField precoField;

    @FXML
    private TextField descricaoField;

    @FXML
    private Button cadastrarButton;

    @FXML
    private void initialize() {
        cadastrarButton.setOnAction(event -> cadastrarPacote());
    }

    private void cadastrarPacote() {
        try {
            String nome = nomeField.getText();
            Double preco = Double.parseDouble(precoField.getText());
            String descricao = descricaoField.getText();

            PacoteTuristico pacoteTuristico = new PacoteTuristico(0, nome, preco, descricao);
            PacoteTuristicoDao pacoteTuristicoDao = new PacoteTuristicoDao();
            pacoteTuristicoDao.inserir(pacoteTuristico);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sucesso");
            alert.setHeaderText(null);
            alert.setContentText("Cadastro realizado com sucesso!");
            alert.showAndWait();

        } catch (NumberFormatException e) {
            showError("Formato de preço inválido.");
        } catch (Exception ex) {
            showError("Erro ao cadastrar pacote: " + ex.getMessage());
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
