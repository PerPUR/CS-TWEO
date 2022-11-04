module com.example.cstweo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cstweo to javafx.fxml;
    exports com.example.cstweo;
}