package org.example.project_u_2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UpBooksPane extends AnchorPane {
    @FXML
    private Label labelSection;
    @FXML private TextField fieldId;
    @FXML private TextField fieldTitle;
    @FXML private TextField fieldAuthor;
    @FXML private TextField fieldDate;
    @FXML private TextField fieldStock;
    @FXML private TextField fieldDisp;
    @FXML private Button button;

    public UpBooksPane(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("upBooks-pane.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    public void setLabelSectionText(String text) {labelSection.setText(text);}

    public void setFieldIdText(String text){fieldId.setText(text);}
    public String getFieldIdText(){return fieldId.getText();}
    public void setFieldTitleText(String text){fieldTitle.setText(text);}
    public String getFieldTitleText(){return fieldTitle.getText();}
    public void setFieldAuthorText(String text){fieldAuthor.setText(text);}
    public String getFieldAuthorText(){return fieldAuthor.getText();}
    public void setFieldDateText(String text){fieldDate.setText(text);}
    public String getFieldDateText(){return fieldDate.getText();}
    public void setFieldStockText(String text){fieldStock.setText(text);}
    public String getFieldStockText(){return fieldStock.getText();}
    public void setFieldDispText(String text){fieldDisp.setText(text);}
    public String getFieldDispText(){return fieldDisp.getText();}

    public void clearAll(){
        fieldId.clear();
        fieldTitle.clear();
        fieldAuthor.clear();
        fieldDate.clear();
        fieldStock.clear();
        fieldDisp.clear();
    }

    public void setButtonText(String buttonText){this.button.setText(buttonText);}
    public String getButtonText(){return this.button.getText();}
    public void setOnAction(EventHandler<ActionEvent> handler){this.button.setOnAction(handler);}
    public EventHandler<ActionEvent> getOnAction(){return this.button.getOnAction();}
}
