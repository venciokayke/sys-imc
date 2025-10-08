package org.sysimc.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.sysimc.model.Pessoa;

import java.text.DecimalFormat;

public class MainController {
    @FXML
    protected TextField txtNome;
    @FXML
    protected TextField txtAltura;
    @FXML
    protected TextField txtPeso;
    @FXML
    protected Label lblIMC;
    @FXML
    protected Label lblClassificacao;


    Pessoa pessoa = new Pessoa();

    @FXML
    protected void onCalcularImcClick() {
        DecimalFormat df = new DecimalFormat();
        String altura = this.txtAltura.getText();
        altura = altura.replace(",", ".");

        this.pessoa.setNome(this.txtNome.getText());
        this.pessoa.setAltura(Float.parseFloat(altura));
        this.pessoa.setPeso(Float.parseFloat(this.txtPeso.getText()));

        df.applyPattern("#0.00");
        this.lblIMC.setText(df.format(this.pessoa.calcularIMC()));


        this.lblClassificacao.setText(this.pessoa.classificacaoIMC());

        System.out.println(this.txtNome.getText());
        System.out.println(this.txtAltura.getText());
        System.out.println(this.txtPeso.getText());
    }

    @FXML
    protected void onSalvarClick() {


    }

    @FXML
    protected void onCarregarDadosClick() {

    }
}