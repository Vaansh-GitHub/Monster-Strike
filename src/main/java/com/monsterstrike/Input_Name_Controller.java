package com.monsterstrike;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Input_Name_Controller{
    @FXML
    private Label error;
    @FXML
    private TextField field;
    @FXML
    private Button button;
    @FXML
    private VBox parentPane;

    private String name="Player";
    private Stage stage;
    @FXML
    public void loadNextPage() throws IOException {
        if(!field.getText().trim().isBlank())
        {
            name=field.getText();
            stage = (Stage) parentPane.getScene().getWindow();
            FXMLLoader fl = new FXMLLoader(Input_Name_Controller.class.getResource("Loading.fxml"));
            Scene scene = new Scene(fl.load());
            stage.setTitle("Monster Strike");
            stage.getIcons().add(new Image(Input_Name_Controller.class.getResourceAsStream("Images/logo.png")));
            stage.setScene(scene);
            stage.setResizable(false);
            Thread.currentThread().setName(name);
        }
        else {
            field.setText("");
            error.setText("No name entered !");
            error.setVisible(true);
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    error.setVisible(false);

                }
            }, 4000);
        }
    }
    @FXML
    public void disableError()
    {
        error.setVisible(false);
    }
}
