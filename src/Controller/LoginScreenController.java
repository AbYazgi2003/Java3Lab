/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import Model.ViewManager;
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

/**
 * FXML Controller class
 *
 * @author user
 */
public class LoginScreenController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private TextField UserNameTextFiled;
    @FXML
    private PasswordField PassWordTextFiled;
    @FXML
    private Label status;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginScreenAction(ActionEvent event) throws IOException {
     if(UserNameTextFiled.getText().equalsIgnoreCase("user") && PassWordTextFiled.getText().equals("123")){
    ViewManager.openMainPage();
    ViewManager.closeLoginPage();
   
    }else{
    status.setText("Invalid User");
    }     
    }
    
}
