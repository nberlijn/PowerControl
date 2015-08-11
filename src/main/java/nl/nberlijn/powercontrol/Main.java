package nl.nberlijn.powercontrol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import nl.nberlijn.powercontrol.config.GUI;

public final class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(GUI.VIEWS_DIR + GUI.MAIN_FILE));

        primaryStage.setResizable(false);
        primaryStage.setTitle(GUI.TITLE);
        primaryStage.setScene(new Scene(root, GUI.WIDTH, GUI.HEIGHT));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
