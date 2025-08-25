package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Aluno;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CadAlunoController {

    @FXML
    private TextField txCPF;

    @FXML
    private TextField txEmail;

    @FXML
    private TextField txNome;

    @FXML
    private void salvarAluno() {
        Aluno novoAluno = new Aluno(txCPF.getText(),
                    txEmail.getText(),
                    txNome.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Aluno:"+novoAluno.getCPF()).showAndWait();
        Biblioteca.listaAlunos.add(novoAluno);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txCPF.setText("");
        txEmail.setText("");
        txNome.setText("");
    }


}
