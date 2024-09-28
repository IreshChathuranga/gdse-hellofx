package lk.ijse.gdse.hellofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PageOneController {
    public AnchorPane ancpane;
    public Label lblLable;
    public Button btnButton;

    public void btnButtonOnAction(ActionEvent actionEvent) throws IOException {
        ancpane.getChildren().clear();
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/PageTwo.fxml"));
        ancpane.getChildren().add(load);

    }
}
