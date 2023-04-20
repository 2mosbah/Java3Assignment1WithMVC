/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class LoginPage extends Stage {

    public LoginPage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass()
                .getResource("C:\\Users\\PC\\OneDrive\\Documents\\Design Pattern\\Java_3_Lab-Assignment 1\\src\\view\\fxml\\login.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        this.setTitle("login Page");
        this.setScene(scene);
        this.show();
    }

}
