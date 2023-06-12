package com.example.findreplace;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FindReplace extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));

        // LEFT
        root.setLeft(getLeftBox());

        // RIGHT
        root.setRight(getRightBox());

        // CENTER
        root.setCenter(getCenterBox());

        Scene scene = new Scene(root, 550, 230);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Find Replace");
        primaryStage.show();
    }

    Button getButton(String name, int size) {
        Button btn = new Button(name);
        btn.setPrefWidth(size);
        return btn;
    }

    CheckBox getCheckBox(String name, String attr) {
        CheckBox cb = new CheckBox(name);
        if (attr == "selected") {
            cb.setSelected(true);
        } else if (attr == "disabled") {
            cb.setDisable(true);
        }

        return cb;
    }
    CheckBox getCheckBox(String name) {
        CheckBox cb = new CheckBox(name);
        return cb;
    }


    VBox getLeftBox() {
        VBox leftBox = new VBox();

        Label lblFindWhat, lblReplaceWith;
        lblFindWhat = new Label("Find What: ");
        lblReplaceWith = new Label("Replace With: ");

        leftBox.setSpacing(15);
        leftBox.getChildren().addAll(lblFindWhat, lblReplaceWith);

        return leftBox;
    }

    VBox getRightBox() {
        int size = 100;
        VBox rightBox = new VBox();

        Button btn1 = getButton("Find", size);
        Button btn2 = getButton("Replace", size);
        Button btn3 = getButton("Replace All", size);
        Button btn4 = getButton("Close", size);
        Button btn5 = getButton("Help", size);

        rightBox.setSpacing(10);
        rightBox.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

        return rightBox;
    }

    VBox getCenterBox() {
        VBox centerBox = new VBox();
        centerBox.setPadding(new Insets(0, 20, 0, 20));
        centerBox.setSpacing(10);

        TextField txt1 = new TextField();
        TextField txt2 = new TextField();

        HBox hBox = new HBox();
        VBox vBox1 = new VBox();
        VBox vBox2 = new VBox();

        CheckBox cb1 = getCheckBox("Match Case");
        CheckBox cb2 = getCheckBox("Whole Words");
        CheckBox cb3 = getCheckBox("Regular Expressions");
        CheckBox cb4 = getCheckBox("Highlight Results", "selected");
        CheckBox cb5 = getCheckBox("Wrap Around", "selected");
        CheckBox cb6 = getCheckBox("Search Selection", "disabled");
        CheckBox cb7 = getCheckBox("Search Backwards");
        CheckBox cb8 = getCheckBox("Incremental Search", "selected");

        hBox.setSpacing(10);
        vBox1.setSpacing(10);
        vBox2.setSpacing(10);
        vBox1.getChildren().addAll(cb1, cb2, cb3, cb4);
        vBox2.getChildren().addAll(cb5, cb6, cb7, cb8);

        hBox.getChildren().addAll(vBox1, vBox2);
        centerBox.getChildren().addAll(txt1, txt2, hBox);

        return centerBox;
    }
}
