package base.exemplos.fxml.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastro {
    
    @FXML
    private TextField campoPlaca;

    @FXML
    private TextField campoModelo;

    @FXML
    private TextField campoCor;

    @FXML
    private TextField campoFabricante;

    @FXML
    private TextField campoAnoDeFabricacao;

    @FXML
    private void cadastrar(ActionEvent event) {
        String placa = campoPlaca.getText();
        String modelo = campoModelo.getText();
        String cor = campoCor.getText();
        String fabricante = campoFabricante.getText();
        int anoDeFabricacao = Integer.valueOf(campoAnoDeFabricacao.getText());


    }
}
