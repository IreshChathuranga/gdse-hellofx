package lk.ijse.gdse.hellofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PageTwoController {
    public Button btnButton;
    public AnchorPane ancPane1;

    public void btnButtonOnAction(ActionEvent actionEvent) throws IOException {
        ancPane1.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/PageOne.fxml"));
        ancPane1.getChildren().add(load);
    }
}
