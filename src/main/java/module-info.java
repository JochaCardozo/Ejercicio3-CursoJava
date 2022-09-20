module com.example.ejercicio3java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicio3java to javafx.fxml;
    exports com.example.ejercicio3java;
}