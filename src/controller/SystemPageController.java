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
import javafx.scene.control.TextField;
import view.ViewManager;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class SystemPageController implements Initializable {

    @FXML
    private Button logoutBtn;
    @FXML
    private Label usdLabel;
    @FXML
    private TextField usdtxt;
    @FXML
    private Label invalidInput;
    @FXML
    private Label toLabel;
    @FXML
    private Button convertLabel;
    @FXML
    private Label nisLabel;
    @FXML
    private TextField nistxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logoutBtnHandle(ActionEvent event) throws IOException {

        ViewManager.closeSystemPage();
        ViewManager.openLoginPage();
    }

    @FXML
    private void usdtxtHandle(ActionEvent event) {
    }

    @FXML
    private void convertLabelHandle(ActionEvent event) {

        String dollarsString = usdtxt.getText();
        String shekelsString = nistxt.getText();
        double dollars = 0.0;
        double shekels = 0.0;
        try {
            if (!dollarsString.isEmpty()) {

                dollars = Double.parseDouble(dollarsString);
                shekels = dollars * 3.2;
                nistxt.setText(shekels + "");

            } else if (!shekelsString.isEmpty()) {
                shekels = Double.parseDouble(shekelsString);
                dollars = shekels / 3.2;
                usdtxt.setText(dollars + "");

            }
        } catch (NumberFormatException e) {
            invalidInput.setText("Invalid Input");
        }
    }

    @FXML
    private void nistxtHandle(ActionEvent event) {
    }

}
