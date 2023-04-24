
package Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class loginStage extends Stage{

    public loginStage() throws IOException{ 
 FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/LoginScreen.fxml"));
 Parent root = loader.load();
 Scene scene = new Scene(root);
 this.setTitle("Login");
 this.setScene(scene);
 }
    
}

