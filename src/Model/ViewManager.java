package Model;

import java.io.IOException;


public class ViewManager {

    static loginStage log;
    static MainScreenStage main;
    public ViewManager(){}
    public static void openLoginPage() throws IOException {
        if (log == null){
            log = new loginStage();
            log.show();
        }else
            log.show();
    }
    
    public static void openMainPage() throws IOException {
        if (main == null){
            main = new MainScreenStage();
            main.show();
        }else
            main.show();
    }
    
    public static void closeLoginPage() {
        if (log != null){
            log.close();
        }
    }
    
    public static void closeMainPage() {
        if (main != null){
            main.close();
        }
    }
}    

