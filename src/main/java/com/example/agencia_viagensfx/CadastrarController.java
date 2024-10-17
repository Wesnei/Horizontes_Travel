package com.example.agencia_viagensfx;

import dao.ClienteDao;
import dao.PessoaDao;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.Cliente;
import models.Pessoa;

public class CadastrarController {

    @FXML
    private TextField nomeField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField telefoneField;

    @FXML
    private TextField cpfField;

    @FXML
    private Button cadastrarButton;

    @FXML
    private void initialize() {
        cadastrarButton.setOnAction(event -> cadastrarPessoa());
    }

    private void cadastrarPessoa() {
        try {
            String nome = nomeField.getText();
            String email = emailField.getText();
            String telefone = telefoneField.getText();
            int cpf = Integer.parseInt(cpfField.getText());

            Pessoa pessoa = new Pessoa(0, nome, email, telefone);
            PessoaDao pessoaDao = new PessoaDao();
            pessoaDao.inserir(pessoa);

            Cliente cliente = new Cliente(pessoa.getId(), nome, email, telefone, cpf);
            ClienteDao clienteDao = new ClienteDao();
            clienteDao.inserir(cliente);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cadastro realizado");
            alert.setHeaderText(null);
            alert.setContentText("Cadastro realizado com sucesso!");
            alert.showAndWait();
        } catch (Exception e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro no cadastro");
            alert.setHeaderText(null);
            alert.setContentText("Erro ao cadastrar pessoa: " + e.getMessage());
            alert.showAndWait();
        }
    }
}
