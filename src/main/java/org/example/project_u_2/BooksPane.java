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

public class BooksPane extends AnchorPane {
    @FXML
    private TableView<Book> table;
    @FXML private TableColumn<Book, String> idCol;
    @FXML private TableColumn<Book, String> titleCol;
    @FXML private TableColumn<Book, String> authorCol;
    @FXML private TableColumn<Book, String> dateCol;
    @FXML private TableColumn<Book, String> stockCol;
    @FXML private TableColumn<Book, String> dispCol;

    @FXML private Button add;
    @FXML private Button modify;
    @FXML private Button eliminate;

    public BooksPane() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("books-pane.fxml"));
            loader.setRoot(this);
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException();
        }

        idCol.setCellValueFactory(new PropertyValueFactory<Book, String>("bId"));
        titleCol.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));
        authorCol.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
        dateCol.setCellValueFactory(new PropertyValueFactory<Book, String>("dateP"));
        stockCol.setCellValueFactory(new PropertyValueFactory<Book, String>("stock"));
        dispCol.setCellValueFactory(new PropertyValueFactory<Book, String>("disp"));
    }

    public void addAllTable(List<Book> bookList){
        table.getItems().addAll(bookList);
    }
    public void addTable(Book book){
        table.getItems().add(book);
    }
    public void eliminateSelected(){
        int index = table.getSelectionModel().getSelectedIndex();
        table.getItems().remove(index);
    }
    public Book getTable(int index){
        return table.getItems().get(index);
    }
    public int getIndex(){
        return table.getSelectionModel().getSelectedIndex();
    }

    public void setAddAction(EventHandler<ActionEvent> handler){this.add.setOnAction(handler);}
    public EventHandler<ActionEvent> getAddAction(){return this.add.getOnAction();}

    public void setModifyAction(EventHandler<ActionEvent> handler){this.modify.setOnAction(handler);}
    public EventHandler<ActionEvent> getModifyAction(){return this.modify.getOnAction();}

    public void setEliminateAction(EventHandler<ActionEvent> handler){this.eliminate.setOnAction(handler);}
    public EventHandler<ActionEvent> getEliminateAction(){return this.eliminate.getOnAction();}
}
