package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main extends Application {
    //static Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
    //private static final int WIDTH = sSize.width;
    //private static final int HEIGHT = sSize.height;;
    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new FXMLLoader(Main.class.getResource("/Main.fxml")).load();
        stage.setTitle("SpaceInvaders");
        stage.setScene(scene);

        //stage.setHeight(HEIGHT);
        //stage.setWidth(WIDTH);
        stage.setHeight(600);
        stage.setWidth(800);
        stage.setFullScreen(false);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}