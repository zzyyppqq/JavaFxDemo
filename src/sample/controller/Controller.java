package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private Button bt;
    @FXML
    private TextField mytf;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void showDateTime(ActionEvent event){
        System.out.println("click!");

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        String dataFormat = sdf.format(date);
        mytf.setText(dataFormat);

    }
}
