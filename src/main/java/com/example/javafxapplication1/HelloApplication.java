package com.example.javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Button btn = new Button("Say 'Hello'!");
        Label  lbl1 = new Label("Input you name:");
        Label  lbl2 = new Label();
        TextField txt = new TextField();

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if("".equals(txt.getText())){
                    lbl2.setText("Hello World!");
                }else {
                    lbl2.setText("Hello " + txt.getText() + " ! ");
                }
            }
        });

        GridPane root = new GridPane();
        root.add(lbl1, 0, 0);
        root.add(txt, 1,0);
        root.add(btn,1,1);
        root.add(lbl2,1, 2);



    //    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
  //      Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}