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


public class UpUsersPane extends AnchorPane {
    @FXML private Label labelSection;
    @FXML private TextField fieldId;
    @FXML private TextField fieldName;
    @FXML private TextField fieldLnameP;
    @FXML private TextField fieldLnameM;
    @FXML private TextField fieldAddress;
    @FXML private TextField fieldPhone;
    @FXML private Button button;

    public UpUsersPane(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("upUsers-pane.fxml"));
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
    public void setFieldNameText(String text){fieldName.setText(text);}
    public String getFieldNameText(){return fieldName.getText();}
    public void setFieldLnamePText(String text){fieldLnameP.setText(text);}
    public String getFieldLnamePText(){return fieldLnameP.getText();}
    public void setFieldLnameMText(String text){fieldLnameM.setText(text);}
    public String getFieldLnameMText(){return fieldLnameM.getText();}
    public void setFieldAddressText(String text){fieldAddress.setText(text);}
    public String getFieldAddressText(){return fieldAddress.getText();}
    public void setFieldPhoneText(String text){fieldPhone.setText(text);}
    public String getFieldPhoneText(){return fieldPhone.getText();}

    public void clearAll(){
        fieldId.clear();
        fieldName.clear();
        fieldLnameP.clear();
        fieldLnameM.clear();
        fieldAddress.clear();
        fieldPhone.clear();
    }

    public void setButtonText(String buttonText){this.button.setText(buttonText);}
    public String getButtonText(){return this.button.getText();}
    public void setOnAction(EventHandler<ActionEvent> handler){this.button.setOnAction(handler);}
    public EventHandler<ActionEvent> getOnAction(){return this.button.getOnAction();}
}
