module com.ijse.gdse.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.gdse.hellofx.controller to javafx.fxml;
    exports lk.ijse.gdse.hellofx;
}