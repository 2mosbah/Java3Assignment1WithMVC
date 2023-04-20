/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import view.ViewManager;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class LoginController implements Initializable {

    @FXML
    private ImageView image;
    @FXML
    private TextField txtUserName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button login;
    @FXML
    private Label invalidLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void txtUserNameHandle(ActionEvent event) {
    }

    @FXML
    private void txtPasswordHandle(ActionEvent event) {
    }

    @FXML
    private void loginHandle(ActionEvent event) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("mosbah")
                && txtPassword.getText().equalsIgnoreCase("123456")) {
            ViewManager.closeLoginPage();
            ViewManager.openSystemPage();
        } else {
            invalidLabel.setText("Invalid username or Password");
        }
    }

}
