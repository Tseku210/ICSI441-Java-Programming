module com.example.lab_ex_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_ex_2 to javafx.fxml;
    exports com.example.lab_ex_2;
}