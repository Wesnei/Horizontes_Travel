package com.example.agencia_viagensfx;

import dao.ReservaDao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Reserva;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservaController {

    @FXML
    private TextField dataReservaField;

    @FXML
    private TextField clienteIdField;

    @FXML
    private TextField pacoteIdField;

    @FXML
    private Button confirmarButton;

    @FXML
    private Button cancelarButton;

    @FXML
    public void initialize() {
        confirmarButton.setOnAction(e -> confirmarReserva());
        cancelarButton.setOnAction(e -> fecharJanela());
    }

    private void confirmarReserva() {
        try {
            String dataTexto = dataReservaField.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataReserva = sdf.parse(dataTexto);
            java.sql.Date dataSql = new java.sql.Date(dataReserva.getTime());

            int clienteId = Integer.parseInt(clienteIdField.getText());
            int pacoteId = Integer.parseInt(pacoteIdField.getText());

            Reserva reserva = new Reserva(1, dataSql, "Confirmada", clienteId, pacoteId);

            ReservaDao reservaDao = new ReservaDao();
            boolean sucesso = reservaDao.inserir(reserva);

            if (sucesso) {
                mostrarAlerta("Sucesso", "Reserva confirmada!", Alert.AlertType.INFORMATION);
            } else {
                mostrarAlerta("Erro", "Erro ao inserir reserva. Verifique os dados e tente novamente.", Alert.AlertType.ERROR);
            }

        } catch (NumberFormatException ex) {
            mostrarAlerta("Erro", "Os IDs devem ser números inteiros.", Alert.AlertType.ERROR);
        } catch (Exception ex) {
            mostrarAlerta("Erro", "Erro ao criar reserva: " + ex.getMessage(), Alert.AlertType.ERROR);
        }
    }

    private void mostrarAlerta(String titulo, String mensagem, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private void fecharJanela() {
        Stage stage = (Stage) cancelarButton.getScene().getWindow();
        stage.close();
    }
}
