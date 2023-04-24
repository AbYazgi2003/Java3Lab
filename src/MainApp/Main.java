package MainApp;


import javafx.application.Application;
import javafx.stage.Stage;
import Model.ViewManager;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
    ViewManager.openLoginPage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}