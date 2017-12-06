package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(600);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        Button add = new Button();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
