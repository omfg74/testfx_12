package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import sample.Objects.Person;
import sample.interfaces.impls.CollectionAddressBook;

import javafx.scene.control.TableView;
import java.io.IOException;

public class MainController {

    CollectionAddressBook collectionAddressBook = new CollectionAddressBook();
    @FXML
    private Button changeButton;
    @FXML
    private Button addButton;
    @FXML
    private Button delButton;
    @FXML
    private Button searchButton;
    @FXML
    private TextField inputTextView;
    @FXML
    public TableView addrTableView;
    @FXML
    private TableColumn<Person, String> collumnFio;
    @FXML
    private TableColumn<Person,String> collumnPhone;
    @FXML
    private Label label;

    @FXML
    private void initialize(){
        collumnFio.setCellValueFactory(new PropertyValueFactory<Person,String>("fio"));
        collumnPhone.setCellValueFactory(new PropertyValueFactory<Person, String>("phone"));

        collectionAddressBook.fillTestData();
        addrTableView.setItems(collectionAddressBook.getPersonList());
        updateCountLabel();

    }
private void updateCountLabel(){
        label.setText("Количество записей: " + collectionAddressBook.getPersonList().size());
}




    public void showDialog(ActionEvent actionEvent){
        try{
//            addButton.setText("clicked");
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/edit.fxml"));
            stage.setMinWidth(300);
            stage.setMinHeight(150);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();

        }catch (IOException e){e.printStackTrace();}

    }

   }
