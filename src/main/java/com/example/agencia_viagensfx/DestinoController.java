package com.example.agencia_viagensfx;

import dao.DestinoDao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.Destino;

public class DestinoController {

    @FXML
    private TextField nomeField;

    @FXML
    private TextField descricaoField;

    @FXML
    private TextField pacoteIdField;

    @FXML
    private Button cadastrarButton;

    @FXML
    private void initialize() {
        cadastrarButton.setOnAction(event -> cadastrarDestino());
    }

    private void cadastrarDestino() {
        try {
            String nome = nomeField.getText();
            String descricao = descricaoField.getText();
            int pacoteId = Integer.parseInt(pacoteIdField.getText());

            Destino destino = new Destino(0, nome, descricao, pacoteId);
            DestinoDao destinoDao = new DestinoDao();
            boolean sucesso = destinoDao.inserir(destino);

            if (sucesso) {
                mostrarAlerta(Alert.AlertType.INFORMATION, "Sucesso", "Cadastro realizado com sucesso!");
            } else {
                mostrarAlerta(Alert.AlertType.ERROR, "Erro de Cadastro", "Pacote ID inválido. Verifique o ID e tente novamente.");
            }
        } catch (NumberFormatException e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro", "O ID do pacote deve ser um número inteiro.");
        } catch (Exception e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro", "Erro ao cadastrar destino: " + e.getMessage());
        }
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensagem) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
}
