package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Aluno;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class ListaAlunoController {

    @FXML
    private ListView<Aluno> txListaAluno;

    @FXML 
    private void initialize() {
        txListaAluno.setCellFactory(lv -> new ListCell<Aluno>() {
            @Override
            public void updateItem(Aluno row, boolean empty) {
                super.updateItem(row, empty) ;
                setText(empty ? null : row.getCPF());
            }
                
                Aluno aluno = txListaAluno.getSelectionModel().getSelectedItem();
            });
        carregarListaAlunos();
    }
    
    private void carregarListaAlunos() {txListaAluno.setItems(Biblioteca.listaAlunos);}


}
