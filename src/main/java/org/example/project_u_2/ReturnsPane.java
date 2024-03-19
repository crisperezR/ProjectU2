package org.example.project_u_2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ReturnsPane extends AnchorPane {

    @FXML private TextField idUser;
    @FXML private TextField idBook;
    @FXML private Button button;

    public ReturnsPane(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("returns-pane.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    public void setIdUserText(String text){idUser.setText(text);}
    public String getIdUserText(){return idUser.getText();}
    public void setIdBookText(String text){idBook.setText(text);}
    public String getIdBookText(){return idBook.getText();}
    public void setButtonText(String buttonText){this.button.setText(buttonText);}
    public String getButtonText(){return this.button.getText();}
    public void setOnAction(EventHandler<ActionEvent> handler){this.button.setOnAction(handler);}
    public EventHandler<ActionEvent> getOnAction(){return this.button.getOnAction();}
}
