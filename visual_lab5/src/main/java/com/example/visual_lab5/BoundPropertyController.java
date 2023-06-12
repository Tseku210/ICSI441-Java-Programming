package com.example.visual_lab5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BoundPropertyController {
    @FXML
    private CheckBox chkBackground;

    @FXML
    private Label lblBoundText;

    @FXML
    private TextField tfInputText;

    @FXML
    private VBox background;

    @FXML
    void changeBackground(ActionEvent event) {
        background.setStyle("-fx-background-color: pink");
    }

    @FXML
    void initialize() {
        lblBoundText.setFont(Font.font(24));
        lblBoundText.textProperty().bind(tfInputText.textProperty());
    }
}
