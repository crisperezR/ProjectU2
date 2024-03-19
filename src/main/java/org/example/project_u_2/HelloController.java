package org.example.project_u_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HelloController {

    private final HomePane home = new HomePane();
    private LendingPane lending = new LendingPane();
    private ReturnsPane returns = new ReturnsPane();
    private UsersPane users = new UsersPane();
    private BooksPane books = new BooksPane();
    private UpUsersPane upUsers = new UpUsersPane();
    private UpUsersPane modifyUsers = new UpUsersPane();
    private UpBooksPane upBooks = new UpBooksPane();
    private UpBooksPane modifyBooks = new UpBooksPane();



    private Stage stage;
    @FXML private Label date;
    @FXML public BorderPane pane;

    @FXML
    public void initialize(){
        definePanes();
        LocalDate dateA = LocalDate.now();
        String month = dateA.format(DateTimeFormatter.ofPattern("MMMM", new Locale("es")));
        date.setText("Hoy es " + dateA.getDayOfMonth() + " de " + month + " de " + dateA.getYear());
        pane.setCenter(home);
    }

    @FXML
    private void handleHome(ActionEvent e){
        pane.setCenter(home);
    }
    @FXML
    private void handleLending(ActionEvent e){pane.setCenter(lending);}
    @FXML
    private void handleReturns(ActionEvent e){pane.setCenter(returns);}
    @FXML
    private void handleUsers(ActionEvent e){pane.setCenter(users);}
    @FXML
    private void handleBooks(ActionEvent e){pane.setCenter(books);}


    @FXML
    private void handleClose(MouseEvent event){
        stage.close();
    }
    public void setStage(Stage stage){
        this.stage=stage;
    }

    private void definePanes(){
        users.setAddAction(event -> {pane.setCenter(upUsers);});
        users.setModifyAction(event -> {pane.setCenter(modifyUsers);});
        users.setEliminateAction(event -> {users.eliminateSelected();});

        books.setAddAction(event -> {pane.setCenter(upBooks);});
        books.setModifyAction(event -> {pane.setCenter(modifyBooks);});
        books.setEliminateAction(event -> {books.eliminateSelected();});

        upUsers.setOnAction(event -> {
            User user = new User(upUsers.getFieldIdText(), upUsers.getFieldNameText(), upUsers.getFieldLnamePText(), upUsers.getFieldLnameMText(), upUsers.getFieldAddressText(), upUsers.getFieldPhoneText());
            users.addTable(user);
            upUsers.clearAll();
            pane.setCenter(users);
        });
        upBooks.setOnAction(event -> {
            Book book = new Book(upBooks.getFieldIdText(), upBooks.getFieldTitleText(),upBooks.getFieldAuthorText(), upBooks.getFieldDateText(), upBooks.getFieldStockText(), upBooks.getFieldDispText());
            books.addTable(book);
            upBooks.clearAll();
            pane.setCenter(books);
        });

        modifyUsers.setLabelSectionText("Modificar Usuario");
        modifyUsers.setButtonText("Modificar");
        modifyUsers.setOnAction(event -> {pane.setCenter(users);});
        modifyBooks.setLabelSectionText("Modificar Libro");
        modifyBooks.setButtonText("Modificar");
        modifyBooks.setOnAction(event -> {pane.setCenter(books);});

        lending.setOnAction(event -> {
            if(users.doesUserExistWithId(lending.getIdUserText()) && books.doesBookExistWithId(lending.getIdBookText())){
                Lending len = new Lending(lending.getIdUserText(), lending.getIdBookText());
                lending.clearAll();
                System.out.println("Creado correctamente");
            }
        });
        returns.setOnAction(event -> {});
    }
}