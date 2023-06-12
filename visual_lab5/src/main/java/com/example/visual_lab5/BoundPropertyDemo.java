package com.example.visual_lab5;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BoundPropertyDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BoundPropertyDemo.class.getResource("BoundProperty.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 150);
        primaryStage.setTitle("aa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
