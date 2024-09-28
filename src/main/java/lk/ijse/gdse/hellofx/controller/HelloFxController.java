package lk.ijse.gdse.hellofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HelloFxController {

    public TextField txtTextField;

    public TextField txtTextField1;
    public PasswordField passwordFiled;
    public AnchorPane ancPane2;
    public Label lblLable;
    @FXML
    private Button btnButton;

    @FXML
    void btnSampleOnAction(ActionEvent event) throws IOException {
        String inputText = txtTextField.getText();
        String passwordText = passwordFiled.getText();

        if(inputText.equals("iresh") && passwordText.equals("678@123")){
            ancPane2.getChildren().clear();
            AnchorPane load = FXMLLoader.load(getClass().getResource("/view/PageOne.fxml"));
            ancPane2.getChildren().add(load);

        }else{

            lblLable.setText("Invalid username and password");
        }


    }

    public void txtTextFieldOnAction(ActionEvent actionEvent) {

    }
}
