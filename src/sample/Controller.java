package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private TextField Usertxt;
    @FXML
    private PasswordField Passtxt;
    @FXML
    private Label message;


    public void login(ActionEvent event) throws IOException {

        if (Usertxt.getText().equals("user") && Passtxt.getText().equals("pass")) {
            Stage primaryStage = new Stage();
            message.setText("Successful Connexion");
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            primaryStage.setTitle("Hello");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            ((Node) event.getSource()).getScene().getWindow().hide();
            primaryStage.show();


        } else {
            message.setText("Connexion Failed");

        }
    }

    public  void logout(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
        ((Node) event.getSource()).getScene().getWindow().hide();

    }


}


