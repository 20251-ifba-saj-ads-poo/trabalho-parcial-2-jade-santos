package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Professor;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

public class ListaProfessorController {

    @FXML
    private ListView<Professor> txListaProfessor;

    @FXML 
    private void initialize() {
        txListaProfessor.setCellFactory(lv -> new ListCell<Professor>() {
            @Override
            public void updateItem(Professor row, boolean empty) {
                super.updateItem(row, empty) ;
                setText(empty ? null : row.getNome());
            }
                
                Professor professor = txListaProfessor.getSelectionModel().getSelectedItem();
            });
        carregarListaAlunos();
    }
    
    private void carregarListaAlunos() {txListaProfessor.setItems(Biblioteca.listaProfessores);}


}