package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javax.swing.*;
import javax.swing.text.TableView;
import java.io.IOException;

public class MainController {

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
    private TableView tableView;
    @FXML
    private TableColumn fioColumn;
    @FXML
    private TableColumn telColumn;
    @FXML
    private Label label;



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
