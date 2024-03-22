package org.example.consultarcep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.consultarcep.classes.ConecctionApi;
import com.google.gson.Gson;
import org.example.consultarcep.classes.Endereco;
import org.example.consultarcep.classes.EnderecoApi;
import org.example.consultarcep.exceptions.ExceptionNotFindCep;
import javax.swing.JOptionPane;

public class HelloController {
    @FXML
    private Label textCidade, textLogradouro, textBairro, txtUf;
    @FXML
    private TextField textInputCep;

    @FXML
     public void buscarCep(ActionEvent event){
        try {
            ConecctionApi conecctionApi = new ConecctionApi(String.valueOf(textInputCep.getText()));
            Gson gson = new Gson();
            if (conecctionApi.getStatusCodeConection()== 400) {
                throw new ExceptionNotFindCep("Cep não encontrado");
            }
            EnderecoApi enderecoApi = gson.fromJson(conecctionApi.getJson(), EnderecoApi.class);
            Endereco endereco = new Endereco(enderecoApi);
            atualizarDados(endereco);
        }catch (ExceptionNotFindCep  e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
        }



    }
    public void atualizarDados(Endereco endereco){
        textCidade.setText(endereco.getCidade());
        textLogradouro.setText(endereco.getLogradouro());
        txtUf.setText(endereco.getUf());
        textBairro.setText(endereco.getBairro());
    }






}
