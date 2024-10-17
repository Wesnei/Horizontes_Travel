package com.example.agencia_viagensfx;

import dao.DestinoDao;
import dao.PacoteTuristicoDao;
import dao.PessoaDao;
import dao.ReservaDao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import models.Destino;
import models.PacoteTuristico;
import models.Pessoa;
import models.Reserva;

import java.util.List;

public class DadosController {

    @FXML
    private Button visualizarReservasButton;

    @FXML
    private Button visualizarPessoasButton;

    @FXML
    private Button visualizarPacotesButton;

    @FXML
    private Button visualizarDestinosButton;

    @FXML
    public void initialize() {
        visualizarReservasButton.setOnAction(e -> visualizarReservas());
        visualizarPessoasButton.setOnAction(e -> visualizarPessoas());
        visualizarPacotesButton.setOnAction(e -> visualizarPacotes());
        visualizarDestinosButton.setOnAction(e -> visualizarDestinos());
    }

    private void visualizarReservas() {
        ReservaDao reservaDao = new ReservaDao();
        List<Reserva> reservas = reservaDao.listar();

        StringBuilder info = new StringBuilder();
        for (Reserva reserva : reservas) {
            info.append("ID: ").append(reserva.getId()).append("\n")
                    .append("Data da Reserva: ").append(reserva.getDataReserva()).append("\n")
                    .append("CPF: ").append(reserva.getClienteCpf()).append("\n")
                    .append("Nome do Pacote: ").append(reserva.getPacoteNome()).append("\n")
                    .append("-----------------------------\n");
        }

        mostrarMensagem("Lista de Reservas", info.toString());
    }

    private void visualizarPessoas() {
        PessoaDao pessoaDao = new PessoaDao();
        List<Pessoa> pessoas = pessoaDao.listar();

        StringBuilder info = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            info.append("ID: ").append(pessoa.getId()).append("\n")
                    .append("Nome: ").append(pessoa.getNome()).append("\n")
                    .append("Email: ").append(pessoa.getEmail()).append("\n")
                    .append("Telefone: ").append(pessoa.getTelefone()).append("\n")
                    .append("-----------------------------\n");
        }

        mostrarMensagem("Lista de Pessoas", info.toString());
    }

    private void visualizarPacotes() {
        PacoteTuristicoDao pacoteDao = new PacoteTuristicoDao();
        List<PacoteTuristico> pacotes = pacoteDao.listar();

        StringBuilder info = new StringBuilder();
        for (PacoteTuristico pacote : pacotes) {
            info.append("ID: ").append(pacote.getId()).append("\n")
                    .append("Nome: ").append(pacote.getNome()).append("\n")
                    .append("Preço: ").append(pacote.getPreco()).append("\n")
                    .append("Descrição: ").append(pacote.getDescricao()).append("\n")
                    .append("-----------------------------\n");
        }

        mostrarMensagem("Lista de Pacotes", info.toString());
    }

    private void visualizarDestinos() {
        DestinoDao destinoDao = new DestinoDao();
        List<Destino> destinos = destinoDao.listar();

        StringBuilder info = new StringBuilder();
        for (Destino destino : destinos) {
            info.append("ID: ").append(destino.getId()).append("\n")
                    .append("Nome: ").append(destino.getNome()).append("\n")
                    .append("Descrição: ").append(destino.getDescricao()).append("\n")
                    .append("Nome do Pacote: ").append(destino.getPacoteNome()).append("\n")
                    .append("-----------------------------\n");
        }

        mostrarMensagem("Lista de Destinos", info.toString());
    }

    private void mostrarMensagem(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
