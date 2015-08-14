package nl.nberlijn.powercontrol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import nl.nberlijn.powercontrol.config.GUI;
import nl.nberlijn.powercontrol.config.Views;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(Views.MAIN_VIEW_FILE_PATH));

        primaryStage.setResizable(false);
        primaryStage.setTitle(GUI.MAIN_TITLE);
        primaryStage.setScene(new Scene(root, GUI.MAIN_WIDTH, GUI.MAIN_HEIGHT));
        primaryStage.show();
    }

}
