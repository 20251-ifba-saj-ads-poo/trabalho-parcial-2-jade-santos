package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Professor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;


public class CadProfessorController {
    @FXML
    private Label lbISBN;

    @FXML
    private Label lbSubTitulo;

    @FXML
    private Label lbTitulo;

    @FXML
    private TextField txNome;

    @FXML
    void limparTela(ActionEvent event) {
        txNome.setText("");
        txEmail.setText("");
        txCPF.setText("");
    }

    @FXML
    void salvarLivro(ActionEvent event) {

    }

    @FXML
    private TextField txEmail;

    @FXML
    private TextField txCPF;

    @FXML
    private void salvarProfessor() {
        Professor novoProfessor = new Professor(txNome.getText(),
                    txEmail.getText(),
                    txCPF.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Professor:"+novoProfessor.getNome()).showAndWait();
        Biblioteca.listaProfessores.add(novoProfessor);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txCPF.setText("");
        txEmail.setText("");
        txNome.setText("");
    }

}
