package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Aula;
/*import javafx.event.ActionEvent;*/
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CadAulaController {

    @FXML
    private TextField txHoraAula;

    @FXML
    private TextField txNomeAula;

    @FXML
    private TextField txProfessorAula;

    @FXML
    private void salvarAula() {
        Aula novaAula = new Aula(txNomeAula.getText(),
                    txHoraAula.getText(), 
                    txProfessorAula.getText());
        new Alert(AlertType.INFORMATION, 
        "Cadastrando Aula:"+novaAula.getNome()).showAndWait();
        Biblioteca.listaAulas.add(novaAula);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txHoraAula.setText("");
        txNomeAula.setText("");
        txProfessorAula.setText("");
    }

}
