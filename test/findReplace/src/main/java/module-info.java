module com.example.findreplace {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.findreplace to javafx.fxml;
    exports com.example.findreplace;
}