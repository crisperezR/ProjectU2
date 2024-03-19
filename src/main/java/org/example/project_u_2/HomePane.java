package org.example.project_u_2;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomePane extends AnchorPane {

    public HomePane(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home-pane.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

}
