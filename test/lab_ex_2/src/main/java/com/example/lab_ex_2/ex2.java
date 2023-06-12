package com.example.lab_ex_2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.nio.charset.CharacterCodingException;

public class ex2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));

        //CENTER
        HBox centerBox = new HBox();

        VBox leftSide = new VBox();
        VBox rightSide = new VBox();


        //LEFT SIDE OF CENTER
        int heightLabel = 26;
        Label l1 = new Label("Category");
        l1.setPrefHeight(heightLabel);
        Label l2 = new Label("Manufacturer");
        l2.setPrefHeight(heightLabel);
        Label l3 = new Label("Model");
        l3.setPrefHeight(heightLabel);
        Label l4 = new Label("Quantity");
        l4.setPrefHeight(heightLabel);
        Label l5 = new Label("Tax class");
        l5.setPrefHeight(heightLabel);
        Label l6 = new Label("Price (net)");
        l6.setPrefHeight(heightLabel);
        Label l7 = new Label("Price (gross)");
        l7.setPrefHeight(heightLabel);
        Label l8 = new Label("Special price");
        l8.setPrefHeight(heightLabel);
        Label l9 = new Label("Weight");
        l9.setPrefHeight(heightLabel);
        Label l10 = new Label("Availability date");
        l10.setPrefHeight(heightLabel);
        CheckBox availableCheck = new CheckBox("Available");
        availableCheck.setSelected(true);
        availableCheck.setPrefHeight(heightLabel);

//        leftSide.setPadding(new Insets(0, 100, 0, 0));
        leftSide.setPrefWidth(200);
        leftSide.setSpacing(10);
        leftSide.getChildren().addAll(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);

        // RIGHT SIDE OF CENTER
        ChoiceBox<String> cb1 = getChoiceBox("  Matrox Cards", 200);
        ChoiceBox<String> cb2 = getChoiceBox("Matrox", 200);
        TextField txt1 = getText("MG400-32MB", 120);
        TextField txt2 = getText("32", 100);
        ChoiceBox<String> cb3 = getChoiceBox("Taxable Goods (7%)", 120);

        // price box (net)
        HBox priceBoxNet = new HBox();
        priceBoxNet.setSpacing(10);
        TextField txt3 = getText("499.99", 100);
        Label USDLabel1 = new Label("USD $");
        priceBoxNet.getChildren().addAll(txt3, USDLabel1);

        // price box (gross)
        HBox priceBoxGross = new HBox();
        priceBoxGross.setSpacing(10);
        TextField txt4 = getText("534.9893", 100);
        Label USDLabel2 = new Label("USD $");
        priceBoxGross.getChildren().addAll(txt4, USDLabel2);

        // price box (special)
        HBox priceBoxSpecial = new HBox();
        priceBoxSpecial.setSpacing(10);
        TextField txt5 = getText("0", 100);
        Label USDLabel3 = new Label("USD $");
        priceBoxSpecial.getChildren().addAll(txt5, USDLabel3);

        TextField txt6 = getText("23", 100);
        ChoiceBox<String> cb4 = getChoiceBox("2007-01-01", 100);



        rightSide.setSpacing(10);
        rightSide.getChildren().addAll(cb1, cb2, txt1, txt2, cb3, priceBoxNet, priceBoxGross, priceBoxSpecial, txt6, cb4);

        // Bottom
        HBox bottomBox = new HBox();
        Button btnContinue = new Button("Continue");
        btnContinue.setPrefWidth(100);
        Button btnCancel = new Button("Cancel");
        btnCancel.setPrefWidth(100);

        bottomBox.setSpacing(10);
        bottomBox.getChildren().addAll(btnContinue, btnCancel);

        centerBox.getChildren().addAll(leftSide, rightSide);

        root.setCenter(centerBox);
        root.setBottom(bottomBox);
        BorderPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 450, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Matrox G400 32MB");
        primaryStage.show();
    }

    ChoiceBox<String> getChoiceBox(String value, int width) {
        ChoiceBox<String> cb = new ChoiceBox<String>(FXCollections.observableArrayList(value, "Second", "Third"));
        cb.setPrefWidth(width);

        return cb;
    }

    TextField getText(String txt, int width) {
        TextField text = new TextField(txt);
        text.setMaxWidth(width);

        return text;
    }
}
