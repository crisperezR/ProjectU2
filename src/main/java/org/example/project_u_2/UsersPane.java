package org.example.project_u_2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.List;

public class UsersPane extends AnchorPane {
    @FXML
    private TableView<User> table;
    @FXML private TableColumn<User, String> idCol;
    @FXML private TableColumn<User, String> nameCol;
    @FXML private TableColumn<User, String> lName1Col;
    @FXML private TableColumn<User, String> lName2Col;
    @FXML private TableColumn<User, String> addressCol;
    @FXML private TableColumn<User, String> phoneCol;

    @FXML private Button add;
    @FXML private Button modify;
    @FXML private Button eliminate;
    public UsersPane(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("users-pane.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        }catch (IOException e){
            throw new RuntimeException();
        }

        idCol.setCellValueFactory(new PropertyValueFactory<User, String>("uId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        lName1Col.setCellValueFactory(new PropertyValueFactory<User, String>("lNameP"));
        lName2Col.setCellValueFactory(new PropertyValueFactory<User, String>("lNameM"));
        addressCol.setCellValueFactory(new PropertyValueFactory<User, String>("address"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<User, String>("phone"));
    }

    public void addAllTable(List<User> userList){
        table.getItems().addAll(userList);
    }
    public void addTable(User user){
        table.getItems().add(user);
    }

    public void eliminateSelected(){
        int index = table.getSelectionModel().getSelectedIndex();
        table.getItems().remove(index);
    }

    public void setAddAction(EventHandler<ActionEvent> handler){this.add.setOnAction(handler);}
    public EventHandler<ActionEvent> getAddAction(){return this.add.getOnAction();}

    public void setModifyAction(EventHandler<ActionEvent> handler){this.modify.setOnAction(handler);}
    public EventHandler<ActionEvent> getModifyAction(){return this.modify.getOnAction();}

    public void setEliminateAction(EventHandler<ActionEvent> handler){this.eliminate.setOnAction(handler);}
    public EventHandler<ActionEvent> getEliminateAction(){return this.eliminate.getOnAction();}
}
