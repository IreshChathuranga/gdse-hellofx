package lk.ijse.gdse.hellofx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader.load(getClass().getResource("/view/HelloFx.fxml"));
        Scene scene = new Scene(load);
        stage.setScene(scene);
        stage.setTitle("Sample Application");
        stage.show();
    }
}
