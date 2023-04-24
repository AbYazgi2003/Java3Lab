/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Model.ViewManager;
/**
 * FXML Controller class
 *
 * @author user
 */
public class SystemPageController implements Initializable {

    @FXML
    private TextField dollerTextFiled;
    @FXML
    private TextField NisTextFiled;
    
    @FXML
    private  Button LogOutButton;
    
    @FXML
    private Button convertButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void logoutAction(ActionEvent event) throws Exception{
    ViewManager.closeMainPage();
    ViewManager.openLoginPage();
    }

    @FXML
    private void convertAction(ActionEvent event) {
    if(NisTextFiled.getText().isEmpty()){
     double usd = Double.parseDouble(dollerTextFiled.getText());
     double nis = usd * 3.60;
     NisTextFiled.setText(String.valueOf(nis));
     dollerTextFiled.setText("");    
    }else if(dollerTextFiled.getText().isEmpty() ){
     double nis = Double.parseDouble(NisTextFiled.getText());
     double usd = nis / 3.60;
     dollerTextFiled.setText(String.valueOf(usd));
     NisTextFiled.setText("");   
    }    
        
        
    }
    
}
