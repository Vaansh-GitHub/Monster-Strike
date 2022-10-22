package com.monsterstrike;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Loading_Controller implements Initializable {
    @FXML
    private ImageView logoImage;
    @FXML
    private ProgressIndicator progress;
    @FXML
    private AnchorPane parentPane;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String name =Thread.currentThread().getName();
        new Timer().schedule(new TimerTask() {
                                 @Override
                                 public void run() {
                                     System.out.println(name);
                                     System.exit(0);
                                 }
                             },5000);
    }
}
