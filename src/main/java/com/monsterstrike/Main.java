package com.monsterstrike;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fl=new FXMLLoader(Main.class.getResource("Input_Name.fxml"));
        Scene scene = new Scene(fl.load());
        stage.setTitle("Monster Strike");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("Images/logo.png")));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}