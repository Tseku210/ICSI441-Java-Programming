package com.example.visual_lab5;

import javafx.application.Application;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.spi.InetAddressResolver;

public class SumApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        HBox num1 = new HBox();
        Label l1 = new Label("num1:");
        TextField t1 = new TextField("0");
        num1.getChildren().addAll(l1, t1);
        HBox num2 = new HBox();
        Label l2 = new Label("num2:");
        TextField t2 = new TextField("0");
        num2.getChildren().addAll(l2, t2);
        HBox sum = new HBox();
        Label l3 = new Label("sum:");
        TextField t3 = new TextField("0");
        sum.getChildren().addAll(l3, t3);

        t1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                if (newValue.matches("\\d+")) {
                    System.out.println(oldValue + ", " + newValue);
//                    t1.setText(oldValue + newValue);
                }
            }
        });

        IntegerBinding sumBinding = Bindings.createIntegerBinding(() -> {
            int n1 = 0;
            int n2 = 0;
            if (!t1.getText().isEmpty()) {
                n1 = Integer.parseInt(t1.getText());
            }
            if (!t2.getText().isEmpty()) {
                n2 = Integer.parseInt(t2.getText());
            }
            return n1 + n2;
        }, t1.textProperty(), t2.textProperty());

        IntegerProperty n = new SimpleIntegerProperty(Integer.parseInt(t1.getText()));
        IntegerProperty n2 = new SimpleIntegerProperty(Integer.parseInt(t2.getText()));

        NumberBinding s = n.add(n2);
        t3.setText(s.getValue().toString());
        // Bind the text property of t3 to the sumBinding
        //t3.textProperty().bind(sumBinding.asString());

        root.getChildren().addAll(num1, num2, sum);
        Scene scene = new Scene(root,200, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ahah");
        primaryStage.show();
    }
}
